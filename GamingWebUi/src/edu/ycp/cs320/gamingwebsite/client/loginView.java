package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.user.client.ui.Composite;

import edu.ycp.cs320.gamingwebsite.shared.ISubscriber;
import edu.ycp.cs320.pizza.shared.IPublisher;

public class loginView extends Composite implements ISubscriber{
	
	public loginView() {
		// init
	}
	
	public void update(){
		
	}
	
	@Override
	public void eventOccurred(Object key, IPublisher publisher, Object hint) {
		update();
	}
}
