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
import com.google.gwt.user.client.ui.InlineLabel;


public class MemView extends Composite {
		
		private MemDeck deck; 
		private	ArrayList<String> newdeck; 
		private ArrayList<Integer> imgshow;
		private int click;
		private Image[] allImages; 
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
		private int pairsGone;
	

		
	
	public MemView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("798px", "571px");
	
		this.deck = new MemDeck();
		this.newdeck = new ArrayList<String>(); 
		this.imgshow = new ArrayList<Integer>();
		this.pairsGone = 0;

		for (int i = 0; i<20; i++){
			imgshow.add(0); 
		}
		
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
	
		render();
	}
	public void setModel(MemDeck model) {
		this.deck = model;
	}
	
	public void update() {

	
		//give each image object the address so it will display
		for(int i =0 ; i<allImages.length; i++){
			//if imgshow is 1, it should show an image
			if(imgshow.get(i) == 1){
				allImages[i].setUrl(newdeck.get(i));
			}
			else{//imgshow is 0, so the back card should show
				allImages[i].setUrl("CardImage/Backcard.jpg");
			}
		
		}
			CardsShown();
		
		
	}
	
	/**
	 * This method makes a newdeck by taking the values from the deck class and 
	 * putting their file names in a separate array
	 */
	public void render(){
		
		String img = "CardImage/star1.jpg";
		//make decks of memcards and store in a new array
		deck.make(); 
			for(int i = 0; i<deck.getMemDeck().size(); i++){
			
				//newdeck is used to store the addresses of each element of memdeck so that is can be printed in the GWT
				//new deck is not shuffled and should be represented the same way as the deck. 
				if(deck.getCard(i) == Images.Star) {
					img = "CardImage/star1.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(deck.getCard(i) == Images.Circle){
					img = "CardImage/circle.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(deck.getCard(i) == Images.Square){
					img = "CardImage/square1.jpg";	
					newdeck.add(img); //add the correct string to the deck
				}
				if(deck.getCard(i) == Images.Triangle){
					img = "CardImage/triangle.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(deck.getCard(i) == Images.Arrow){
					img = "CardImage/arrow.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(deck.getCard(i) == Images.Speech){
					img = "CardImage/speech.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(deck.getCard(i) == Images.Hexagon){
					img = "CardImage/hexagon.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(deck.getCard(i) == Images.Light){
					img = "CardImage/light.jpg";
					newdeck.add(img); //add the correct string to the deck
				}
				if(deck.getCard(i) == Images.Heart){
					img = "CardImage/heart.jpg";
					newdeck.add(img); //add the correct string to the deck
				}		
				if(deck.getCard(i) == Images.fourPStar){
					img = "CardImage/fourpstar.jpg";
					newdeck.add(img); //add the correct string to the deck
				}

		}
			 
		
		
	}

	public void CardsShown(){
		//TODO: if they match, set them invisible
		boolean samecards = false; 
		int  imgindex1 = 0, imgindex2=0; 
		Images img1 = null, img2 = null;
		
		if (click%2 == 0){
			 
			imgindex1 = imgshow.indexOf(1); 
			imgindex2 = imgshow.lastIndexOf(1);
			
			if ((imgindex1 != -1 && imgindex2 != -1) && (imgindex1 != imgindex2)){
				img1 = deck.getCard(imgindex1);
				img2 = deck.getCard(imgindex2); 
				samecards = deck.isSame(img1, img2);
				
				if(samecards == true){
					allImages[imgindex1].setVisible(false);
					allImages[imgindex2].setVisible(false);
					pairsGone++; 		
					
				}
			}
			//flip the cards back over	
				for (int j = 0; j<20; j++){
					imgshow.set(j, 0); 
				}
		
		}	
		}
	}

