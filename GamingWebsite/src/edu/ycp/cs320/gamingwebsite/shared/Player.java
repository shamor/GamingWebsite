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
	
	public Player(){
		this.x = 450;
		this.y = 350;
		this.dx = 0;
		this.dy = 0;
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
	
	 public void collision(double x, double y){
		 	
		 // re- init
		 setDirection(true, true, true, true);
		 	
	 	dx = 0;
	 	dy = 0;
	 	
		if(x <=485  && y <= 655 && y >=20 && x >=320){
			if(Up){
				if(y == 21){
					setDirection(false, true, true, true);
				}else{
					setDirection(true, true, true, true);
				}
			}else if(down){
				if(y <= 654){
					setDirection(true, false, true, true);
				}else{
					setDirection(true, true, true, true);
				}
			}else if(left){
				if(x >= 321){
					setDirection(true, true, false, true);
				}else{
					setDirection(true, true, true, true);
				}
			}else if(right){
				if(x <= 484){
					setDirection(true, true, true, false);
				}else{
					setDirection(true, true, true, true);
				}
			}else{}

		}
		else{
			if((y>= 290 && y <=340) && (x>=20 && x<=610)){
				if(Up){
					if(y <= 341){
						setDirection(false, true, true, true);
					}else{
						setDirection(true, true, true, true);
					}
				}else if(down){
					if(y >= 289){
						setDirection(true, false, true, true);
					}else{
						setDirection(true, true, true, true);
					}
				}else if(left){
					if(x>=21){
						setDirection(true, true, false, true);
					}else{
						setDirection(true, true, true, true);
					}
				}else if(right){
					if(x<=610){
						setDirection(true, true, true, false);
					}else{
						setDirection(true, true, true, true);
					}
				}else{}
			}else{
				
			}
//			else{
//				setDirection(false, false, false, false);
//				dx = 0;
//				dy = 0;
//			}
		}
		 
		 
//		 // left wall
//		 if(x == 25){
//			 left = false;
//		 }
//		 // left wall of first building
//		 else if((x == 320)){
//			 if((y <= 320)){
//				 setDirection(true, true, false, true);
//			 }else if((y >= 395)){
//				 setDirection(true, true, false, true);
//			 }else{
//				 setDirection(true, true, false, true);
//			 }
//		 }
//		 // bottom wall of first building
//		 else if(y == 320){
//			 if(x <= 320){
//				 Up = false;
//				 right = true;
//				 left = true;
//				 down = true;
//			 }else if(x >= 485){
//				 Up = false;
//				 right = true;
//				 left = true;
//				 down = true;
//			 }else{
//				 Up = true;
//			 }
//		 }
//		 // top of the board
//		 else if(y == 20){
//			 Up = false;
//		 }
//		 // right wall of the second building and fourth building
//		 else if(x == 485){
//			 if(y <= 320){
//				 right = false;
//			 }else if(y >= 395){
//				 right = false;
//			 }else{
//				 right = true;
//			 }
//		 }
//		 // bottom of the screen
//		 else if(y == 655){
//			 if(right == false || left==false){
//				  down = false;
//			 }else{
//				 down = false;
//			 }
//			
//		 }
//		 // right of the screen
//		 else if(x == 815){
//			 if(y == 320){
//				 right = false;
//				 Up = false;
//			 }else if(y == 395){
//				 right = false;
//				 down = false;
//			 }else{
//				right = false;
//			 } 
//		 }
//		 // top wall of the third and fourth building
//		 else if(y == 395){
//			 if(x >= 490){
//				 down = false;
//			 }else if(x <= 315){
//				 down = false;
//			 }else{
//				 down = true;
//			 }
//		 }
//		 // if none than all true
//		 else{
//			 right = true;
//			 Up = true;
//			 left = true;
//			 down = true;
//		 }
	 }
}
