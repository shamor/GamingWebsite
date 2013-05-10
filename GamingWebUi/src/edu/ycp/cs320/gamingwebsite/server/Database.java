package edu.ycp.cs320.gamingwebsite.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.gamingwebsite.shared.ITransaction;
import edu.ycp.cs320.gamingwebsite.shared.Login;

public class Database implements IDatabase{
	
	// Datastore is the location of where we will put our data at.
	private static final String DATASTORE = "H:/GamingWebsite";

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
							"create table logins (" +
							"  id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), " +
							"  username VARCHAR(200) NOT NULL, " +
							"  password VARCHAR(200) NOT NULL, " +
							"  memscore DOUBLE " +
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

	@Override
	public List<Login> getLogin() throws SQLException {
		return databaseRun(new ITransaction<List<Login>>() {
			@Override
			public List<Login> run(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet resultSet = null;

				try {
					stmt = conn.prepareStatement("select * from logins");
					resultSet = stmt.executeQuery();

					List<Login> result = new ArrayList<Login>();

					while(resultSet.next()) {
						Login login = new Login();

						login.setId(resultSet.getInt(1));
						login.setUserName(resultSet.getString(2));
						login.setPassword(resultSet.getString(3));
						login.setMemscore(resultSet.getDouble(4));

						result.add(login);
					}

					return result;
				} finally {
					DBUtil.closeQuietly(stmt);
					DBUtil.closeQuietly(resultSet);
				}
			}
		});
	}

	@Override
	public Login findLogin(final String username, final String password) {	
		try {
			return databaseRun(new ITransaction<Login>() {
				@Override
				public Login run(Connection conn) throws SQLException {
					List<Login> logs;
					logs = getLogin();
					
					for(Login user : logs){
						if (user.getUser().equals(username) && user.getPassword().equals(password)) {
							return user;
						}
					}
					return null; // no such user
				}
			});
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception adding user to database", e);
		}
		
		// TODO "select * from logins where username = ? and password = ?"
	}
	
	@Override
	public Login addLogin(final String username, final String password) throws SQLException {
		
		try {
			return databaseRun(new ITransaction<Login>() {
				@Override
				public Login run(Connection conn) throws SQLException {
					// TODO: create Login object, insert its data into the database
					PreparedStatement stmt = null;
					ResultSet keys = null;
					try {
						Login login = new Login();
						login.setUserName(username);
						login.setPassword(password);
						
						stmt = conn.prepareStatement(
								"insert into logins (username, password) values (?, ?)",
								PreparedStatement.RETURN_GENERATED_KEYS
						);
						stmt.setString(1, username);
						stmt.setString(2, password);
						
						stmt.executeUpdate();
						
						keys = stmt.getGeneratedKeys();
						if (!keys.next()) {
							throw new SQLException("Can't happen: no generated key for inserted login");
						}
						login.setId(keys.getInt(1));
					
						return login;
					} catch (SQLException e) {
						throw new RuntimeException("SQLException inserting login", e);
					}
				}
			});
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception adding user to database", e);
		}
	}
	
	// TODO: we need to get the username from the loginView
	
	public void setscore(final String username, final double score) throws SQLException {
		databaseRun(new ITransaction<Boolean>() {
			@Override
			public Boolean run(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet keys = null;

				try {					
					stmt = conn.prepareStatement("update logins " +
							" set memscore = ?" +
							" where username = ? "  // FIXME:+  security issue
							//" AND ? < memscore"     // only update score if new score is higher
							);
					
					stmt.setDouble(1, score);
					stmt.setString(2,  username);
					//stmt.setDouble(3, score);
					
					stmt.executeUpdate();

					return true;
				} finally {
					DBUtil.closeQuietly(stmt);
					DBUtil.closeQuietly(keys);
				}
			}
		});
	}
}
