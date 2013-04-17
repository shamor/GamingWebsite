package edu.ycp.cs320.gamingwebsite.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.gamingwebsite.client.LoginService;
import edu.ycp.cs320.gamingwebsite.shared.Login;

public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {

	@Override
	public Login findLogin(String username, String password) {
		return DBUtil.instance().findLogin(username, password);
	}

}
