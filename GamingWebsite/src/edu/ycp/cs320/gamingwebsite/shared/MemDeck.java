package edu.ycp.cs320.gamingwebsite.shared;


import java.util.ArrayList;
import java.util.Collections;
/***
 * 
 * @author cbechtol, Carl H Howard III(cp3)
 *
 */

public class MemDeck {
	private ArrayList<Images> memDeck;
	private boolean exposed;
	private ArrayList<String> deckrend;

	/***
	 * constuctor
	 */
	public MemDeck(){
		memDeck = new ArrayList<Images>();
		
		
		
	}	
	/***
	 * Creates the deck from
	 * which we will draw from
	 * to generate the field
	 */
	public void make(){
		
		Images[] allImages = Images.values();
		for(int i = 0; i < allImages.length;i++){
			memDeck.add(allImages[i]);
		}
		shuffle();
	}
	/***
	 * 
	 * @returns the size of the deck
	 */
	public int getNumCards() {
		return memDeck.size();
	}
	/***
	 * shuffles the deck so the
	 * game is not too easy
	 */
	public void shuffle() {
		//shuffles the deck
        Collections.shuffle(memDeck);
	}
	/**
	 * 
	 * @param i
	 * @return the I the card of the deck
	 */
	public Images getCard(int i){
		return memDeck.get(i);
	}
	/**
	 * 
	 * @param index
	 * @return the card removed from the deck
	 * and that card will be added to the field
	 */
//	public ArrayList<MemCard> removeCard(int index){
//		ArrayList<MemCard> removecard = new ArrayList<MemCard>();
//		for(int i = 0; i < removecard.size(); i++){
//			removecard.add(memDeck.get(i));
//		}
//		for(int i = 0; i < removecard.size(); i++){
//			memDeck.remove(memDeck.size()-1);
//		}
//		return removecard;
//	}
	public void render(){
		ArrayList<Images> imgarr1 = new ArrayList<>();
		ArrayList<Images> imgarr2 = new ArrayList<>();
		String img = "CardImage/star1.jpg";
		
		//make two decks of memcards and store in two arrays
		make();
		for(int i = 0; i<getNumCards(); i++){
			imgarr1.add(getCard(i));
		}
		
		shuffle(); //shuffle so the first deck is different
		for(int i = 0; i<getNumCards(); i++){
			imgarr2.add(getCard(i));
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

}
