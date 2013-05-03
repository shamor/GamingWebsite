

import java.util.ArrayList;
import junit.framework.TestCase;
import edu.ycp.cs320.gamingwebsite.shared.Images;
import edu.ycp.cs320.gamingwebsite.shared.MemDeck;

import org.junit.Before;
import org.junit.Test;


public class memDeckTest extends TestCase {
	private ArrayList<Images> deck;
	private ArrayList<Integer> imgshow;
	private MemDeck memdeck;
	private Images card1;
	private Images card2;
	private int numCards;
	
	
	@Before
	protected void setup(){
		deck = new ArrayList<Images>();
		imgshow = new ArrayList<Integer>();
		memdeck.make();

	}
	
	@Test
	public void testgetMemDeck(){
		
	}
	
	@Test
	public void testmake(){
	
	}
	
	@Test
	public void testgetNumCards(){
		assertEquals(20, memdeck.getNumCards());
		
	}
	
	@Test
	public void testshuffle(){
		
	
	}
	
	@Test
	public void testgetCard(){
		
		
	}
	
	@Test
	public void testisSame(){
		
		
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
