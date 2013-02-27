package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GamingWebUi implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		MemView view = new MemView();
		
		RootLayoutPanel.get().add(view);
		RootLayoutPanel.get().setWidgetTopBottom(view, 0.0, Unit.PX, 0.0, Unit.PX);
		RootLayoutPanel.get().setWidgetLeftRight(view, 0.0, Unit.PX, 0.0, Unit.PX);
	}
}
