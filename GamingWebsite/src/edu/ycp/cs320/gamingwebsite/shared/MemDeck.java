package edu.ycp.cs320.gamingwebsite.shared;


import java.util.ArrayList;
import java.util.Random;

/***
 * 
 * @author cbechtol, Carl H Howard III(cp3)
 *
 */

public class MemDeck {
	private ArrayList<Images> memDeck;
	//private boolean exposed;
	

	/***
	 * constuctor
	 */
	public MemDeck(){
		memDeck = new ArrayList<Images>();
		
		
	}
	
	public ArrayList<Images> getMemDeck() {
		return memDeck;
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
//		shuffle();
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
	 * shuffles the deck
	 * @return 
	 */
	public  void shuffle() {
		/*
		// This method reverses two cards by flipping two cards based on a random index
		int cardMovements = 1000;
		int numberOfCards = memDeck.size();
		
		for(int i = 1; i <= cardMovements; i++)
		{
			//finds a random card and gets its index
			Images randomCardOne = memDeck.get((int)(Math.random()*numberOfCards));
			int indexOne = memDeck.indexOf(randomCardOne);
			
			Images randomCardTwo = memDeck.get((int)(Math.random()*numberOfCards));
			int indexTwo = memDeck.indexOf(randomCardTwo);
			
			//flips the position of the two cards
			memDeck.set(indexOne, randomCardTwo);
			memDeck.set(indexTwo, randomCardOne);
		}
		
		*/
		
		// See: http://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
		// To shuffle an array a of n elements (indices 0..n-1):
        // for i from n − 1 downto 1 do
        //   j ← random integer with 0 ≤ j ≤ i
        //   exchange a[j] and a[i]
		Random r = new Random();
		for (int i = memDeck.size() - 1; i > 0; i--) {
			int j = r.nextInt(i+1);
			Images tmp = memDeck.get(j);
			memDeck.set(j, memDeck.get(i));
			memDeck.set(i, tmp);
		}
	}
	
	/**
	 *returns a card from the deck 
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
	 * @param card1: The first card to compare.
	 * @param card2: The second card to compare.
	 * @return true: Returns true if cards are equal, false if otherwise.
	 */
	public boolean isSame(Images card1, Images card2){
	
		if(card1.equals(card2)){
            return true;
		}
        else{
            return false;
        }
	}
	
	

	
}
