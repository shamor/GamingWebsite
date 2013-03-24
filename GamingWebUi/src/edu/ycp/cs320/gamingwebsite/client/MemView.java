package edu.ycp.cs320.gamingwebsite.client;

import java.util.ArrayList;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Image;

import edu.ycp.cs320.gamingwebsite.shared.Images;
import edu.ycp.cs320.gamingwebsite.shared.MemDeck;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;


public class MemView extends Composite {
		
		private MemDeck deck; 
		private	ArrayList<String> newdeck; 
		private Image image;
		private Image image_1;
		private Image image_2;
		private Image image_3;
		private Image image_4;
		private Image image_5;
		private Image image_6;
		private Image image_7;
		private Image image_8;
		private Image image_9;
		private Image image_10;
		private Image image_11;
		private Image image_12;
		private Image image_13;
		private Image image_14;
		private Image image_15;
		private Image image_16;
		private Image image_17;
		private Image image_18;
		private Image image_19;
		private ArrayList<Integer> imgshow;
		private int click; 
		private String imgback; 
		
	
	public MemView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("798px", "571px");
	
		this.deck = new MemDeck();
		this.newdeck = new ArrayList<String>(); 
		this.imgshow = new ArrayList<Integer>();
	
		for (int i = 0; i<20; i++){
			imgshow.add(0); 
		}
		
		// this will initialize all 20 images to the gwt and place them evenally
		
		
		this.image = new Image();
		image.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(0, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image);
		//general note, the first numerical value controls the top left corner of the picture box
		layoutPanel.setWidgetLeftWidth(image, 75.0, Unit.PX, 181.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 25.0, Unit.PX, 161.0, Unit.PX);
		
		this.image_1 = new Image();
		image_1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(1, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 200.0, Unit.PX, 181.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 25.0, Unit.PX, 161.0, Unit.PX);
		
		this.image_2 = new Image();
		image_2.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(2, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_2);
		layoutPanel.setWidgetLeftWidth(image_2, 325.0, Unit.PX, 181.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_2, 25.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_3 = new Image();
		image_3.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(3, 1); 
				click++;
				update();
			}
		});
		layoutPanel.add(image_3);
		layoutPanel.setWidgetLeftWidth(image_3, 450.0, Unit.PX, 181.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_3, 25.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_4 = new Image();
		image_4.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(4, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_4);
		layoutPanel.setWidgetLeftWidth(image_4, 575.0, Unit.PX, 181.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_4, 25.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_5 = new Image();
		image_5.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(5, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_5);
		layoutPanel.setWidgetLeftWidth(image_5, 75.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_5, 375.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_6 = new Image();
		image_6.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(6, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_6);
		layoutPanel.setWidgetLeftWidth(image_6, 200.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_6,	375.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_7 = new Image();
		image_7.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(7, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_7);
		layoutPanel.setWidgetLeftWidth(image_7, 325.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_7, 375.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_8 = new Image();
		image_8.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(8, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_8);
		layoutPanel.setWidgetLeftWidth(image_8, 450.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_8, 375.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_9 = new Image();
		image_9.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(9, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_9);
		layoutPanel.setWidgetLeftWidth(image_9, 575.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_9, 375.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_10 = new Image();
		image_10.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(10, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_10);
		layoutPanel.setWidgetLeftWidth(image_10, 75.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_10, 200.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_11 = new Image();
		image_11.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(11, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_11);
		layoutPanel.setWidgetLeftWidth(image_11, 200.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_11, 200.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_12 = new Image();
		image_12.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(12, 1);
				click++;
				update();
			}
		});
		layoutPanel.add(image_12);
		layoutPanel.setWidgetLeftWidth(image_12, 325.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_12, 200.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_13 = new Image();
		image_13.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(13, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_13);
		layoutPanel.setWidgetLeftWidth(image_13, 450.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_13, 200.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_14 = new Image();
		image_14.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(14, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_14);
		layoutPanel.setWidgetLeftWidth(image_14, 575.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_14, 200.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_15 = new Image();
		image_15.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(15, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_15);
		layoutPanel.setWidgetLeftWidth(image_15, 75.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_15, 550.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_16 = new Image();
		image_16.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(16, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_16);
		layoutPanel.setWidgetLeftWidth(image_16, 200.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_16, 550.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_17 = new Image();
		image_17.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(17, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_17);
		layoutPanel.setWidgetLeftWidth(image_17, 325.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_17, 550.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_18 = new Image();
		image_18.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(18, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_18);
		layoutPanel.setWidgetLeftWidth(image_18, 450.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_18, 550.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_19 = new Image();
		image_19.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				imgshow.set(19, 1);
				click++; 
				update();
			}
		});
		layoutPanel.add(image_19);
		layoutPanel.setWidgetLeftWidth(image_19, 575.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_19, 550.0, Unit.PX, 161.0, Unit.PX);
		
		
	
	
	}
	public void setModel(MemDeck model) {
		this.deck = model;
	}
	
	public void update() {
		render();
		//implement later the if statement
		//make a method for if the card is clicked and create a count for how many cards are clicked
		if (imgshow.get(0) == 1){
			image.setUrl(newdeck.get(0));
		}
		else{
			image.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(1) == 1){
			image_1.setUrl(newdeck.get(1));
		}
		else{
			image_1.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(2) == 1){
			image_2.setUrl(newdeck.get(2)); 
		}
		else{
			image_2.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(3) == 1){
			image_3.setUrl(newdeck.get(3)); 
		}
		else{
			image_3.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(4) == 1){
			image_4.setUrl(newdeck.get(4)); 
		}
		else{
			image_4.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(5) == 1){
			image_5.setUrl(newdeck.get(5)); 
		}
		else{
			image_5.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(6) == 1){
			image_6.setUrl(newdeck.get(6)); 
		}
		else{
			image_6.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(7) == 1){
			image_7.setUrl(newdeck.get(7)); 
		}
		else{
			image_7.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(8) == 1){
			image_8.setUrl(newdeck.get(8));
		}
		else{
			image_8.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(9) == 1){
			image_9.setUrl(newdeck.get(9)); 
		}
		else{
			image_9.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(10) == 1){
			image_10.setUrl(newdeck.get(10));
		}
		else{
			image_10.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(11) == 1){
			image_11.setUrl(newdeck.get(11)); 
		}
		else{
			image_11.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(12) == 1){
			image_12.setUrl(newdeck.get(12)); 
		}
		else{
			image_12.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(13) == 1){
			image_13.setUrl(newdeck.get(13)); 
		}
		else{
			image_13.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(14) == 1){
			image_14.setUrl(newdeck.get(14)); 
		}
		else{
			image_14.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(15) == 1){
			image_15.setUrl(newdeck.get(15)); 
		}
		else{
			image_15.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(16) == 1){
			image_16.setUrl(newdeck.get(16)); 
		}
		else{
			image_16.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(17) == 1){
			image_17.setUrl(newdeck.get(17));
		}
		else{
			image_17.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(18) == 1){
			image_18.setUrl(newdeck.get(18)); 
		}
		else{
			image_18.setUrl("CardImage/Backcard.jpg");
		}
		if (imgshow.get(19) == 1){
			image_19.setUrl(newdeck.get(19)); 
		}
		else{
			image_19.setUrl("CardImage/Backcard.jpg");
		}
		CardsShown(click);
	}
	
	/**
	 * This method takes an two initial decks and combine them by making their values 
	 * equal to their file names in a separate array
	 */
	public void render(){
		ArrayList<Images> memdeck = new ArrayList<Images>();
		String img = "CardImage/star1.jpg";
		
		//make two decks of memcards and store in a new array
		deck.make();
		for(int i = 0; i<deck.getNumCards(); i++){
			memdeck.add(deck.getCard(i));
		}
		
		for(int j = memdeck.size(); j < 20; j++){
			memdeck.add(deck.getCard(j-10));
		}

	deck.shuffle(memdeck);
	
			for(int i = 0; i< memdeck.size(); i++){
			
				if(memdeck.get(i).toString().equals("Star")){
					img = "CardImage/star1.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(memdeck.get(i).toString().equals("Circle")){
					img = "CardImage/circle.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(memdeck.get(i).toString().equals("Square")){
					img = "CardImage/square1.jpg";	
					newdeck.add(img); //add the correct string to the deck
				}
				if(memdeck.get(i).toString().equals("Triangle")){
					img = "CardImage/triangle.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(memdeck.get(i).toString().equals("Arrow")){
					img = "CardImage/arrow.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(memdeck.get(i).toString().equals("Speech")){
					img = "CardImage/speech.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(memdeck.get(i).toString().equals("Hexagon")){
					img = "CardImage/hexagon.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(memdeck.get(i).toString().equals("Light")){
					img = "CardImage/light.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(memdeck.get(i).toString().equals("Heart")){
					img = "CardImage/heart.jpg";
					newdeck.add(img); //add the correct string to the deck
				}		
				if(memdeck.get(i).toString().equals("fourPStar")){
					img = "CardImage/fourpstar.jpg";
					newdeck.add(img); //add the correct string to the deck
				}

		}
			 
		
		
	}
	public void CardsShown(int clicks){
		//TODO: if they match, set them invisible
		if (clicks%2 == 0){
			for (int i = 0; i<20; i++){
				imgshow.set(i, 0); 
			}
		}
	}
}
