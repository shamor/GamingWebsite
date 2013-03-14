package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;




/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GamingWebUi implements EntryPoint {
	private Canvas canvas; 
	private int mousePosx;
	private int mousePosy;
	private Context2d context; 
	private ImageElement image; 
	
	 //timer refresh rate, in milliseconds   
	static final int refreshRate = 25; 
	
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		canvas = Canvas.createIfSupported();   
		canvas.setSize("662px", "532px");
		canvas.setCoordinateSpaceWidth(662);
		canvas.setCoordinateSpaceHeight(532);
		
		MemView view = new MemView();
		image = (ImageElement) new Image("CardImage/star1.jpg").getElement().cast(); 
		RootPanel.get().add(canvas, 10, 0);
		RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
		rootLayoutPanel.add(view);
		RootLayoutPanel.get().setWidgetTopBottom(view, 0.0, Unit.PX, 0.0, Unit.PX);
		RootLayoutPanel.get().setWidgetLeftRight(view, 0.0, Unit.PX, 0.0, Unit.PX);
		
		
		context.drawImage(image, 20.0, 30.0);
		// setup timer     
		final Timer timer = new Timer() {      
			@Override      
			public void run() {        
				Update();       }

			   
			};    
			timer.scheduleRepeating(refreshRate); 
			} 
		
	
		private void Update() {
			// TODO Auto-generated method stub this is where cody says memgame is going to go
			
		} 
}
