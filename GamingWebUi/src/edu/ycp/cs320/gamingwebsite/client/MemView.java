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
		private Image[] allImages; 
		private ArrayList<Images> memdeck;

		
	
	public MemView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);

		layoutPanel.setSize("700px", "460px");

		layoutPanel.setSize("798px", "571px");
	
		this.deck = new MemDeck();
		this.newdeck = new ArrayList<String>(); 
		this.imgshow = new ArrayList<Integer>();
		this.memdeck = new ArrayList<Images>();
	
		for (int i = 0; i<20; i++){
			imgshow.add(0); 
		}
		
		// this will initialize all 20 images to the gwt and place them evenally
		
		
		// this will initialize all 20 images to the gwt and place them evenally
		this.image = new Image();
		this.image_1 = new Image();
		this.image_2 = new Image();
		this.image_3 = new Image();
		this.image_4 = new Image();
		this.image_5 = new Image();
		this.image_6 = new Image();
		this.image_7 = new Image();
		this.image_8 = new Image();
		this.image_9 = new Image();
		this.image_10 = new Image();
		this.image_11 = new Image();
		this.image_12 = new Image();
		this.image_13 = new Image();
		this.image_14 = new Image();
		this.image_15 = new Image();
		this.image_16 = new Image();
		this.image_17 = new Image();
		this.image_18 = new Image();
		this.image_19 = new Image();
		
		
		this.allImages = new Image[]{
				image,
				image_1,
				image_2,
				image_3,
				image_4,
				image_5,
				image_6,
				image_7,
				image_8,
				image_9,
				image_10,
				image_11,
				image_12,
				image_13,
				image_14,
				image_15,
				image_16,
				image_17,
				image_18,
				image_19,
		};
		for (int i = 0; i < allImages.length; i++) {
			Image img = allImages[i];
			
			final int imageNum = i;
			
			// add click handler to image
			img.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					imgshow.set(imageNum, 1);
					click++; 
					
					update();
				}
			});
			
			// add to panel
			layoutPanel.add(img);
			
			// set position/size
			int row = i / 5;
			int col = i % 5;
			
			layoutPanel.setWidgetLeftWidth(img, 75.0 + col*125.0, Unit.PX, 100.0, Unit.PX);
			layoutPanel.setWidgetTopHeight(img, 25.0 + row*175.0, Unit.PX, 200.0, Unit.PX);
		}
	
	
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
		
		String img;
		
		//make two decks of memcards and store in a new array
		deck.make();
		for(int i = 0; i<deck.getNumCards(); i++){
			memdeck.add(deck.getCard(i));
		}

		deck.shuffle(memdeck);
				

		deck.shuffle(memdeck);
	
			for(int i = 0; i< memdeck.size(); i++){
			
				if(memdeck.get(i) == Images.Star){
					img = "CardImage/star1.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				else if(memdeck.get(i) == Images.Circle){

					img = "CardImage/circle.jpg";
					newdeck.add(img); //add the correct string to the deck
				}

				else if(memdeck.get(i) == Images.Square){
					img = "CardImage/square1.jpg";	
					newdeck.add(img); //add the correct string to the deck
				}

				else if(memdeck.get(i) == Images.Triangle){
					img = "CardImage/triangle.jpg";
					newdeck.add(img); //add the correct string to the deck
				}

				else if(memdeck.get(i) == Images.Arrow){
					img = "CardImage/arrow.jpg";
					newdeck.add(img); //add the correct string to the deck
				}

				else if(memdeck.get(i) == Images.Speech){
					img = "CardImage/speech.jpg";
					newdeck.add(img); //add the correct string to the deck
				}

				else if(memdeck.get(i) == Images.Hexagon){
					img = "CardImage/hexagon.jpg";
					newdeck.add(img); //add the correct string to the deck
				}

				else if(memdeck.get(i) == Images.Light){
					img = "CardImage/light.jpg";
					newdeck.add(img); //add the correct string to the deck
				}

				else if(memdeck.get(i) == Images.Heart){
					img = "CardImage/heart.jpg";
					newdeck.add(img); //add the correct string to the deck
				}		

				else if(memdeck.get(i) == Images.fourPStar){
					img = "CardImage/fourpstar.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
			}
	}
		
	public void CardsShown(int clicks){
		//TODO: if they match, set them invisible
		
		int imgindex1 = 0, imgindex2=0 ;
		
		if(clicks == 0){
			// declaring imgindex1
			imgindex1 = imgshow.indexOf(1);
		}
		else if (clicks == 1){  
			imgindex2 = imgshow.lastIndexOf(1);
			// if index1 is the same as index2
			if(imgindex1 == imgindex2){
				imgindex2 = imgshow.indexOf(1);
			}
			// resetting the clicks
			clicks = 0;
			// checking if equal
			if(deck.isSame(memdeck.get(imgindex1), memdeck.get(imgindex2))){
				allImages[imgindex1].setVisible(false);
				allImages[imgindex2].setVisible(false);
			} else{
				;
			}
			
		}else{
			;
		}
	
			//this goes through the imgshow array to see which cards are shown
//			for(int i =0; i<20; i++){
//				if (click(i)){
//					if (whichcard == 0){
//						imgindex1 = i;
//						whichcard++; 
//					}
//					else if (whichcard == 1){
//						imgindex2= i;
//						whichcard=0;
//	
//					}else{
//						;
//					}
//				}
//			}
//		}
	}
	
	public boolean isGood(){
		return false;
	}
	
	public boolean isFinished(){
		return false;
	}
}
