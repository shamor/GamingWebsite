package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.gamingwebsite.shared.Login;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	public Login findLogin(String username, String password);
	
	public Login addLogin(String username, String password);

	public void setscore(String username, double score);
}
