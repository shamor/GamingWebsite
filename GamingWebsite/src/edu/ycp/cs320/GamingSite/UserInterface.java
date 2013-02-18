package edu.ycp.cs320.GamingSite;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * This class will contain the functionality for the user interface
 * All functions for drawing to the screen will be done here and only here
 * @author shamor1
 *
 */
public class UserInterface extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public static final double WIDTH = 600;
	public static final double HEIGHT = 700;
	
	
	private Avatar av; 
	
	public UserInterface(Avatar av) {
		// create and set the starting dimensions for the UI
		this.av = av;
		
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension((int) WIDTH, (int) HEIGHT));

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

			private void handleTimerEvent() {
				// TODO Auto-generated method stub
				
			}
		});
		
		timer.start();

	}}
