package edu.ycp.cs320.gamingwebsite.shared;

import java.io.Serializable;

public class Signin extends Publisher implements ISubscriber, Serializable {
	public enum Events {
		Checker
	}
	
	private int id;
	private String user;
	private String password;
	
	public Signin () {
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getUser() {
		return user;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUser(String user) {
		this.user = user;
		notifySubscribers(Events.Checker, user);
	}

	@Override
	public void eventOccured(Object key, IPublisher publisher, Object hint) {
		// TODO Auto-generated method stub
		
	}

}
