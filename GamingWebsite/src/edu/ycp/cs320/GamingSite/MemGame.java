
package edu.ycp.cs320.GamingSite;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author jfiddle, choward
 *
 */
public class MemGame {
	
	public static final double WIDTH = 640;
	public static final double HEIGHT = 480;
	
	private int[][] memcards;
	private MemCard memcard;
	private int time;
	private int scoring;
	private boolean gameover;
	private Image img;
	
	// constructor
	public MemGame(){
		memcard = new MemCard(img);
		memcards = new int[5][4];
		gameover = false;
		scoring = 0;
		time = 0;
		
		// random picture.
		for(int y = 0; y < 5; y++){
			for(int x = 0; x < 4; x++){
				memcard = new MemCard(img);
				//memcards[y][x] = memcard;
			}
		}
	}
	
	public void timerTick() {
		// beginning time
		time++;
		// boundarys
		
		
	}
	
}
