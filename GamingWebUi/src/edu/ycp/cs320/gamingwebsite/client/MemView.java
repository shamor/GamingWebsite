package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

public class MemView extends Composite {
	public MemView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		InlineLabel lblDisplayScore = new InlineLabel("Score:");
		layoutPanel.add(lblDisplayScore);
		layoutPanel.setWidgetLeftWidth(lblDisplayScore, 316.0, Unit.PX, 38.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblDisplayScore, 0.0, Unit.PX, 26.0, Unit.PX);
		
		Label lblScore = new Label("0");
		lblScore.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		layoutPanel.add(lblScore);
		layoutPanel.setWidgetLeftWidth(lblScore, 360.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblScore, 0.0, Unit.PX, 26.0, Unit.PX);
		
		Button btnReplay = new Button("New button");
		btnReplay.setText("Replay");
		layoutPanel.add(btnReplay);
		layoutPanel.setWidgetLeftWidth(btnReplay, 0.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnReplay, 260.0, Unit.PX, 40.0, Unit.PX);
	}
}
