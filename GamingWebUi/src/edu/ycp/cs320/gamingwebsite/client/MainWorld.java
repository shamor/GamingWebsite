package edu.ycp.cs320.gamingwebsite.client;


import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class MainWorld {
	private Button upbtn;
	private Button leftbtn;
	private Button downbtn;
	private Button rightbtn;
	private int avieX; 
	private int avieY; 
	private AbsolutePanel absolutePanel;
	Image avie; 
	

	
	public MainWorld(){
		this.avieX = 380; 
		this.avieY = 598; 
		
		absolutePanel = new AbsolutePanel();
		
		Image image = new Image("CardImage/Mainworld.jpg");
		absolutePanel.add(image, 10, 10);
		image.setSize("798px", "739px");
		
		avie = new Image("CardImage/manlymen.jpg");
		absolutePanel.add(avie, avieX, avieY);
		avie.setSize("64px", "55px");
		
		Label lblMoveAvie = new Label("Move Avatar with these.");
		lblMoveAvie.setStyleName("label");
		absolutePanel.add(lblMoveAvie, 741, 479);
		
		//This button moved the charachter up
		upbtn = new Button(" UP ");
		upbtn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				moveAvatar(-2, 0);
			}
		});
		absolutePanel.add(upbtn, 806, 509);
		upbtn.setSize("56px", "30px");
		//this button moves avatar ledt
		leftbtn = new Button("LEFT");
		leftbtn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				avieY -= 2; 
			}
		});
		absolutePanel.add(leftbtn, 750, 544);
		//this button moves avatar right
		rightbtn = new Button("RIGHT");
		rightbtn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				avieY +=2;
			}
		});
		absolutePanel.add(rightbtn, 865, 544);
		//this button moves avatar down
		downbtn = new Button("DOWN");
		downbtn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				avieX += 2; 
			}
		});
		absolutePanel.add(downbtn, 806, 581);
		
	}
	
	public void moveAvatar(int x, int y){
		avieX += x;
		avieY +=y; 
		absolutePanel.add(avie, avieX, avieY);
		
	}
	public void update(){
		
	}
	public void enterRoom(){
		
	}
}
