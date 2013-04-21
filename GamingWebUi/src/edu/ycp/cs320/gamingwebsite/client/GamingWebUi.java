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
import com.google.gwt.user.client.ui.Widget;

import edu.ycp.cs320.gamingwebsite.shared.Player;

import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyDownEvent;



/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GamingWebUi implements EntryPoint {
//	loginView view;
//	MainWorld view2;
	 static final String unsupportedBrowser = "Your browser does not support the HTML5 Canvas";
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
	 boolean keys[] = new boolean[MAX_KEYS];
	private Timer timer;
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		  canvas = Canvas.createIfSupported();
		  // 
		  canvas.addKeyDownHandler(new KeyDownHandler() {
		  	public void onKeyDown(KeyDownEvent event) {
		  		double x = player.getX();
		  		double y = player.getY();
		  		double dx = 0;
		  		double dy = 0;
		  		
		  		if(event.isUpArrow()){
		  			dy = 1;
		  		}else if(event.isAnyModifierKeyDown()){
		  			dy = -1;
		  		}else if(event.isLeftArrow()){
		  			dx = 1;
		  		}else if(event.isRightArrow()){
		  			dx = -1;
		  		}
				
				x += dx;
				y += dy;
//				int key = event.getNativeKeyCode();
//				if(key < MAX_KEYS) {
//					GWT.log("KEY " + key);
//					keys[key] = true;
//				}
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

		  if (canvas == null) {
		        RootPanel.get().add(new Label(unsupportedBrowser));
		        return;
		  }
		  	this.player = new Player(500, 400);
		  
		  createCanvas();
		  
			timer = new Timer() {
				@Override
				public void run() {
					update();
				}
			};
	 }

	 private void createCanvas(){
	     canvas.setWidth(width + "px");
	     canvas.setHeight(height + "px");
	     canvas.setCoordinateSpaceWidth(width);
	     canvas.setCoordinateSpaceHeight(height);
	
	     RootPanel.get().add(canvas);
	     context = canvas.getContext2d();
	     context.beginPath();
	     context.setFillStyle(colorBlue);
	     context.arc(player.getX(), player.getY(), 10, 0, 2.0 * Math.PI, true);
	     img = (ImageElement) new Image("CardImage/Mainworld.jpg").getElement().cast();
	     // drawing the image
	     context.drawImage(img, 0, 0, 1000, 800);
	     context.closePath();
	     context.fill();
	     
	 }
	 
	 public void update(){
		double dx = 0;
		double dy = 0;
	 	if(keys['w']) {
			dy = 1;
		}
		if(keys['d']) {
			dx = 1;
		}
		if(keys['a']) {
			dx = -1;
		}
		if(keys['s']) {
			dx = -1;
		}
		
		double x = player.getX();
		double y = player.getY();
		
		x += dx;
		y += dy;
//	     context.beginPath();
//	     context.setFillStyle(colorBlue);
//	     context.arc(player.getX(), player.getY(), 10, 0, 2.0 * Math.PI, true);
//		     context.closePath();
//		     context.fill();

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

