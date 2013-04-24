package edu.ycp.cs320.gamingwebsite.shared;

public class Player {
	private double x;
	private double y;
	 private boolean Up;
	 private boolean down;
	 private boolean left;
	 private boolean right;
	
	public Player(){
		this.x = 500;
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
	
	 public void collision(double x, double y){
		 // left wall
		 if(x == 25){
			 left = false;
		 }
		 // left wall of first building
		 else if((x == 320)){
			 if((y <= 320)){
				  left = false;
			 }else if((y >= 395)){
				 left = false;
			 }else{
				 left = true;
			 }
		 }
		 // bottom wall of first building
		 else if(y == 320){
			 if(x <= 320){
				 Up = false;
			 }else if(x >= 485){
				 Up = false;
			 }else{
				 Up = true;
			 }
		 }
		 // top of the board
		 else if(y == 20){
			 Up = false;
		 }
		 // right wall of the second building and fourth building
		 else if(x == 485){
			 if(y <= 320){
				 right = false;
			 }else if(y >= 395){
				 right = false;
			 }else{
				 right = true;
			 }
		 }
		 // bottom of the screen
		 else if(y == 655){
			 down = false;
		 }
		 // right of the screen
		 else if(x == 815){
			 if(y == 320){
				 right = false;
				 Up = false;
			 }else if(y == 395){
				 right = false;
				 down = false;
			 }else{
				right = false;
			 } 
		 }
		 // top wall of the third and fourth building
		 else if(y == 395){
			 if(x >= 490){
				 down = false;
			 }else if(x <= 315){
				 down = false;
			 }else{
				 down = true;
			 }
		 }
		 // if none than all true
		 else{
			 right = true;
			 Up = true;
			 left = true;
			 down = true;
		 }
	 }
}
