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
import com.google.gwt.user.client.ui.HasHorizontalAlignment;




public class MemView extends Composite {
		
		private MemDeck deck; 
		private	ArrayList<String> newdeck; 
		//private ArrayList<Integer> imgshow;
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

		private ArrayList<Integer> imgshow;
		private ArrayList<Images> memdeck;
		private int pairsGone;
		private InlineLabel WinLabel;

		
	
	public MemView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);

		layoutPanel.setSize("700px", "460px");

		layoutPanel.setSize("798px", "571px");
		
		WinLabel = new InlineLabel("CONGRATULATIONS! YOU WON!");
		WinLabel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		layoutPanel.add(WinLabel);
		layoutPanel.setWidgetLeftWidth(WinLabel, 152.0, Unit.PX, 488.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(WinLabel, 169.0, Unit.PX, 149.0, Unit.PX);
		
	
		this.deck = new MemDeck();
		this.newdeck = new ArrayList<String>(); 
		this.imgshow = new ArrayList<Integer>();
		this.memdeck = new ArrayList<Images>();
		
		for (int i = 0; i<20; i++){
			imgshow.add(0); 
		}
		
		// this will initialize all 20 images to the gwt and place them evenally
		//this.imgshow = new ArrayList<Integer>();
		this.pairsGone = 0;

		deck.resetImgShow(); 
		
		
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
					deck.setImgshow(imageNum, 1);
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
	/**
	 * This updates the game state based on what the user does
	 */
	public void update() {
		
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
	
		//give each image object the address so it will display
		for(int i =0 ; i<allImages.length; i++){
			//if imgshow is 1, it should show an image
			if(deck.getImgshow().get(i) == 1){
				allImages[i].setUrl(newdeck.get(i));
			}
			else{//imgshow is 0, so the back card should show
				allImages[i].setUrl("CardImage/Backcard.jpg");
			}
		
		}
		CardsShown();
		if(IsFinished()==true){
			WinLabel.setPixelSize(200, 175);
			WinLabel.setVisible(true);
		}
		else{
			WinLabel.setVisible(false);
		}
	}
	
	/**
	 * This method makes a newdeck by taking the values from the deck class and 
	 * putting their file names in a separate array
	 */
	public void render(){
		String img;
		
		//make two decks of memcards and store in a new array
		deck.make();
		for(int i = 0; i<deck.getNumCards(); i++){
			memdeck.add(deck.getCard(i));
		}
	
		for(int j = 0; j< memdeck.size(); j++){
			String img1 = "CardImage/star1.jpg";
		//make decks of memcards and store in a new array
			
			for(int i = 0; i<deck.getMemDeck().size(); i++){
				//newdeck is used to store the addresses of each element of memdeck so that is can be printed in the GWT
				//new deck is not shuffled and should be represented the same way as the deck. 
				if(deck.getCard(i) == Images.Star) {
					img1 = "CardImage/star1.jpg";
					newdeck.add(img1); //add the correct string to the deck
				}
				else if(memdeck.get(j) == Images.Circle){
					if(deck.getCard(i) == Images.Circle){
	
						img1 = "CardImage/circle.jpg";
						newdeck.add(img1); //add the correct string to the deck
					}
				}

				else if(memdeck.get(j) == Images.Square){
					if(deck.getCard(i) == Images.Square){
						img1 = "CardImage/square1.jpg";	
						newdeck.add(img1); //add the correct string to the deck
					}
				}

				else if(memdeck.get(j) == Images.Triangle){
					if(deck.getCard(i) == Images.Triangle){
						img1 = "CardImage/triangle.jpg";
						newdeck.add(img1); //add the correct string to the deck
					}
				}

				else if(memdeck.get(j) == Images.Arrow){
					if(deck.getCard(i) == Images.Arrow){
						img1 = "CardImage/arrow.jpg";
						newdeck.add(img1); //add the correct string to the deck
					}
				}

				else if(memdeck.get(j) == Images.Speech){
					if(deck.getCard(i) == Images.Speech){
						img1 = "CardImage/speech.jpg";
						newdeck.add(img1); //add the correct string to the deck
					}
				}
				else if(memdeck.get(j) == Images.Hexagon){
					if(deck.getCard(i) == Images.Hexagon){
						img1 = "CardImage/hexagon.jpg";
						newdeck.add(img1); //add the correct string to the deck
					}
				}

				else if(memdeck.get(j) == Images.Light){
					if(deck.getCard(i) == Images.Light){
						img1 = "CardImage/light.jpg";
						newdeck.add(img1); //add the correct string to the deck
					}
				}

				else if(memdeck.get(j) == Images.Heart){
					if(deck.getCard(i) == Images.Heart){
						img1 = "CardImage/heart.jpg";
						newdeck.add(img1); //add the correct string to the deck
					}
				}	
				
				else if(memdeck.get(j) == Images.fourPStar){
					if(deck.getCard(i) == Images.fourPStar){
						img1 = "CardImage/fourpstar.jpg";
						newdeck.add(img1); //add the correct string to the deck
					}
				}
			}
		}
	}
	
	
	/**
	 * This method determines which cards are showing
	 */
	public void CardsShown(){
		//if they match, set them invisible
		boolean samecards = false; 
		Images img1 = null, img2 = null;
		int imgindex11 = 0, imgindex21=0;
		
		if (click%2 == 0){
			 
			imgindex11 = deck.getImgshow().indexOf(1); 
			imgindex21 = deck.getImgshow().lastIndexOf(1);
			
			if ((imgindex11 != -1 && imgindex21 != -1) && (imgindex11 != imgindex21)){
				img1 = deck.getCard(imgindex11);
				img2 = deck.getCard(imgindex21); 
				samecards = deck.isSame(img1, img2);
				
				if(samecards == true){
					allImages[imgindex11].setVisible(false);
					allImages[imgindex21].setVisible(false);
					pairsGone++; 		
					
				}
			}
			//flip the cards back over	
			deck.resetImgShow();
				
		if(click == 0){
			// declaring imgindex1
			imgindex11 = imgshow.indexOf(1);
		}
		else if (click == 1){  
			imgindex21 = imgshow.lastIndexOf(1);
			// if index1 is the same as index2
			if(imgindex11 == imgindex21){
				imgindex21 = imgshow.indexOf(1);
			}
			// resetting the clicks
			click = 0;
			// checking if equal
			if(deck.isSame(memdeck.get(imgindex11), memdeck.get(imgindex21)) && (imgindex11 != imgindex21)){
				allImages[imgindex11].setVisible(false);
				allImages[imgindex21].setVisible(false);
			} else{
				;
			}
			
		}else{
			;
		}	
		}
	}
	
	
	public boolean IsFinished(){
		if(pairsGone == (deck.getMemDeck().size()/2)){
			return true;
		}
		else{
			return false; 
		}
	}
}
