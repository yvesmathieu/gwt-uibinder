package com.ippon.formation.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.ippon.formation.gwt.shared.User;


/**
 * The async counterpart of <code>LoginService</code>.
 */
public interface LoginServiceAsync {
	void login(String login, String password, AsyncCallback<User> callback);
}
