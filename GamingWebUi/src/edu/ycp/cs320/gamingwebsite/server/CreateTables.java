package edu.ycp.cs320.gamingwebsite.server;

import java.sql.SQLException;

public class CreateTables {
	// creating a table of data
	public static void main(String[] args) throws SQLException {
		// creating multiple data entries.
		Database db = new Database();
		db.createTables();
		System.out.println("Successfully created tables");
	}
}
