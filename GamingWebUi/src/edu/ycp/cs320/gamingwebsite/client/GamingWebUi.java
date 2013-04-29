package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootLayoutPanel;



/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GamingWebUi implements EntryPoint {
	loginView view;
	MainWorld view2;


	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
		view = new loginView();
		view2 = new MainWorld();
		rootLayoutPanel.add(view2);	
		RootLayoutPanel.get().setWidgetTopBottom(view2, 0.0, Unit.PX, 0.0, Unit.PX);
		RootLayoutPanel.get().setWidgetLeftRight(view2, 0.0, Unit.PX, 0.0, Unit.PX);
		view2.update();
		view2.render();

	new Timer(){
		  @Override
		  public void run(){
			  view2.update();
			  view2.render();
		  }
	  }.scheduleRepeating(5);


	} 
	
	}


