package edu.ycp.cs320.gamingwebsite.shared;

public class Player {
	private double x;
	private double y;
	private double dx;
	private double dy;
	 private boolean Up;
	 private boolean down;
	 private boolean left;
	 private boolean right;
	 private boolean enter;
	
	public Player(){
		this.x = 450;
		this.y = 350;
		this.dx = 0;
		this.dy = 0;
		Up = false;
		down = false;
		left = false;
		right = false;
		enter = false;
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
	
	public void setDirection(boolean up, boolean down, boolean left, boolean right){
		this.Up = up;
		this.down = down;
		this.left = left;
		this.right = right;
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
	
	public double getDx() {
		return dx;
	}
	
	public double getDy() {
		return dy;
	}
	
	public void enterRoom(double x, double y, boolean enter){
		if((x>683 && x<735) && y == 314){
			enter = true;
		}else{
			enter = false;
		}
	}
}
