package edu.ycp.cs320.gamingwebsite.client;

import java.util.ArrayList;


import edu.ycp.cs320.gamingwebsite.shared.Images;
import edu.ycp.cs320.gamingwebsite.shared.MemCard;
import edu.ycp.cs320.gamingwebsite.shared.MemDeck;

public class MemDeckRender {
		private ArrayList<String> deckrend;
		
		
		public MemDeckRender(){
			deckrend = new ArrayList<String>();
		}
		/*
		 * This class renders a the previously made deck made in deck class
		 * into a new array containing the card images
		 * It takes two memdecks which will insure that there are two of each card
		 */
		public void render(MemDeck deck){
			ArrayList<Images> imgarr1 = new ArrayList<>();
			ArrayList<Images> imgarr2 = new ArrayList<>();
			String img = "CardImage/star1.jpg";
			
			//make two decks of memcards and store in two arrays
			deck.make();
			for(int i = 0; i<deck.getNumCards(); i++){
				imgarr1.add(deck.getCard(i));
			}
			deck.shuffle(); //shuffle so the first deck is different
			for(int i = 0; i<deck.getNumCards(); i++){
				imgarr1.add(deck.getCard(i));
			}
			
			for(int i = 0; i<=20; i++){
				if(imgarr1.get(i).equals("Star") || imgarr2.get(i).equals("Star")){
					img = "CardImage/star1.jpg";
				}
				else if(imgarr1.get(i).equals("Circle") || imgarr2.get(i).equals("Circle")){
					img = "CardImage/Circle.jpg";
				}
				else if(imgarr1.get(i).equals("Square") || imgarr2.get(i).equals("Square")){
					img = "CardImage/Square.jpg";			
				}
				else if(imgarr1.get(i).equals("Triangle") || imgarr2.get(i).equals("Triangle")){
					img = "CardImage/Triangle";
				}
				else if(imgarr1.get(i).equals("Arrow") || imgarr2.get(i).equals("Arrow")){
					img = "CardImage/Arrow.jpg";
				}
				else if(imgarr1.get(i).equals("Speech") || imgarr2.get(i).equals("Speech")){
					img = "CardImage/Speech.jpg";
				}
				else if(imgarr1.get(i).equals("Hexagon") || imgarr2.get(i).equals("Hexagon")){
					img = "CardImage/Hexagon.jpg";
				}
				else if(imgarr1.get(i).equals("Light") || imgarr2.get(i).equals("Light")){
					img = "CardImage/Light.jpg";
				}
				else if(imgarr1.get(i).equals("Light") || imgarr2.get(i).equals("Light")){
					img = "CardImage/Heart.jpg";
				}		
				else if(imgarr1.get(i).equals("Light") || imgarr2.get(i).equals("Light")){
					img = "CardImage/fourPStar.jpg";
				}
				deckrend.add(img); //add the correct string to the deck
			}
			
		}
		/*
		 * Just in case we need the image names again 
		 */
		
		public ArrayList<String> getDeckRend(){
			
			return deckrend; 
		}
}
