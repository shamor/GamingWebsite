package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;

import edu.ycp.cs320.gamingwebsite.shared.ISubscriber;
import edu.ycp.cs320.gamingwebsite.shared.Login;

import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class loginView extends Composite /*implements ISubscriber*/{
	private TextBox usernameTextBox;
	private TextBox passwordTextBox;
	private Label errorLabel;
	
	public loginView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("605px", "432px");
		
		Button btnNewButton = new Button("Sign in");
		btnNewButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleSignInClicked();
			}
		});
		btnNewButton.setText("Sign in");
		layoutPanel.add(btnNewButton);
		layoutPanel.setWidgetLeftWidth(btnNewButton, 270.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnNewButton, 284.0, Unit.PX, 30.0, Unit.PX);
		
		Label lblPassword = new Label("Password :");
		layoutPanel.add(lblPassword);
		layoutPanel.setWidgetLeftWidth(lblPassword, 124.0, Unit.PX, 68.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblPassword, 213.0, Unit.PX, 34.0, Unit.PX);
		
		passwordTextBox = new TextBox();
		passwordTextBox.setName("Password");
		layoutPanel.add(passwordTextBox);
		layoutPanel.setWidgetLeftWidth(passwordTextBox, 219.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(passwordTextBox, 213.0, Unit.PX, 34.0, Unit.PX);
		
		Label lblUserName = new Label("User Name :");
		layoutPanel.add(lblUserName);
		layoutPanel.setWidgetLeftWidth(lblUserName, 124.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblUserName, 153.0, Unit.PX, 18.0, Unit.PX);
		
		usernameTextBox = new TextBox();
		usernameTextBox.setName("User name");
		layoutPanel.add(usernameTextBox);
		layoutPanel.setWidgetLeftWidth(usernameTextBox, 219.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(usernameTextBox, 153.0, Unit.PX, 34.0, Unit.PX);
		
		Label lblGamingWebSite = new Label("Gaming Web Site");
		lblGamingWebSite.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblGamingWebSite.setStyleName("Main Game");
		layoutPanel.add(lblGamingWebSite);
		layoutPanel.setWidgetLeftWidth(lblGamingWebSite, 162.0, Unit.PX, 271.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblGamingWebSite, 53.0, Unit.PX, 49.0, Unit.PX);
		
		errorLabel = new Label("New label");
		layoutPanel.add(errorLabel);
		layoutPanel.setWidgetLeftWidth(errorLabel, 20.0, Unit.PX, 566.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(errorLabel, 341.0, Unit.PX, 23.0, Unit.PX);
		// init
	}
	
	protected void handleSignInClicked() {
		// RPC call to server to see if username/password is valid
		
		RPC.loginService.findLogin(usernameTextBox.getText(), passwordTextBox.getText(), new AsyncCallback<Login>() {
			
			@Override
			public void onSuccess(Login result) {
				if (result == null) {
					errorLabel.setText("No such username/password");
				} else {
					// TODO: switch to home page
					errorLabel.setText("Success (should go to home page)");
				}
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO: display error (e.g., in a label)
				errorLabel.setText("Error logging in (could not contact server)");
			}
		});
	}

	public void update(){
		
	}
}
