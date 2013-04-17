package edu.ycp.cs320.gamingwebsite.server;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.gamingwebsite.shared.Login;

public class FakeDatabase implements IDatabase {
	private List<Login> loginList;
	
	public FakeDatabase() {
		this.loginList = new ArrayList<Login>();
		
		Login user1 = new Login();
		user1.setPassword("abc");
		user1.setUserName("alice");
		
		Login user2 = new Login();
		user2.setPassword("def");
		user2.setUserName("bob");
		
		loginList.add(user1);
		loginList.add(user2);
	}

	@Override
	public List<Login> getLogin() throws SQLException {
		return new ArrayList<Login>(loginList);
	}
	
	// makign
	@Override
	public Login findLogin(String username, String password) {
		for (Login user : loginList) {
			if (user.getUser().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null; // no such user
	}

}
