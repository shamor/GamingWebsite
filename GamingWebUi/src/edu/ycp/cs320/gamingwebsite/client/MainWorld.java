package edu.ycp.cs320.gamingwebsite.client;



import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.dom.client.Style.Unit;

public class MainWorld extends Composite {
	private Button upbtn;
	private Button leftbtn;
	private Button downbtn;
	private Button rightbtn;
	private int avieX; 
	private int avieY; 
	private AbsolutePanel absolutePanel;
	private Image avie;
	private LayoutPanel layoutPanel;
	

	
	public MainWorld(){
		
		this.avieX = 360; 
		this.avieY = 590; 
		
		absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		
		Image image = new Image("CardImage/Mainworld.jpg");
		absolutePanel.add(image, 10, 10);
		image.setSize("798px", "739px");
		
		Label lblMoveAvie = new Label("Move Avatar with these.");
		lblMoveAvie.setStyleName("label");
		absolutePanel.add(lblMoveAvie, 741, 479);
		
		//This button moved the charachter up
		upbtn = new Button(" UP ");
		upbtn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				moveAvatar(0, -25);
			}
		});
		absolutePanel.add(upbtn, 806, 509);
		upbtn.setSize("56px", "30px");
		//this button moves avatar ledt
		leftbtn = new Button("LEFT");
		leftbtn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				moveAvatar(-25, 0);
			}
		});
		absolutePanel.add(leftbtn, 750, 544);
		//this button moves avatar right
		rightbtn = new Button("RIGHT");
		rightbtn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				moveAvatar(25, 0);
			}
		});
		absolutePanel.add(rightbtn, 865, 544);
		//this button moves avatar down
		downbtn = new Button("DOWN");
		downbtn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				moveAvatar(0, 25);
			}
		});
		absolutePanel.add(downbtn, 806, 581);
		
		layoutPanel = new LayoutPanel();
		absolutePanel.add(layoutPanel, 10, 10);
		layoutPanel.setSize("689px", "653px");
		
		avie = new Image("CardImage/manlymen.jpg");
		
		layoutPanel.add(avie);
		layoutPanel.setWidgetLeftWidth(avie, avieX, Unit.PX, 73.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(avie, avieY, Unit.PX, 55.0, Unit.PX);
		avie.setSize("73px", "55px");
		
	}
	
	public void moveAvatar(int x, int y){
		//x = 360 reached the left side of the right buildings, y = 40 for top of screen
		//y = 415 for top of bottom buildings, x = 610 for the right of screen
		//y = 290 for bottom of top buildings, y = 590 for bottom of screen,x = 20 for the left of screen
		//x = 260 for the right side of the left buildings

		avieX += x;
		avieY +=y;
		if(avieX <= 360 && avieY <= 590 && avieY >=40 && avieX >=260){
			layoutPanel.setWidgetLeftWidth(avie, avieX, Unit.PX, 73.0, Unit.PX);
			layoutPanel.setWidgetTopHeight(avie, avieY, Unit.PX, 55.0, Unit.PX);
			
		}
		else{
			if((avieY>= 290 && avieY <=340) && (avieX>=20 && avieX<=610)){
				layoutPanel.setWidgetLeftWidth(avie, avieX, Unit.PX, 73.0, Unit.PX);
				layoutPanel.setWidgetTopHeight(avie, avieY, Unit.PX, 55.0, Unit.PX);
			}
			else{
				avieX-= x;
				avieY-= y; 
			}
		}
		
		
	}
	public void update(){
		
	}
	public void enterRoom(){
		
	}
}
