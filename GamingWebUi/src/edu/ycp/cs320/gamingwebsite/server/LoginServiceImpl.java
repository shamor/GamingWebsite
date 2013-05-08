package edu.ycp.cs320.gamingwebsite.server;

import java.sql.SQLException;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.gamingwebsite.client.LoginService;
import edu.ycp.cs320.gamingwebsite.shared.Login;

@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {

	@Override
	public Login findLogin(String username, String password) {
		return DBUtil.instance().findLogin(username, password);
	}
	
	@Override
	public Login addLogin(String username, String password) {
		try {
			return DBUtil.instance().addLogin(username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void setscore(String username, double score) {
		try {
			System.out.println("Setting score for " + username + " to " + score);
			DBUtil.instance().setscore(username, score);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
