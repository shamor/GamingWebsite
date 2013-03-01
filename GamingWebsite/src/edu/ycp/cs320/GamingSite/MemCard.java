
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
	private boolean exposed;
	
	public MemCard(Image i)
	{
		img = i;
		boolean exposed = true;
	}
	
	public Image getImg() {
		return img;
	}
	
	public void setImg(Image img) {
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
	public boolean isSame(MemCard card1)
	{
		if(img.equals(card1.img))
            return true;
        else
            return false;
	}
	
	public boolean getExposed(){
		return exposed;
	}
	
	public void setExposed(boolean exposed){
		this.exposed = exposed;
	}

}

