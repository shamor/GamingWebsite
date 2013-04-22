package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;

import edu.ycp.cs320.gamingwebsite.shared.Player;

import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.user.client.ui.NumberLabel;



/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GamingWebUi implements EntryPoint {
//	loginView view;
//	MainWorld view2;
	 static final int height = 800;
	 static final int width = 1000;
	 final CssColor colorRed = CssColor.make("red");
	 final CssColor colorGreen = CssColor.make("green");
	 final CssColor colorBlue = CssColor.make("blue");
	 Canvas canvas;
	 Context2d context;
	 
	 private Player player;
	 private int MAX_KEYS = 256;
	 private ImageElement img;
	 private boolean keys[] = new boolean[MAX_KEYS];
	 private Timer timer;
	 private NumberLabel<Double> numberLabel_1;
	 private NumberLabel<Double> numberLabel;
	 private boolean Up;
	 private boolean down;
	 private boolean left;
	 private boolean right;
	private ImageElement img2;
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		  canvas = Canvas.createIfSupported();
		  this.player = new Player();
		  if (canvas == null) {
		        return;
		  }
		  
		  
		  canvas.addKeyDownHandler(new KeyDownHandler() {
		  	public void onKeyDown(KeyDownEvent event) {
				int key = event.getNativeKeyCode();
				if(key < MAX_KEYS) {
					//GWT.log("KEY " + key);
					keys[key] = true;
					canvas.setFocus(true);
					timer.scheduleRepeating(20);
				}
		  	}
		  });
		  
		  canvas.addKeyUpHandler(new KeyUpHandler() {
		  	public void onKeyUp(KeyUpEvent event) {
				int key = event.getNativeKeyCode();
				if(key < MAX_KEYS) {
					keys[key] = false;
				}
		  	}
		  });
		  
		  this.left = true;
		  this.Up = true;
		  this.down = true;
		  this.right = true;

		  createCanvas();
		  render(canvas.getContext2d());
		  
		  timer = new Timer(){
				  @Override
				  public void run(){
					  
					  update(player.getX(), player.getY(), canvas.getContext2d());
					  
				  }
			
		  };
		 
		  

	 }

	 private void createCanvas(){
	     canvas.setSize("900px", "625px");
	     canvas.setCoordinateSpaceWidth(width);
	     canvas.setCoordinateSpaceHeight(height);
	     RootPanel rootPanel = RootPanel.get();
	     rootPanel.add(canvas, 0, 0);
	     
	     numberLabel = new NumberLabel<Double>();
	     rootPanel.add(numberLabel, 25, 20);
	     
	     numberLabel_1 = new NumberLabel<Double>();
	     rootPanel.add(numberLabel_1, 25, 44);
	 }
	 
	 public void render(Context2d context){
	     context = canvas.getContext2d();
	     context.beginPath();
//	     context.setFillStyle(colorBlue);
//	     context.arc(player.getX(), player.getY(), 20, 0, 2.0 * Math.PI, true);

	     img = (ImageElement) new Image("CardImage/Mainworld.jpg").getElement().cast();
	     // drawing the image
	     context.drawImage(img, 0, 0, 1000, 800);
	     img2 = (ImageElement) new Image("CardImage/manlymen.jpg").getElement().cast();
	     // drawing the image
	     context.drawImage(img2, player.getX(), player.getY(), 60, 50);
	     context.closePath();
	    // context.fill();
	 }
	 
	 public void update(double x, double y, Context2d context){		 
		 double dx = 0;
		 double dy = 0;
		 
		 collision(x, y);
		 // w
	 	if(keys[87]) {
	 		if(Up){
	 			dy = -1;
	 		}else{}
		}
	 	// d
		if(keys[68]) {
			if(right){
				dx = 1;
			}else{}
		}
		//a
		if(keys[65]) {
			if(left){
				dx = -1;
			}else{}
		}
		//s
		if(keys[83]) {
			if(down){
				dy = 1;
			}else{
			}
		}

		x += dx;
		y += dy;
		
		player.setX(x);
		player.setY(y);
		
		render(context);
		
		numberLabel.setValue(x);
		numberLabel.setVisible(true);
		
		numberLabel_1.setValue(y);
		numberLabel_1.setVisible(true);
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
			 }else if(x >= 395){
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
//		RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
//		
//		view = new loginView();
//		view2 = new MainWorld();
//
//		rootLayoutPanel.add(view2);
//		RootLayoutPanel.get().setWidgetTopBottom(view2, 0.0, Unit.PX, 0.0, Unit.PX);
//		RootLayoutPanel.get().setWidgetLeftRight(view2, 0.0, Unit.PX, 0.0, Unit.PX);
//	} 

