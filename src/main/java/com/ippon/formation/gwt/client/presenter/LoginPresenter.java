package com.ippon.formation.gwt.client.presenter;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.ippon.formation.gwt.client.LoginServiceAsync;
import com.ippon.formation.gwt.client.event.ProcessLoginEvent;
import com.ippon.formation.gwt.client.event.ProcessLoginEventHandler;
import com.ippon.formation.gwt.shared.User;


public class LoginPresenter implements ProcessLoginEventHandler{

	public interface LoginView {
		public void displayLoginError();
		public void grantAccess(User user);
		public Widget asWidget();
	}

	LoginView view;

	LoginServiceAsync loginService;

	public LoginPresenter(LoginView view, LoginServiceAsync loginService) {
		this.view = view;
		this.loginService = loginService;
	}

	public void onProcessLogin(ProcessLoginEvent event) {
		loginService.login(event.getLogin(), event.getPassword(),
			new AsyncCallback<User>() {

				public void onSuccess(User result) {
					view.grantAccess(result);
				}

				public void onFailure(Throwable caught) {
					view.displayLoginError();
				}
			});
	}

	public void go(HasWidgets container) {
		container.clear();
		container.add(view.asWidget());
	}
}
