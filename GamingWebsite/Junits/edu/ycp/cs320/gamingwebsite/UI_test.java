package edu.ycp.cs320.gamingwebsite;



import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import edu.ycp.cs320.gamingwebsite.shared.Player;

public class UI_test extends TestCase {
	
	// constructor
	private Player player1;
	private static final double DELTA = .00001;
	
	@Before
	protected void setUp() throws Exception{
		player1 = new Player();
		player1.setX(50);
		player1.setY(50);
		
	}
	@Test
	public void testgetX(){
		assertEquals(50, player1.getX(), DELTA);
	}
	
	@Test
	public void testgetY(){
		assertEquals(50, player1.getY(), DELTA);
	}
	
	@Test
	public void testsetX(){
		player1.setX(20);
		assertEquals(20, player1.getX(), DELTA);
		
	}
	
	@Test
	public void testsetY(){
		player1.setY(40);
		assertEquals(40, player1.getY(), DELTA);
		
	}
	
	@Test
	public void testenterRoomMem() {
		player1.setX(690);
		player1.setY(314);
		
		
		
	}
}
