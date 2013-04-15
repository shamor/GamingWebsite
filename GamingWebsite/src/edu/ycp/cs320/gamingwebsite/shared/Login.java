package edu.ycp.cs320.gamingwebsite.shared;

import java.io.Serializable;

import edu.ycp.cs320.pizza.shared.IPublisher;
import edu.ycp.cs320.pizza.shared.PizzaPriceController;

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
	private int score;
	
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
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
//	@Override
//	public void eventOccurred(Object key, IPublisher publisher, Object hint) {
//		PizzaPriceController controller = new PizzaPriceController();
//		setPrice(controller.calcPrice(pizza));
//	}
}
