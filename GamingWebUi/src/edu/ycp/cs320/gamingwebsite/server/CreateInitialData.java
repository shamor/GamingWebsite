package edu.ycp.cs320.gamingwebsite.server;

import java.sql.SQLException;

public class CreateInitialData {
	// creating a table of data
	public static void main(String[] args) throws SQLException {
		// creating multiple data entries.
		FakeDatabase db = new FakeDatabase();
		
		db.addLogin("alice", "abc");
		db.addLogin("bob", "def");
		
		System.out.println("Successfully created tables");
	}
}
