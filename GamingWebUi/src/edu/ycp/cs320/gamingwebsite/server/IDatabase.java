package edu.ycp.cs320.gamingwebsite.server;

import java.sql.SQLException;
import java.util.List;

import edu.ycp.cs320.gamingwebsite.shared.Login;

public interface IDatabase {
	// creating a method for any use of data like passwords or highscore.
	public List<Login> getLogin() throws SQLException;
	
	public Login findLogin(String username, String password);
	
	public Login addLogin(String username, String password) throws SQLException;
	
	public void setscore(String username, double score) throws SQLException;
}
