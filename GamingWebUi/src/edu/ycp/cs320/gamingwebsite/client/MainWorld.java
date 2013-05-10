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
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;




public class MainWorld extends Composite{
	static final int height = 800;
	static final int width = 1000;

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

	private double dx;
	private double dy;
	private Button scoresbtn;
	private Button membtn;
	private MemView memview; 
	
	public MainWorld(String username){

		
		this.dx = 0;
		this.dy = 0;

		memview = new MemView(username);
		
		MAX_KEYS = 256;
		keys = new boolean[MAX_KEYS];
		canvas = Canvas.createIfSupported();
	
		if (canvas == null) {
			return;
		}

		layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("1174px", "918px");




		// Use a FocusPanel to allow the canvas to process user input events
		FocusPanel focusPanel = new FocusPanel();
		layoutPanel.add(focusPanel);

		layoutPanel.setWidgetLeftWidth(focusPanel, 0.0, Unit.PX, 960.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(focusPanel, 0.0, Unit.PX, 682.0, Unit.PX);
		canvas.setSize("951px", "646px");
		
		canvas.setCoordinateSpaceWidth(width);
		canvas.setCoordinateSpaceHeight(height);
		canvas.setFocus(true);
		
		focusPanel.add(canvas);
		
		membtn = new Button("Enter the Memory Game");
		membtn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				layoutPanel.clear();
				layoutPanel.add(memview);
				timer.cancel();
				memview.update();
				
			}
		});
		layoutPanel.add(membtn);
		layoutPanel.setWidgetLeftWidth(membtn, 890.0, Unit.PX, 117.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(membtn, 153.0, Unit.PX, 64.0, Unit.PX);
		
		scoresbtn = new Button("Enter Score Table");
		scoresbtn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
			}
		});
		layoutPanel.add(scoresbtn);
		layoutPanel.setWidgetLeftWidth(scoresbtn, 890.0, Unit.PX, 117.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(scoresbtn, 246.0, Unit.PX, 64.0, Unit.PX);
		
		

		canvas.addKeyDownHandler(new KeyDownHandler(){
			public void onKeyDown(KeyDownEvent event) {
				int key = event.getNativeKeyCode();
				if(key < MAX_KEYS) {
					keys[key] = true;
					timer.scheduleRepeating(5);
				}
			}
		});

		// the key is up
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
			}
		};
		timer.scheduleRepeating(5);
		
		membtn.setVisible(false);
		scoresbtn.setVisible(false);
		
		render();
		
	}

	public void render(){
		context = canvas.getContext2d();
		context.beginPath();
		
		// drawing the image
		img = (ImageElement) new Image("CardImage/Mainworld.jpg").getElement().cast();
		context.drawImage(img, 0, 0, 1000, 800);
		
		// drawing the avatar
		img2 = (ImageElement) new Image("CardImage/manlymen.jpg").getElement().cast();
		context.drawImage(img2, player.getX(), player.getY(), 60, 50);
		context.closePath();
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
		
		player.collision(x, y, dx, dy);
		if (player.getcontact()){
		membtn.setVisible(true);
		}
		else{
			membtn.setVisible(false);
		}
		

		render();
	}

}

