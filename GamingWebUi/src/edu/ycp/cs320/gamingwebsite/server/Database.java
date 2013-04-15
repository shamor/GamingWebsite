package edu.ycp.cs320.gamingwebsite.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.gamingwebsite.shared.*;

public class Database implements IDatabase{
	
	// Datastore is the location of where we will put our data at.
	private static final String DATASTORE = "/home/git/GamingWebsite";

	// making sure that the driver is running properly
	static { 
		try { 
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (Exception e) {
			throw new RuntimeException("Could not load Derby JDBC driver");
		}
	}
	
	public class DConnection {
		public Connection con;
		public int refCount;
	}
	
	private final ThreadLocal<DConnection> connHolder = new ThreadLocal<DConnection>();
	
	// managing database connections
	// avoid two database from using the same thread
	private DConnection getConnection() throws SQLException {
		DConnection dbConn = connHolder.get();
		// if the thread is empty
		// no data in thread already
		if (dbConn == null) {
			dbConn = new DConnection();
			dbConn.con = DriverManager.getConnection("jdbc:derby:" + DATASTORE + ";create=true");
			dbConn.refCount = 0;
			connHolder.set(dbConn);
		}
		// counter
		dbConn.refCount++;
		return dbConn;
	}
	
	// releasing the connection
	private void releaseConnection(DConnection dbConn) throws SQLException {
		dbConn.refCount--;
		if (dbConn.refCount == 0) {
			try {
				dbConn.con.close();
			} finally {
				connHolder.set(null);
			}
		}
	}
	
	private<E> E databaseRun(ITransaction<E> transaction) throws SQLException {
		DConnection dbConn = getConnection();
		
		try {
			boolean origAutoCommit = dbConn.con.getAutoCommit();
			// restoring the autocommit statement.
			try {
				// can run into a deadlock
				dbConn.con.setAutoCommit(false);
				
				return transaction.run(dbConn.con);
			} finally {
				dbConn.con.setAutoCommit(origAutoCommit);
			}
		} 
		// connection is released
		finally {
			releaseConnection(dbConn);
		}
	}
	
	void createTables() throws SQLException {
		databaseRun(new ITransaction<Boolean>() {
			@Override
			public Boolean run(Connection conn) throws SQLException {
				
				PreparedStatement stmt = null;
				
				try {
					stmt = conn.prepareStatement(
							"create table order_receipts (" +
							"  id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), " +
							"  user VARCHAR(200) NOT NULL, " +
							"  password VARCHAR(200) NOT NULL " +
							")"
					);
					
					stmt.executeUpdate();
					
				} finally {
					DBUtil.closeQuietly(stmt);
				}
				
				return true;
			}
		});
	}
	
	
	// user names
	public Login username() throws SQLException {
		return databaseRun(new ITransaction<Login>() {
			@Override
			public Login run(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet generatedKeys = null;
				try{
					Login logs = new Login();
					logs.setUserInfo(logs.getUser());
					logs.setPrice(logs.getPrice());
					
					stmt = conn.prepareStatement(
							"insert into order_receipts (userinfo, price) values (?, ?)",
							PreparedStatement.RETURN_GENERATED_KEYS
					);
					
					stmt.setString(1, receipt.getUserInfo());
					stmt.setBigDecimal(2, receipt.getPrice());
					
					stmt.executeUpdate();
					
					if (!generatedKeys.next()){
						throw new SQLException("Couldn't get generated key for order receipt");
					}
					
					receipt.setId(generatedKeys.getInt(1));
					
					return receipt;
				}finally{
					DBUtil.closeQuietly(stmt);
					DBUtil.closeQuietly(generatedKeys);
				}
				
			}
		});
	}
	
	// rearrange this code so that it can get passwords
	@Override
	public List<Login> getLogin() throws SQLException {
		return databaseRun(new ITransaction<List<Login>>() {
			@Override
			public List<Login> run(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet resultSet = null;
				
				try {
					stmt = conn.prepareStatement("select * from order_receipts");
					resultSet = stmt.executeQuery();
					
					List<Login> result = new ArrayList<Login>();
					
					while(resultSet.next()) {
						Login receipt = new Login();
						
						receipt.setId(resultSet.getInt(1));
						receipt.setUserName(resultSet.getString(2));
						receipt.setPassword(resultSet.getString(3));
						
						result.add(receipt);
					}
					
					return result;
				} finally {
					DBUtil.closeQuietly(stmt);
					DBUtil.closeQuietly(resultSet);
				}
			}
		});
	}
}
