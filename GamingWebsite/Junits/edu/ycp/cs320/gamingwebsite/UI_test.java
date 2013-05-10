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
	public void testgetcontact(){
		assertEquals(false, player1.getcontact());
		
		
	}
	
	@Test
	public void testcollision(){
		//first if
		player1.collision(486, 50, 0, 0);
		assertEquals(486.0, player1.getX());
		assertEquals(50.0, player1.getY());	
		//second if
		player1.collision(26, 316, 0, 0);
		assertEquals(26.0, player1.getX());
		assertEquals(316.0, player1.getY());
		// second if's nested if
		player1.collision(730, 314, 0, 0);
		assertEquals(true, player1.getcontact());
		// second if's nested else
		player1.collision(600, 314, 0, 0);
		assertEquals(false, player1.getcontact());
		//final else
		player1.collision(816, 313, 1, 1);
		assertEquals(815.0, player1.getX());
		assertEquals(312.0, player1.getY());
	}
	
	
	@Test

	public void testenterRoomMem(){
		//first if
		player1.setX(730);
		player1.setY(314);
		assertEquals(true, player1.enterRoomMem());
		//inter if's else
		player1.setX(600);
		player1.setY(314);
		assertEquals(false, player1.enterRoomMem());
		player1.setX(730);
		player1.setY(300);
		assertEquals(false, player1.enterRoomMem());

	}
		
}
