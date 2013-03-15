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
		deckrend = new ArrayList<String>();
		
		
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
	/**
	 * This method takes an two initial decks and combine them by making their values 
	 * equal to their file names in a separate array
	 */
	
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
		
			for(int i = 0; i<20; i++){
			
				if(imgarr1.get(i).toString().equals("Star") || imgarr2.get(i).toString().equals("Star")){
					img = "CardImage/star1.jpg";
					deckrend.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Circle") || imgarr2.get(i).toString().equals("Circle")){
					img = "CardImage/Circle.jpg";
					deckrend.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Square") || imgarr2.get(i).toString().equals("Square")){
					img = "CardImage/Square.jpg";	
					deckrend.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Triangle") || imgarr2.get(i).toString().equals("Triangle")){
					img = "CardImage/Triangle";
					deckrend.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Arrow") || imgarr2.get(i).toString().equals("Arrow")){
					img = "CardImage/Arrow.jpg";
					deckrend.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Speech") || imgarr2.get(i).toString().equals("Speech")){
					img = "CardImage/Speech.jpg";
					deckrend.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Hexagon") || imgarr2.get(i).toString().equals("Hexagon")){
					img = "CardImage/Hexagon.jpg";
					deckrend.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Light") || imgarr2.get(i).toString().equals("Light")){
					img = "CardImage/Light.jpg";
					deckrend.add(img); //add the correct string to the deck
				}
				else if(imgarr1.get(i).toString().equals("Light") || imgarr2.get(i).toString().equals("Light")){
					img = "CardImage/Heart.jpg";
					deckrend.add(img); //add the correct string to the deck
				}		
				else if(imgarr1.get(i).toString().equals("Light") || imgarr2.get(i).toString().equals("Light")){
					img = "CardImage/fourPStar.jpg";
					deckrend.add(img); //add the correct string to the deck
				}
				else{
					deckrend.add(img); //add the correct string to the deck
				}
		}
		
	}
	
	public ArrayList<String> getStringarr()
	{
		return deckrend; 
	}
}
