package edu.ycp.cs320.gamingwebsite.shared;

public class Player {
	private double x;
	private double y;
	 private boolean Up;
	 private boolean down;
	 private boolean left;
	 private boolean right;
	
	public Player(){
		this.x = 450;
		this.y = 350;
		Up = false;
		down = false;
		left = false;
		right = false;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public boolean getUp() {
		return Up;
	}
	
	public boolean getdown() {
		return down;
	}
	
	public boolean getleft() {
		return left;
	}
	
	public boolean getright() {
		return right;
	}
	/**
	 * This method returns true if the player is about to enter a room
	 * @return true if about to answer, else false
	 */
	public boolean enterRoomMem(){
		//room will be entered if x is between 680-734 and y == 314
		if(y == 314){
			if(x >=680 && x<=734 ){
				return true; 
			}else{
			return false;
			}
		}
		else{
			return false;
		}
			
	}
	 
}
