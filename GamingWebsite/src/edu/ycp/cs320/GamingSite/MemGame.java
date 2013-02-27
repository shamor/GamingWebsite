
package edu.ycp.cs320.GamingSite;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author jfiddle, choward
 *
 */
public class MemGame {
	
	private MemDeck deck;
	
	
	public MemGame(){
		deck = new MemDeck();
		deck.make();	
	}
	
	public boolean isFinished(){
		for(int j=0; j < deck.getNumCards() - 1; j++)
		{
			if(deck.getCard(j).getExposed() == true)
				return false;
		}
		return true;
	}
	
	public void setCardFalse(MemCard card1, MemCard card2){
		if(card1.isSame(card2)){
			card1.setExposed(false);
		}
	}
	
	
	
	
}
