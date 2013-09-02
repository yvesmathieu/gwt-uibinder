package com.ippon.formation.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;
import com.ippon.formation.gwt.client.event.ProcessLoginEvent;
import com.ippon.formation.gwt.client.presenter.LoginPresenter;
import com.ippon.formation.gwt.client.ui.resources.Resources;
import com.ippon.formation.gwt.client.view.LoginWidget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class LoginApp implements EntryPoint {
	/**
	 * Create a remote service proxy to talk to the server-side login service.
	 */
	private final LoginServiceAsync loginService = GWT.create(LoginService.class);

	private final HandlerManager eventBus = new HandlerManager(null);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Resources.INSTANCE.myCss().ensureInjected();

		LoginPresenter presenter = new LoginPresenter(new LoginWidget(eventBus), loginService);

		eventBus.addHandler(ProcessLoginEvent.TYPE, presenter);

		presenter.go(RootPanel.get());
	}
}
