package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.user.client.ui.Composite;

import edu.ycp.cs320.gamingwebsite.shared.ISubscriber;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

public class loginView extends Composite implements ISubscriber{
	
	public loginView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("605px", "432px");
		
		Button btnNewButton = new Button("Sign in");
		btnNewButton.setText("Sign in");
		layoutPanel.add(btnNewButton);
		layoutPanel.setWidgetLeftWidth(btnNewButton, 270.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnNewButton, 284.0, Unit.PX, 30.0, Unit.PX);
		
		Label lblPassword = new Label("Password :");
		layoutPanel.add(lblPassword);
		layoutPanel.setWidgetLeftWidth(lblPassword, 124.0, Unit.PX, 68.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblPassword, 213.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox textBox = new TextBox();
		textBox.setName("Password");
		layoutPanel.add(textBox);
		layoutPanel.setWidgetLeftWidth(textBox, 219.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox, 213.0, Unit.PX, 34.0, Unit.PX);
		
		Label lblUserName = new Label("User Name :");
		layoutPanel.add(lblUserName);
		layoutPanel.setWidgetLeftWidth(lblUserName, 124.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblUserName, 153.0, Unit.PX, 18.0, Unit.PX);
		
		TextBox textBox_1 = new TextBox();
		textBox_1.setName("User name");
		layoutPanel.add(textBox_1);
		layoutPanel.setWidgetLeftWidth(textBox_1, 219.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox_1, 153.0, Unit.PX, 34.0, Unit.PX);
		
		Label lblGamingWebSite = new Label("Gaming Web Site");
		lblGamingWebSite.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblGamingWebSite.setStyleName("Main Game");
		layoutPanel.add(lblGamingWebSite);
		layoutPanel.setWidgetLeftWidth(lblGamingWebSite, 162.0, Unit.PX, 271.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblGamingWebSite, 53.0, Unit.PX, 49.0, Unit.PX);
		// init
	}
	
	public void update(){
		
	}

	@Override
	public void eventOccured(Object key,
			edu.ycp.cs320.gamingwebsite.shared.IPublisher publisher, Object hint) {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void eventOccurred(Object key, IPublisher publisher, Object hint) {
//		update();
//	}
}
