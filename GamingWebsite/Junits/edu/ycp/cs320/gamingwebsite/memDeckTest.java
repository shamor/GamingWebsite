package edu.ycp.cs320.gamingwebsite;

import java.util.ArrayList;
import junit.framework.TestCase;
import edu.ycp.cs320.gamingwebsite.shared.Images;
import edu.ycp.cs320.gamingwebsite.shared.MemDeck;

import org.junit.Before;
import org.junit.Test;


public class memDeckTest extends TestCase {
	private static final double DELTA = 0.00001;
	
	private ArrayList<Images> deck;
	private ArrayList<Integer> imgshow;
	private MemDeck memdeck;
	private Images card1;
	private Images card2;
	private Images card3;
	private int numCards;
	
	
	@Before
	protected void setup() throws Exception {
		deck = new ArrayList<Images>();
		imgshow = new ArrayList<Integer>();
		memdeck = new MemDeck();
		card1 = Images.Arrow;
		card2 = Images.Circle;
		card3 = Images.Arrow;
		deck = memdeck.getMemDeck();
		
	}
	
	@Test
	public void testgetMemDeck(){
		assertEquals(deck, memdeck.getMemDeck());
	}
	
	@Test
	public void testmake(){
	
	}
	
	@Test
	public void testgetNumCards() throws Exception {
		assertEquals(20, memdeck.getNumCards());
		
	}
	
	private void getCard(int i, int numCards2) {
		memdeck.getCard(1)
		
	}

	@Test
	public void testshuffle(){
		
	
	}
	
	@Test
	public void testgetCard(){
		
		
	}
	
	@Test
	public void testisSame(){
		assertTrue(memdeck.isSame(card1, card3));
		assertFalse(memdeck.isSame(card1, card2));
		
	}
	
	@Test
	public void testsetImgshow(){
		
		
	}
	
	@Test
	public void testgetImgshow(){
		
		
	}
	
	@Test
	public void testresetImgShow(){
		
		
	}
}
