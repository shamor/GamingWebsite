package edu.ycp.cs320.gamingwebsite.shared;

import java.io.Serializable;

/**
 * This class should include any instructions for the user logging in
 * requires, login, logout, and password instructions
 * @author shamor1, codyhh09
 *
 */
public class Login implements Serializable{
	private static final long serialVerion = 1L;
	
	private int id;
	private String user;
	private String password;
	
	public Login() {
		
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setUserName(String user){
		this.user = user;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
}
