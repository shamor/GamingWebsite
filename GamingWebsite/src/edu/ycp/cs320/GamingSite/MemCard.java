package edu.ycp.cs320.GamingSite;
/**
 * 
 * @author jfiddle
 *
 * This class contains the data for creating the cards. Each card contains an image.
 * 
 */
public class MemCard {
	
	private Image img;
	private double x;
	private double y;
	
	public MemCard(Image i, double x, double y)
	{
		img = i;
		this.x = x;
		this.y = x;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	/**
	 * Checks to see if two cards are equal to each other by comparing the cards' images.
	 * 
	 * @param card1: The first card to compare.
	 * @param card2: The second card to compare.
	 * 
	 * @return true: Returns true if cards are equal, false if otherwise.
	 */
	public boolean isSame(MemCard card1, MemCard card2)
	{
		if(card1.equals(card2))
            return true;
        else
            return false;

	}

}
