
package edu.ycp.cs320.gamingwebsite.shared;

import java.util.ArrayList;

/**
 * This class will contain information about the user's achievements 
 * @author shamor1
 */

public class Achievments {
	public static void main(String[] args){
		MemDeck deck = new MemDeck(); 
		deck.make(); 
		deck.render();
		System.out.println("the thing equals: " + deck.getCard(0).toString());
		System.out.println("the thing equals: " + deck.getStringarr().get(0));

	}


}
