package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;

public class MemView extends Composite {
	public MemView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		InlineLabel nlnlblHeyThere = new InlineLabel("Hey there");
		layoutPanel.add(nlnlblHeyThere);
		layoutPanel.setWidgetLeftWidth(nlnlblHeyThere, 0.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(nlnlblHeyThere, 42.0, Unit.PX, 18.0, Unit.PX);
		
		Button btnAButton = new Button("A button");
		layoutPanel.add(btnAButton);
		layoutPanel.setWidgetLeftWidth(btnAButton, 38.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnAButton, 107.0, Unit.PX, 30.0, Unit.PX);
	}
}
