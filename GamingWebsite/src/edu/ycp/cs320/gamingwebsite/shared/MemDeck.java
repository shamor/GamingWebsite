package edu.ycp.cs320.gamingwebsite.shared;


import java.util.ArrayList;
import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

/***
 * 
 * @author cbechtol, Carl H Howard III(cp3), Sam Hamor
 *
 */

public class MemDeck {
	private ArrayList<Images> memDeck;
	private ArrayList<Integer> imgshow;
	//private boolean exposed;
	

	/***
	 * Constructor
	 */
	public MemDeck(){
		memDeck = new ArrayList<Images>();
		imgshow = new ArrayList<Integer>();
		for (int i = 0; i<20; i++){
			imgshow.add(0); 
		}
	}
	/**
	 * @return the memdeck
	 */
	public ArrayList<Images> getMemDeck() {
		return memDeck;
	}
	
	/***
	 * Creates the deck from
	 * which we will draw from
	 * to generate the field
	 */
	public void make(){
		resetImgShow();
		Images[] allImages = Images.values();

		for(int i = 0; i < allImages.length;i++){
			memDeck.add(allImages[i]);
		}
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
	 * shuffles the deck arrayList
	 * @return 
	 */
	public  void shuffle() {
		
		// See: http://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
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
	
	/**
	 * Set whether the image will be showing
	 * @param index index of the image showing
	 * @param value a 0 if the card is not showing, 1 if it is showing
	 */
	public void setImgshow(int index, Integer value){
		imgshow.set(index, value);
	}

	/**
	 * @return and array of 0 and 1 which determines which cards are showing
	 */
	public ArrayList<Integer> getImgshow() {
		return imgshow;
	}
	
	/**
	 * Turns all elements in imgshow back to zeros.
	 */
	public void resetImgShow(){
		for (int i = 0; i<memDeck.size(); i++){
			imgshow.set(i, 0); 
		}
	}
}
