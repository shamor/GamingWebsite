package edu.ycp.cs320.gamingwebsite.client;


import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;

public class MainWorld {
	private LayoutPanel layoutPanel;
	private Canvas canvas;
	private ImageElement img;
	
	public MainWorld(){
		layoutPanel = new LayoutPanel();
		
		canvas = Canvas.createIfSupported();
		
		// if the user presses a key
		canvas.addKeyPressHandler(new KeyPressHandler() {
			public void onKeyPress(KeyPressEvent event) {
				
			}3
		});
		
		canvas.setEnabled(true);
		canvas.setCoordinateSpaceWidth(1000);
		canvas.setCoordinateSpaceHeight(800);
		layoutPanel.add(canvas);
		layoutPanel.setWidgetLeftWidth(canvas, 0.0, Unit.PX, 765.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(canvas, 0.0, Unit.PX, 471.0, Unit.PX);
		
		MakeCanvas(canvas.getContext2d());
	}
	
	public void MakeCanvas(Context2d context){
		// beginning the path
		context.beginPath();
		// sendto the image
		img = (ImageElement) new Image("CardImage/Mainworld.jpg").getElement().cast();
		// drawing the image
		context.drawImage(img, 0, 0, 1000, 800);
		// ending the path
		context.closePath();
	}
}
