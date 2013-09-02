package com.ippon.formation.gwt.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class ProcessLoginEvent extends GwtEvent<ProcessLoginEventHandler> {
	public static Type<ProcessLoginEventHandler> TYPE = new Type<ProcessLoginEventHandler>();

	private String Login;
	private String password;
	
	public ProcessLoginEvent(String login, String password) {
		this.Login = login;
		this.password = password;
	}
	
	@Override
	public Type<ProcessLoginEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ProcessLoginEventHandler handler) {
		handler.onProcessLogin(this);
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
