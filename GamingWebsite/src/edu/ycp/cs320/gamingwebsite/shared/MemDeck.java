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

		for(int i = 0; i < 10;i++){
			memDeck.add(allImages[i]);
		}
		
		shuffle(memDeck);
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
	 * @return 
	 */
	public  void shuffle(ArrayList<Images> memdeck) {
		
		// This method reverses two cards by flipping two cards based on a random index
		int cardMovements = 1000;
		int numberOfCards = memdeck.size();
		
		for(int i = 1; i <= cardMovements; i++)
		{
			//finds a random card and gets its index
			Images randomCardOne = memdeck.get((int)(Math.random()*numberOfCards));
			int indexOne = memdeck.indexOf(randomCardOne);
			
			Images randomCardTwo = memdeck.get((int)(Math.random()*numberOfCards));
			int indexTwo = memdeck.indexOf(randomCardTwo);
			
			//flips the position of the two cards
			memdeck.set(indexOne, randomCardTwo);
			memdeck.set(indexTwo, randomCardOne);
		}
		
		
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
	 * Checks to see if two cards are equal to each other by comparing the cards' images.
	 * 
	 * @param card1: The first card to compare.
	 * @param card2: The second card to compare.
	 * 
	 * @return true: Returns true if cards are equal, false if otherwise.
	 */
	public boolean isSame(Images card1, Images card2)
	{
		if(card1.compareTo(card2)== 0){
            return true;
	}
        else{
            return false;
        }
	}
	

	
}
