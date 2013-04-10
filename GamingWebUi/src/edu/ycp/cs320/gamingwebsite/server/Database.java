package edu.ycp.cs320.gamingwebsite.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.pizza.server.DBUtil;
import edu.ycp.cs320.pizza.server.ITransaction;
import edu.ycp.cs320.pizza.server.DerbyDatabase.DatabaseConnection;
import edu.ycp.cs320.pizza.shared.Order;
import edu.ycp.cs320.pizza.shared.OrderReceipt;

public class Database implements IDatabase{
	
	// Datastore is the location of where we will put our data at.
	private static final String DATASTORE = null;

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
		//databaseRun(new ITransaction<Boolean>() {
			//@Override
			//public Boolean run(Connection conn) throws SQLException {
				
				PreparedStatement stmt = null;
				
				try {
					stmt = conn.prepareStatement(
							"create table order_receipts (" +
							"  id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), " +
							"  userinfo VARCHAR(200) NOT NULL, " +
							"  price DECIMAL(10,2) " +
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
//	public OrderReceipt placeOrder(final Order order) throws SQLException {
//		return databaseRun(new ITransaction<OrderReceipt>() {
//			@Override
//			public OrderReceipt run(Connection conn) throws SQLException {
//				PreparedStatement stmt = null;
//				ResultSet generatedKeys = null;
//				try{
//					OrderReceipt receipt = new OrderReceipt();
//					receipt.setUserInfo(order.getUser());
//					receipt.setPrice(order.getPrice());
//					
//					stmt = conn.prepareStatement(
//							"insert into order_receipts (userinfo, price) values (?, ?)",
//							PreparedStatement.RETURN_GENERATED_KEYS
//					);
//					
//					stmt.setString(1, receipt.getUserInfo());
//					stmt.setBigDecimal(2, receipt.getPrice());
//					
//					stmt.executeUpdate();
//					
//					if (!generatedKeys.next()){
//						throw new SQLException("Couldn't get generated key for order receipt");
//					}
//					
//					receipt.setId(generatedKeys.getInt(1));
//					
//					return receipt;
//				}finally{
//					DBUtil.closeQuietly(stmt);
//					DBUtil.closeQuietly(generatedKeys);
//				}
//				
//			}
//		});
//	}
	
	
	// rearrange this code so that it can get passwords
//	@Override
//	public List<OrderReceipt> getOrderReceipts() throws SQLException {
//		return databaseRun(new ITransaction<List<OrderReceipt>>() {
//			@Override
//			public List<OrderReceipt> run(Connection conn) throws SQLException {
//				PreparedStatement stmt = null;
//				ResultSet resultSet = null;
//				
//				try {
//					stmt = conn.prepareStatement("select * from order_receipts");
//					resultSet = stmt.executeQuery();
//					
//					List<OrderReceipt> result = new ArrayList<OrderReceipt>();
//					
//					while(resultSet.next()) {
//						OrderReceipt receipt = new OrderReceipt();
//						
//						receipt.setId(resultSet.getInt(1));
//						receipt.setUserInfo(resultSet.getString(2));
//						receipt.setPrice(resultSet.getBigDecimal(3));
//						
//						receipt
//					}
//				} finally {
//					DBUtil.closeQuietly(stmt);
//					DBUtil.closeQuietly(resultSet);
//				}
//			}
//		});
//	}
}
