package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.FillStrokeStyle;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.dom.client.Style.Unit;

public class MainWorld {
	private LayoutPanel layoutPanel;

	
	public MainWorld(){
		layoutPanel = new LayoutPanel();
		layoutPanel.setStyleName("Main Game");
		
		layoutPanel.setSize("1300px", "1100px");
		
		Image image_1 = new Image("CardImage/manlymen.jpg");
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 603.0, Unit.PX, 220.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 510.0, Unit.PX, 304.0, Unit.PX);
		
		Image image = new Image("CardImage/Mainworld.jpg");
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 0.0, Unit.PX, 1355.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, -26.0, Unit.PX, 1184.0, Unit.PX);
	}
}
