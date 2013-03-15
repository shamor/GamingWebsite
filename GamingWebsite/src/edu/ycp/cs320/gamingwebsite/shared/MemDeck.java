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
		
		// FIXME: GWT doesn't emulate this method
        //Collections.shuffle(memDeck);
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
	
	
	
	

	
}
