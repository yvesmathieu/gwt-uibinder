package com.ippon.formation.gwt.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.ippon.formation.gwt.client.event.ProcessLoginEvent;
import com.ippon.formation.gwt.client.presenter.LoginPresenter.LoginView;
import com.ippon.formation.gwt.shared.User;


public class LoginWidget extends Composite implements LoginView {
	interface MyUiBinder extends UiBinder<HTMLPanel, LoginWidget> {
	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

	@UiField
	Label loginLabel;

	@UiField
	Label passwordLabel;

	@UiField
	TextBox login;

	@UiField
	PasswordTextBox password;

	@UiField
	Button processLogin;

	HandlerManager eventBus;

	public LoginWidget(HandlerManager eventBus) {
		this.eventBus = eventBus;
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("processLogin")
	void processLogin(ClickEvent event) {
		eventBus.fireEvent(new ProcessLoginEvent(login.getText(), password.getText()));
	}

	public void displayLoginError() {
		Window.alert("Wrong login/password combination. Please try again !");
	}

	public void grantAccess(User user) {
		Window.alert("Login successful, welcome " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public Widget asWidget() {
		return this;
	}
}
