package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.FillStrokeStyle;

public class MainWorld {

	private Canvas canvas; 
	private Context2d context;
	private String red = "#000cd"; 
	
	public MainWorld(){
		canvas = Canvas.createIfSupported();
		
		createCanvas(canvas);
	}
	
	public void createCanvas(Canvas canvas){
		
		
	}
	
	public void map(Context2d context){
		context.beginPath();
		
		context.setFillStyle(red);
		context.fillRect(50, 50, 100, 200);
		
		context.closePath();
	}
}
