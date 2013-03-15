package edu.ycp.cs320.gamingwebsite.client;

import java.util.ArrayList;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Image;
import edu.ycp.cs320.gamingwebsite.shared.MemDeck;





public class MemView extends Composite {
	private MemDeck deck; 
	private	ArrayList<String> newdeck; 
	public MemView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("725px", "590px");
		//create the deck
		deck.make();
		deck.render();
		newdeck = deck.getStringarr();
		
		
		Image image = new Image(""+ newdeck.get(0));
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 76.0, Unit.PX, 119.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 88.0, Unit.PX, 214.0, Unit.PX);
		
		Image image_1 = new Image("");
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 257.0, Unit.PX, 51.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 116.0, Unit.PX, 117.0, Unit.PX);
		
		Label lblNewLabel = new Label(deck.getStringarr().get(0));
		layoutPanel.add(lblNewLabel);
		layoutPanel.setWidgetLeftWidth(lblNewLabel, 44.0, Unit.PX, 101.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblNewLabel, 0.0, Unit.PX, 18.0, Unit.PX);
		
	
	
	}
	public void setModel(MemDeck model) {
		this.deck = model;
	}
}
