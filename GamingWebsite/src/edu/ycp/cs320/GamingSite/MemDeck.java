package edu.ycp.cs320.GamingSite;

import java.util.ArrayList;
import java.util.Collections;
/***
 * 
 * @author cbechtol, Carl H Howard III(cp3)
 *
 */

public class MemDeck {
	private ArrayList<MemCard> memDeck;
	private boolean exposed;
	/***
	 * constuctor
	 */
	public MemDeck(){
		memDeck = new ArrayList<MemCard>();
	}	
	/***
	 * Creates the deck from
	 * which we will draw from
	 * to generate the field
	 */
	public void make(){
		Image[] allImages = Image.values();
		for(int i = 0; i <= allImages.length;i++){
			memDeck.add(new MemCard(allImages[i]));
			shuffle();
		}
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
	 * @return the I th card of the deck
	 */
	public MemCard getCard(int i){
		return memDeck.get(i);
	}
	/**
	 * 
	 * @param index
	 * @return the card removed from the deck
	 * and that card will be added to the field
	 */
	public ArrayList<MemCard> removeCard(int index){
		ArrayList<MemCard> removecard = new ArrayList<MemCard>();
		for(int i = 0; i < removecard.size(); i++){
			removecard.add(memDeck.get(i));
		}
		for(int i = 0; i < removecard.size(); i++){
			memDeck.remove(memDeck.size()-1);
		}
		return removecard;
	}
	

}
