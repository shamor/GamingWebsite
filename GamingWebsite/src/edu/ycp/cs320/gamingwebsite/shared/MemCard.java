
package edu.ycp.cs320.gamingwebsite.shared;
/**
 * 
 * @author jfiddle
 *
 * This class contains the data for creating the cards. Each card contains an image.
 * 
 */
public class MemCard {
	
	private Images img;
	

	public MemCard(Images i)

	{
		this.img = i;
	}
	
	
	
	/**
	 * Checks to see if two cards are equal to each other by comparing the cards' images.
	 * 
	 * @param card1: The first card to compare.
	 * @param card2: The second card to compare.
	 * 
	 * @return true: Returns true if cards are equal, false if otherwise.
	 */
	public boolean isSame(MemCard card1)
	{
		if(img.equals(card1.img))
            return true;
        else
            return false;

	}

}

