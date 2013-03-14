
package edu.ycp.cs320.gamingwebsite.shared;
/**
 * This class will contain information about the user's achievements 
 * @author shamor1
 */

public class Achievments {
	public static void main(String[] args){
		MemDeck deck = new MemDeck(); 
		deck.make(); 
		deck.render();
		
		String text  = deck.getCard(1).toString();
		System.out.println("the thing equals" + text);

	}


}
