package edu.ycp.cs320.GamingSite.Memory.src;

/**
 * 
 * @author jfiddle
 *
 * This class contains the data for creating the cards. Each card contains an image.
 * 
 */
public class MemCard {
	
	private Image img;
	
	public MemCard(Image img)
	{
		this.img = img;
	}
	
	/**
	 * Checks to see if two cards are equal to each other by comparing the cards' images.
	 * 
	 * @param card1: The first card to compare.
	 * @param card2: The second card to compare.
	 * 
	 * @return true: Returns true if cards are equal, false if otherwise.
	 */
	public boolean isSame(MemCard card2)
	{
		if(card2.img.compareTo(img) == 0)
			return true;
		else
			return false;
	}
}
