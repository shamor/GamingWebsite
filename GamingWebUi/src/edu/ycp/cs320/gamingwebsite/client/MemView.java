package edu.ycp.cs320.gamingwebsite.client;

import java.util.ArrayList;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Image;

import edu.ycp.cs320.gamingwebsite.shared.Images;
import edu.ycp.cs320.gamingwebsite.shared.MemDeck;


public class MemView extends Composite {
		
	private MemDeck deck; 
		private	ArrayList<String> newdeck; 
		private Canvas canvas;
		private Image image;
		private Image image_1;

	
	public MemView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
	
		deck = new MemDeck();
		newdeck = new ArrayList<String>(); 

		
		this.image = new Image();
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 76.0, Unit.PX, 134.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 161.0, Unit.PX, -100.0, Unit.PX);
		
		this.image_1 = new Image();
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 257.0, Unit.PX, 0.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 176.0, Unit.PX, -60.0, Unit.PX);
	
		
	
	
	}
	public void setModel(MemDeck model) {
		this.deck = model;
	}
	
	public void update() {
		render();
		image.setUrl(newdeck.get(8));
	
	}
	
	/**
	 * This method takes an two initial decks and combine them by making their values 
	 * equal to their file names in a separate array
	 */
	public ArrayList<String> render(){
		ArrayList<Images> imgarr1 = new ArrayList<Images>();
		ArrayList<Images> imgarr2 = new ArrayList<Images>();
		String img = "CardImage/star1.jpg";
		
		//make two decks of memcards and store in two arrays
		deck.make();
		for(int i = 0; i<deck.getNumCards(); i++){
			imgarr1.add(deck.getCard(i));
		}
		for(int i = 0; i<deck.getNumCards(); i++){
			imgarr2.add(deck.getCard(i));
		}
		//shuffle(); //shuffle so the first deck is different
	
		
			for(int i = 0; i<10; i++){
			
				if(imgarr1.get(i).toString().equals("Star") || imgarr2.get(i).toString().equals("Star")){
					img = "CardImage/star1.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Circle") || imgarr2.get(i).toString().equals("Circle")){
					img = "CardImage/circle.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Square") || imgarr2.get(i).toString().equals("Square")){
					img = "CardImage/square.jpg";	
					newdeck.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Triangle") || imgarr2.get(i).toString().equals("Triangle")){
					img = "CardImage/triangle";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Arrow") || imgarr2.get(i).toString().equals("Arrow")){
					img = "CardImage/arrow.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Speech") || imgarr2.get(i).toString().equals("Speech")){
					img = "CardImage/speech.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Hexagon") || imgarr2.get(i).toString().equals("Hexagon")){
					img = "CardImage/hexagon.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Light") || imgarr2.get(i).toString().equals("Light")){
					img = "CardImage/light.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Light") || imgarr2.get(i).toString().equals("Light")){
					img = "CardImage/heart.jpg";
					newdeck.add(img); //add the correct string to the deck
				}		
				else if(imgarr1.get(i).toString().equals("Light") || imgarr2.get(i).toString().equals("Light")){
					img = "CardImage/fourPStar.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else{
					newdeck.add(img); //add the correct string to the deck
				}
		}
			return newdeck;
		
	}
}
