package edu.ycp.cs320.gamingwebsite.shared;

public class Player {
	private double x;
	private double y;
	private double dx;
	private double dy;
	 private boolean contact;
	
	public Player(){
		this.x = 450;
		this.y = 350;
		this.dx = 0;
		this.dy = 0;
		this.contact = false;
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
	
	public boolean getcontact() {
		return contact;

	}
	
	public void collision(double x, double y, double dx, double dy){
		//x = 360 reached the left side of the right buildings, y = 40 for top of screen
		//y = 415 for top of bottom buildings, x = 610 for the right of screen
		//y = 290 for bottom of top buildings, y = 590 for bottom of screen,x = 20 for the left of screen
		//x = 260 for the right side of the left buildings
		
		
		if(x <= 487 && y <= 652 && y >=24 && x >=320){
			setX(x);
			setY(y);
		}
		else{
			if((y>= 314 && y <=395) && (x>=25 && x<=815)){
				setX(x);
				setY(y);
				if (enterRoomMem()== true){
					contact = true;
				}
				else{
					contact = false; 
				}
				
			}
			else{
				x -= dx;
				y -= dy;
				setX(x);
				setY(y);
			}
		}
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
			
	}}
	 

