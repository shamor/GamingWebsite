package MemGame;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.GamingSite.*;


public class memCardTest extends TestCase {
	//define cards
	private MemCard firstCard;
	private MemCard secondCard;
	private MemCard thirdCard;
	
	@Before
	protected void setUp() throws Exception{
		firstCard = new MemCard(Image.Star);
		secondCard = new MemCard(Image.Triangle);
		thirdCard = new MemCard(Image.Star);
		
		
	}
	@Test
	public void testisSame(){
		assertFalse(firstCard.isSame(secondCard));
		assertTrue(firstCard.isSame(thirdCard));
	}
}
