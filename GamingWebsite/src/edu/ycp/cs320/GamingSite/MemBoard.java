package edu.ycp.cs320.GamingSite;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * 
 * @author jfiddle
 *
 */
public class MemBoard  extends JPanel{
	private static final long serialVersionUID = 1L;

	private static final Color BACKGROUND_COLOR = new Color(0, 127, 0);
	public static final double cardHeight = 200;
	public static final double cardWidth = 150;
	private static final Font font = new Font("Dialog", Font.BOLD, 48);
	
	private MemGame game;	
	
	
	
	public MemBoard(MemGame game){
		this.game = game;
	
		setBackground(BACKGROUND_COLOR);
	
		//setPreferredSize(new Dimension((int) MemGame.WIDTH, (int) MemGame.HEIGHT));
	}
	
	public void startGame() {
		// Create the animation timer.
		// It will fire an event about 60 times per second.
		// Every time a timer event fires the handleTimerEvent method will be called.
		Timer timer = new Timer(1000 / 60, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleTimerEvent();
			}
		});
		
		timer.start();
		// Add a listener for mouse clicked
		// Each time the mouse is clicked, the handleMouseClick method will be called.
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				handleMouseClick(e);
			}
		});
	}
	
	protected void handleTimerEvent() {
		// this updates when a card is chosen
//		if (game.getcaught()== true){
//		game.timerTick();
//		
//		}
//		
		repaint();
	}
	
	protected void handleMouseClick(MouseEvent e) {
//		this will be changed based on which card the user chooses
		
//		double y = 0, x = e.getX();
//		y += game.getbucket().getWidth()/2;
//		x -= y; 
//		//reinitialize the bucket to match movement
//		
//		if (x<=555 && x>= 5)
//		{
//		bucketleft = new Point(x, 440.0);
//		game.setBucketleft(bucketleft);
//		}
//		
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // paint the background
		//int placement; 
		//Image[][] images = new Image[4][5];
		
		
		//paint the game objects
		for(int i =0; i<=20; i++){
		//g.drawImage(img, 20, 20, cardWidth, cardHeight, observer); //dont know what an image observer is . 
		}
		
	}
	
	
	
	
	
	
	
	
	
}
