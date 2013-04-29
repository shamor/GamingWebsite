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
	private double dx;
	private double dy;
	
	public MainWorld(){

		
		this.avieX = 360; 
		this.avieY = 590; 	
		this.dx = 0;
		this.dy = 0;

		MAX_KEYS = 256;
		keys = new boolean[MAX_KEYS];
		canvas = Canvas.createIfSupported();
		//this.player = new Player();
		if (canvas == null) {
			return;
		}

		layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);

		layoutPanel.setSize("921px", "658px");

		layoutPanel.setSize("1080px", "844px");


		// Use a FocusPanel to allow the canvas to process user input events
		FocusPanel focusPanel = new FocusPanel();
		layoutPanel.add(focusPanel);
		
		layoutPanel.setWidgetLeftWidth(focusPanel, 0.0, Unit.PX, 1142.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(focusPanel, 0.0, Unit.PX, 931.0, Unit.PX);
		canvas.setSize("951px", "698px");
		
		canvas.setCoordinateSpaceWidth(width);
		canvas.setCoordinateSpaceHeight(height);
		canvas.setFocus(true);
		
		focusPanel.add(canvas);

		numberLabel = new NumberLabel<Double>();
		numberLabel.setStyleName("Main Game");
		layoutPanel.add(numberLabel);
		
		layoutPanel.setWidgetLeftWidth(numberLabel, 0.0, Unit.PX, 144.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(numberLabel, 0.0, Unit.PX, 34.0, Unit.PX);
		layoutPanel.setWidgetLeftWidth(numberLabel, 0.0, Unit.PX, 153.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(numberLabel, 0.0, Unit.PX, 23.0, Unit.PX);

		numberLabel_1 = new NumberLabel<Double>();
		numberLabel_1.setStyleName("Main Game");
		layoutPanel.add(numberLabel_1);
		
		layoutPanel.setWidgetLeftWidth(numberLabel_1, 0.0, Unit.PX, 144.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(numberLabel_1, 46.0, Unit.PX, 29.0, Unit.PX);
	
		layoutPanel.setWidgetLeftWidth(numberLabel_1, 0.0, Unit.PX, 153.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(numberLabel_1, 46.0, Unit.PX, 23.0, Unit.PX);

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
		
		render();
		
		timer = new Timer(){
			  @Override
			  public void run(){
				  update();
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
		 dx = 0;
		 dy = 0;

		double x = player.getX();
		double y = player.getY();

		// w
		if(keys[87]) {
			dy = -1;
		}
		// d
		if(keys[68]) {
			dx = 1;
		}
		//a
		if(keys[65]) {
			dx = -1;
		}
		//s
		if(keys[83]) {
			dy = 1;
		}


		x += dx;
		y += dy;
		
		if(x <= 487 && y <= 652 && y >=24 && x >=320){
			player.setX(x);
			player.setY(y);
		}
		else{
			if((y>= 314 && y <=395) && (x>=25 && x<=815)){
				player.setX(x);
				player.setY(y);
			}
			else{
				x -= dx;
				y -= dy;
				player.setX(x);
				player.setY(y);
			}
		}

		render();

		numberLabel.setValue(x);
		numberLabel.setVisible(true);

		numberLabel_1.setValue(y);
		numberLabel_1.setVisible(true);
	}

}
