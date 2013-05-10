package edu.ycp.cs320.gamingwebsite.client;

import java.util.ArrayList;

import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Image;
import edu.ycp.cs320.gamingwebsite.shared.*;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.NumberLabel;




public class MemView extends Composite {
		private String user;
		private MemDeck deck;
		private	ArrayList<String> newdeck; 
		private double click;
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
		private InlineLabel WinLabel;
		private Button pg;
		private NumberLabel<Double> scorelabl;
		private double score; 
		private LayoutPanel layoutPanel_1;
		private Button btnBackToHome;
		private Label errorLabel;
		private Login login;
		private Label lblNewLabel;
		private String username;
		private String password;
		private Timer timer; 
	
	public MemView(String username) {
	
		this.username = username;
		layoutPanel_1 = new LayoutPanel();
		initWidget(layoutPanel_1);
		login = new Login();
		this.score = 0;  
		layoutPanel_1.setSize("1033px", "700px");
		
		// winning label to the game.
		WinLabel = new InlineLabel("CONGRATULATIONS! YOU WON!");
		WinLabel.setStyleName("BigMeassage");
		WinLabel.setDirectionEstimator(true);
		WinLabel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		layoutPanel_1.add(WinLabel);
		layoutPanel_1.setWidgetLeftWidth(WinLabel, 167.0, Unit.PX, 488.0, Unit.PX);
		layoutPanel_1.setWidgetTopHeight(WinLabel, 118.0, Unit.PX, 94.0, Unit.PX);
		
		// play again button
		pg = new Button("Play again button");
		pg.addClickHandler(new ClickHandler() {	
			public void onClick(ClickEvent event) {
				makeDeck(layoutPanel_1);
			}
		});
		pg.setStyleName("Playagain_button");
		pg.setText("Play again?");
		layoutPanel_1.add(pg);
		layoutPanel_1.setWidgetRightWidth(pg, 540.0, Unit.PX, 118.0, Unit.PX);
		layoutPanel_1.setWidgetTopHeight(pg, 292.0, Unit.PX, 58.0, Unit.PX);
		
		scorelabl = new NumberLabel<Double>();
		scorelabl.setStyleName("score");
		layoutPanel_1.add(scorelabl);
		layoutPanel_1.setWidgetLeftWidth(scorelabl, 322.0, Unit.PX, 161.0, Unit.PX);
		layoutPanel_1.setWidgetTopHeight(scorelabl, 218.0, Unit.PX, 45.0, Unit.PX);
		
		makeDeck(layoutPanel_1);
		
		btnBackToHome = new Button("Back to Home Screen");
		btnBackToHome.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				goHome();
			}
		});
		btnBackToHome.setStyleName("label");
		layoutPanel_1.add(btnBackToHome);
		layoutPanel_1.setWidgetLeftWidth(btnBackToHome, 779.0, Unit.PX, 107.0, Unit.PX);
		layoutPanel_1.setWidgetTopHeight(btnBackToHome, 0.0, Unit.PX, 83.0, Unit.PX);
		
		errorLabel = new Label();
		layoutPanel_1.add(errorLabel);
		layoutPanel_1.setWidgetLeftWidth(errorLabel, 23.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel_1.setWidgetTopHeight(errorLabel, 599.0, Unit.PX, 18.0, Unit.PX);
	
	}
	
	// so that it can remake the deck and reset the game
	public void makeDeck(LayoutPanel layoutPanel){

		this.deck = new MemDeck();
		this.newdeck = new ArrayList<String>(); 
		
		deck.resetImgShow();
		// this will initialize all 20 images to the gwt and place them evenally
		
		this.pairsGone = 0;
		
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
			
			img.setVisible(true);
			
			// set position/size
			int row = i / 5;
			int col = i % 5;
			
			layoutPanel.setWidgetLeftWidth(img, 75.0 + col*125.0, Unit.PX, 100.0, Unit.PX);
			layoutPanel.setWidgetTopHeight(img, 25.0 + row*175.0, Unit.PX, 200.0, Unit.PX);
		}
	
		render();
		
		update();
	}



	/**
	 * This updates the game state based on what the user does
	 */
	public void update() {
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
		
		if(IsFinished()){
			score = (click/2) *100 ;
			
			setscore(); 
			timer.cancel();
			timer = new Timer() {
				@Override
				public void run() {
					scorelabl.setValue(score);
					scorelabl.setVisible(true);
					WinLabel.setVisible(true);
					pg.setVisible(true);
					
				}
			};
			timer.schedule(500);
		}
		else{
			scorelabl.setVisible(false);
			WinLabel.setVisible(false);
			pg.setVisible(false);
		}
	}
	/**
	 * This method makes a newdeck by taking the values from the deck class and 
	 * putting their file names in a separate array
	 */
	public void render(){
		//make two decks of memcards and store in a new array
		deck.make();
		score = 0; 
		click = 0;
		pairsGone = 0;
		
		String img1;
		//make decks of memcards and store in a new array
			
		for(int i = 0; i<deck.getMemDeck().size(); i++){
			//newdeck is used to store the addresses of each element of memdeck so that is can be printed in the GWT
			//new deck is not shuffled and should be represented the same way as the deck. 
			if(deck.getCard(i) == Images.Star) {
				img1 = "CardImage/star1.jpg";
				newdeck.add(img1); //add the correct string to the deck
			}
			else if(deck.getCard(i) == Images.Circle){
				img1 = "CardImage/circle.jpg";
				newdeck.add(img1); //add the correct string to the deck
			}
			else if(deck.getCard(i) == Images.Square){
				img1 = "CardImage/square1.jpg";	
				newdeck.add(img1); //add the correct string to the deck

			}
			else if(deck.getCard(i) == Images.Triangle){
				img1 = "CardImage/triangle.jpg";
				newdeck.add(img1); //add the correct string to the deck

			}
			else if(deck.getCard(i) == Images.Arrow){
				img1 = "CardImage/arrow.jpg";
				newdeck.add(img1); //add the correct string to the deck
			}

			else if(deck.getCard(i) == Images.Speech){
				img1 = "CardImage/speech.jpg";
				newdeck.add(img1); //add the correct string to the deck
			}
			else if(deck.getCard(i) == Images.Hexagon){
				img1 = "CardImage/hexagon.jpg";
				newdeck.add(img1); //add the correct string to the deck
			}

			else if(deck.getCard(i) == Images.Light){
				img1 = "CardImage/light.jpg";
				newdeck.add(img1); //add the correct string to the deck
			}

			else if(deck.getCard(i) == Images.Heart){
				img1 = "CardImage/heart.jpg";
				newdeck.add(img1); //add the correct string to the deck
			}	
			
			else if(deck.getCard(i) == Images.fourPStar){
				img1 = "CardImage/fourpstar.jpg";
				newdeck.add(img1); //add the correct string to the deck
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
		int imgindex1 = 0, imgindex2=0;
		
		if (click%2 == 0){
			 
			imgindex1 = deck.getImgshow().indexOf(1); 
			imgindex2 = deck.getImgshow().lastIndexOf(1);
			
			if ((imgindex1 != -1 && imgindex2 != -1) && (imgindex1 != imgindex2)){
				img1 = deck.getCard(imgindex1);
				img2 = deck.getCard(imgindex2); 
				
				samecards = deck.isSame(img1, img2);
				
				final int hideIndex1 = imgindex1;
				final int hideIndex2 = imgindex2;
				
				if(samecards == true){
					timer = new Timer() {
						@Override
						public void run() {
							allImages[hideIndex1].setVisible(false);
							allImages[hideIndex2].setVisible(false);
						}
					};
					timer.schedule(500);
					
					pairsGone++; 		
					
				}
			}
			//flip the cards back over	
			deck.resetImgShow();
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
	public void goHome(){
		MainWorld main = new MainWorld(username);
		layoutPanel_1.clear();
		layoutPanel_1.add(main);
		timer.cancel();
		main.update();
	}
	
	protected void setscore() {
		// RPC call to server to see if username/password is valid
		
		RPC.loginService.setscore(username, score, new AsyncCallback<Void>() {

			@Override
			public void onSuccess(Void result) {
				errorLabel.setText("Success (should go to home page)" );
			}
			
			@Override
			public void onFailure(Throwable caught) {
				//  display error (e.g., in a label)
				errorLabel.setText("Error logging in (could not contact server)");
			}
		});
	}
}
