package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.NumberLabel;

public class MemView extends Composite {
	public MemView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		InlineLabel lblDisplayScore = new InlineLabel("Score:");
		layoutPanel.add(lblDisplayScore);
		layoutPanel.setWidgetLeftWidth(lblDisplayScore, 293.0, Unit.PX, 38.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblDisplayScore, 0.0, Unit.PX, 26.0, Unit.PX);
		
		NumberLabel<Integer> intlblScore = new NumberLabel<Integer>();
		layoutPanel.add(intlblScore);
		layoutPanel.setWidgetLeftWidth(intlblScore, 337.0, Unit.PX, 113.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(intlblScore, 0.0, Unit.PX, 26.0, Unit.PX);
	}
}
