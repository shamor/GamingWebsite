package edu.ycp.cs320.gamingwebsite.client;




import com.google.gwt.user.client.ui.Composite;

import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.NumberLabel;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import edu.ycp.cs320.gamingwebsite.shared.Player;




public class MainWorld extends Composite{
	static final int height = 800;
	static final int width = 1000;
	final CssColor colorRed = CssColor.make("red");
	final CssColor colorGreen = CssColor.make("green");
	final CssColor colorBlue = CssColor.make("blue");

	private Canvas canvas;
	private Context2d context;

	private Player player;
	private int MAX_KEYS;
	private ImageElement img;
	private boolean keys[];
	private Timer timer;
	private NumberLabel<Double> numberLabel_1;
	private NumberLabel<Double> numberLabel;
	private ImageElement img2;
	private  LayoutPanel layoutPanel;
	private int avieX;
	private int avieY;

	public MainWorld(){

		
		this.avieX = 360; 
		this.avieY = 590; 	
		

		MAX_KEYS = 256;
		keys = new boolean[MAX_KEYS];
		canvas = Canvas.createIfSupported();
		//this.player = new Player();
		if (canvas == null) {
			return;
		}

		


		layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);

		// Use a FocusPanel to allow the canvas to process user input events
		FocusPanel focusPanel = new FocusPanel();
		layoutPanel.add(focusPanel);
		
		canvas.setSize("900px", "625px");
		canvas.setCoordinateSpaceWidth(width);
		canvas.setCoordinateSpaceHeight(height);
		canvas.setFocus(true);

		
		focusPanel.add(canvas);
		


		numberLabel = new NumberLabel<Double>();
		layoutPanel.add(numberLabel);
		layoutPanel.setWidgetLeftWidth(numberLabel, 0.0, Unit.PX, 765.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(numberLabel, 0.0, Unit.PX, 471.0, Unit.PX);

		numberLabel_1 = new NumberLabel<Double>();
		layoutPanel.add(numberLabel_1);
		layoutPanel.setWidgetLeftWidth(numberLabel_1, 0.0, Unit.PX, 765.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(numberLabel_1, 46.0, Unit.PX, 471.0, Unit.PX);

		canvas.addKeyDownHandler(new KeyDownHandler(){
			public void onKeyDown(KeyDownEvent event) {
				int key = event.getNativeKeyCode();
				if(key < MAX_KEYS) {
					GWT.log("KEY " + key);
					keys[key] = true;
					timer.scheduleRepeating(5);
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

		player = new Player();
		
		timer = new Timer(){
			  @Override
			  public void run(){
				  update();
				  render();
			  }
	  };
	  timer.scheduleRepeating(5);
	}

	public void render(){
		context = canvas.getContext2d();
		context.beginPath();
		//   context.setFillStyle(colorBlue);
		//   context.arc(player.getX(), player.getY(), 20, 0, 2.0 * Math.PI, true);

		img = (ImageElement) new Image("CardImage/Mainworld.jpg").getElement().cast();
		// drawing the image
		context.drawImage(img, 0, 0, 1000, 800);
		img2 = (ImageElement) new Image("CardImage/manlymen.jpg").getElement().cast();
		// drawing the image
		context.drawImage(img2, player.getX(), player.getY(), 60, 50);
		//   context.setFillStyle(colorBlue);
		//   context.rect(20, 20, 295, 295);
		context.closePath();
		//   context.fill();
	}

	public void update(){		 
		double dx = 0;
		double dy = 0;

		player.collision(player.getX(), player.getY());
		double x = player.getX();
		double y = player.getY();

		// w
		if(keys[87]) {
			if(player.getUp()){
				dy = -1;
			}else{}
		}
		// d
		if(keys[68]) {
			if(player.getright()){
				dx = 1;
			}else{}
		}
		//a
		if(keys[65]) {
			if(player.getleft()){
				dx = -1;
			}else{}
		}
		//s
		if(keys[83]) {
			if(player.getdown()){
				dy = 1;
			}else{
			}
		}

		x += dx;
		y += dy;

		player.setX(x);
		player.setY(y);

		render();

		numberLabel.setValue(x);
		numberLabel.setVisible(true);

		numberLabel_1.setValue(y);
		numberLabel_1.setVisible(true);
	}
	public void moveAvatar(int x, int y){
		//x = 360 reached the left side of the right buildings, y = 40 for top of screen
		//y = 415 for top of bottom buildings, x = 610 for the right of screen
		//y = 290 for bottom of top buildings, y = 590 for bottom of screen,x = 20 for the left of screen
		//x = 260 for the right side of the left buildings

		avieX += x;
		avieY +=y;
		if(avieX <= 360 && avieY <= 590 && avieY >=40 && avieX >=260){
//			layoutPanel.setWidgetLeftWidth(avie, avieX, Unit.PX, 73.0, Unit.PX);
//			layoutPanel.setWidgetTopHeight(avie, avieY, Unit.PX, 55.0, Unit.PX);
//			
		}
		else{
			if((avieY>= 290 && avieY <=340) && (avieX>=20 && avieX<=610)){
//				layoutPanel.setWidgetLeftWidth(avie, avieX, Unit.PX, 73.0, Unit.PX);
//				layoutPanel.setWidgetTopHeight(avie, avieY, Unit.PX, 55.0, Unit.PX);
			}
			else{
				avieX-= x;
				avieY-= y; 
			}
		}


}}
