package edu.ycp.cs320.gamingwebsite.client;

import java.util.ArrayList;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.user.client.ui.Image;

import edu.ycp.cs320.gamingwebsite.shared.Images;
import edu.ycp.cs320.gamingwebsite.shared.MemDeck;
import com.google.gwt.user.client.ui.Hidden;

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
		
	
	public MemView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("700px", "460px");
	
		this.deck = new MemDeck();
		this.newdeck = new ArrayList<String>(); 
	
		
		
		// this will initialize all 20 images to the gwt and place them evenally
		this.image = new Image();
		layoutPanel.add(image);
		//general note, the first numerical value controls the top left corner of the picture box
		layoutPanel.setWidgetLeftWidth(image, 75.0, Unit.PX, 112.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 0.0, Unit.PX, 149.0, Unit.PX);
		
		this.image_1 = new Image();
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 159.0, Unit.PX, -6.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 25.0, Unit.PX, 104.0, Unit.PX);
		
		this.image_2 = new Image();
		layoutPanel.add(image_2);
		layoutPanel.setWidgetLeftWidth(image_2, 325.0, Unit.PX, 181.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_2, 25.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_3 = new Image();
		layoutPanel.add(image_3);
		layoutPanel.setWidgetLeftWidth(image_3, 450.0, Unit.PX, 181.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_3, 25.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_4 = new Image();
		layoutPanel.add(image_4);
		layoutPanel.setWidgetLeftWidth(image_4, 575.0, Unit.PX, 181.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_4, 25.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_5 = new Image();
		layoutPanel.add(image_5);
		layoutPanel.setWidgetLeftWidth(image_5, 75.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_5, 200.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_6 = new Image();
		layoutPanel.add(image_6);
		layoutPanel.setWidgetLeftWidth(image_6, 200.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_6, 200.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_7 = new Image();
		layoutPanel.add(image_7);
		layoutPanel.setWidgetLeftWidth(image_7, 325.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_7, 200.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_8 = new Image();
		layoutPanel.add(image_8);
		layoutPanel.setWidgetLeftWidth(image_8, 450.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_8, 200.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_9 = new Image();
		layoutPanel.add(image_9);
		layoutPanel.setWidgetLeftWidth(image_9, 575.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_9, 200.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_10 = new Image();
		layoutPanel.add(image_10);
		layoutPanel.setWidgetLeftWidth(image_10, 75.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_10, 375.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_11 = new Image();
		layoutPanel.add(image_11);
		layoutPanel.setWidgetLeftWidth(image_11, 200.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_11, 375.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_12 = new Image();
		layoutPanel.add(image_12);
		layoutPanel.setWidgetLeftWidth(image_12, 325.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_12, 375.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_13 = new Image();
		layoutPanel.add(image_13);
		layoutPanel.setWidgetLeftWidth(image_13, 450.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_13, 375.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_14 = new Image();
		layoutPanel.add(image_14);
		layoutPanel.setWidgetLeftWidth(image_14, 575.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_14, 375.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_15 = new Image();
		layoutPanel.add(image_15);
		layoutPanel.setWidgetLeftWidth(image_15, 75.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_15, 550.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_16 = new Image();
		layoutPanel.add(image_16);
		layoutPanel.setWidgetLeftWidth(image_16, 200.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_16, 550.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_17 = new Image();
		layoutPanel.add(image_17);
		layoutPanel.setWidgetLeftWidth(image_17, 325.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_17, 550.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_18 = new Image();
		layoutPanel.add(image_18);
		layoutPanel.setWidgetLeftWidth(image_18, 450.0, Unit.PX, 190.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_18, 550.0, Unit.PX, 161.0, Unit.PX);
		
		
		this.image_19 = new Image();
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

		image_1.setUrl(newdeck.get(1));
		image_2.setUrl(newdeck.get(2)); 
		image_3.setUrl(newdeck.get(3)); 
		image_4.setUrl(newdeck.get(4)); 
		image_5.setUrl(newdeck.get(5)); 
		image_6.setUrl(newdeck.get(6)); 
		image_7.setUrl(newdeck.get(7)); 
		image_8.setUrl(newdeck.get(8)); 
		image_9.setUrl(newdeck.get(9)); 
		image_10.setUrl(newdeck.get(10)); 
		image_11.setUrl(newdeck.get(11)); 
		image_12.setUrl(newdeck.get(12)); 
		image_13.setUrl(newdeck.get(13)); 
		image_14.setUrl(newdeck.get(14)); 
		image_15.setUrl(newdeck.get(15)); 
		image_16.setUrl(newdeck.get(16)); 
		image_17.setUrl(newdeck.get(17)); 
		image_18.setUrl(newdeck.get(18)); 
		image_19.setUrl(newdeck.get(19));
	}
	
	/**
	 * This method takes an two initial decks and combine them by making their values 
	 * equal to their file names in a separate array
	 */
	public ArrayList<String> render(){
		ArrayList<Images> imgarr1 = new ArrayList<Images>();
		ArrayList<Images> imgarr2 = new ArrayList<Images>();
		ArrayList<Images> memdeck = new ArrayList<Images>();
		String img;
		
		//make two decks of memcards and store in two arrays
		deck.make();
		for(int i = 0; i<deck.getNumCards(); i++){
			imgarr1.add(deck.getCard(i));
		}
		
		for(int i = 0; i<deck.getNumCards(); i++){
			imgarr2.add(deck.getCard(i));
		}
		memdeck.addAll(imgarr1);
		memdeck.addAll(imgarr2);
		deck.shuffle(memdeck);
		
			for(int i = 0; i<20; i++){
			
				if(memdeck.get(i).toString().equals("Star")){
					img = "CardImage/star1.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(memdeck.get(i).toString().equals("Circle")){
					img = "CardImage/circle.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(memdeck.get(i).toString().equals("Square")){
					img = "CardImage/square1.jpg";	
					newdeck.add(img); //add the correct string to the deck
				}
				else if(memdeck.get(i).toString().equals("Triangle")){
					img = "CardImage/triangle.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(memdeck.get(i).toString().equals("Arrow")){
					img = "CardImage/arrow.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(memdeck.get(i).toString().equals("Speech")){
					img = "CardImage/speech.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(memdeck.get(i).toString().equals("Hexagon")){
					img = "CardImage/hexagon.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(memdeck.get(i).toString().equals("Light")){
					img = "CardImage/light.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(memdeck.get(i).toString().equals("Heart")){
					img = "CardImage/heart.jpg";
					newdeck.add(img); //add the correct string to the deck
				}		
				else if(memdeck.get(i).toString().equals("fourPStar")){
					img = "CardImage/fourpstar.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
		}
		return newdeck;
	}
	
	public boolean Clicker(int click){
		if(click == 2){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean isGood(){
		return false;
	}
}
