package edu.ycp.cs320.gamingwebsite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.gamingwebsite.shared.Images;
import edu.ycp.cs320.gamingwebsite.shared.MemDeck;

public class memDeckTest {
	
	private static final double DELTA = 0.00001;
	
	private MemDeck memdeck;
	private ArrayList<Images> deck;
	private Images card1;
	private Images card2;
	private Images card3;
	
	
	@Before
	public void setUp() {
		deck = new ArrayList<Images>();
		memdeck = new MemDeck();
		card1 = Images.Arrow;
		card2 = Images.Circle;
		card3 = Images.Arrow;
		memdeck.make();
		deck = memdeck.getMemDeck();
	
	}
	
	@Test
	public void testgetMemDeck(){
		assertSame(memdeck.getMemDeck(), deck);
	}
	
	@Test
	public void testmake(){
		assertNotNull(memdeck.getMemDeck());
	}
	
	@Test
	public void testgetNumCards() throws Exception {
		assertEquals(20, memdeck.getNumCards());
		
	}
	@Test
	public void testgetCard() {
		memdeck.getCard(1);
		
	}

	@Test
	public void testshuffle(){
		Images firstcard = memdeck.getCard(1);
		memdeck.shuffle(); 
		assertNotSame(firstcard, memdeck.getCard(1)); 
	}
	
	@Test
	public void testisSame(){
		card1 = memdeck.getCard(1); 
		card2 = Images.Circle;
		card3 = memdeck.getCard(1); 
		
		boolean same = memdeck.isSame(card3, card1);
		assertEquals(true, same);
		assertFalse(memdeck.isSame(Images.Arrow, card2));
		
	}
	@Test
	public void testresetImgShow(){
		memdeck.resetImgShow();
		assertEquals(0, memdeck.getImgshow().get(7), DELTA);
		
	}
	
	@Test
	public void testsetImgshow(){
		memdeck.setImgshow(5, 1);
		assertEquals(1, memdeck.getImgshow().get(5), DELTA);
		
	}
	
	@Test
	public void testgetImgshow(){
		memdeck.resetImgShow();
		assertEquals(0, memdeck.getImgshow().get(8), DELTA);
		
	}
	
	
}
