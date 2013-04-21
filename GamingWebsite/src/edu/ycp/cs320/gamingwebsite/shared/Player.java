package edu.ycp.cs320.gamingwebsite.shared;

public class Player {
	private double x;
	private double y;
	
	public Player(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void update(double dx, double dy){
		x += dx;
		y += dy;
	}
}
