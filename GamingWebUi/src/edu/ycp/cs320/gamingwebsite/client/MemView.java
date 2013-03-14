package edu.ycp.cs320.gamingwebsite.client;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Image;

import edu.ycp.cs320.gamingwebsite.shared.MemDeck;


public class MemView extends Composite {
	private MemDeck deck; 
	private MemDeckRender newdeck; 
	public MemView() {
		newdeck.render(deck);
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("725px", "590px");
		ArrayList<String> img = newdeck.getDeckRend(); 
		
		
		
		Image image = new Image(img.get(0));
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 76.0, Unit.PX, 201.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 34.0, Unit.PX, 249.0, Unit.PX);
		
		Image image_1 = new Image(img.get(6));
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 257.0, Unit.PX, 141.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 34.0, Unit.PX, 147.0, Unit.PX);
		
		Label lblNewLabel = new Label(img.get(0));
		layoutPanel.add(lblNewLabel);
		layoutPanel.setWidgetLeftWidth(lblNewLabel, 44.0, Unit.PX, 101.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblNewLabel, 0.0, Unit.PX, 18.0, Unit.PX);
		

		

		
	
	}
}
