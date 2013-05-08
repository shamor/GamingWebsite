package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.gamingwebsite.shared.Login;

public interface LoginServiceAsync {

	void findLogin(String username, String password,
			AsyncCallback<Login> callback);

	void addLogin(String username, String password,
			AsyncCallback<Login> callback);
	
	void setscore(String username, double score, AsyncCallback<Void> callback);;
}
