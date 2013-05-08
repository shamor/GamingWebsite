package edu.ycp.cs320.gamingwebsite.shared;

import java.util.ArrayList;

public class User {
	private double memscore;
	private ArrayList<String> user;
	public User(String username){
		user.add(username);
	}
	
	public String getUsername() {
		return user.get(user.size() - 1);
	}
	
	public double getMemscore() {
		return memscore;
	}
	
	public void setMemscore(double memscore) {
		this.memscore = memscore;
	}
}
