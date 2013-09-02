package com.ippon.formation.gwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.ippon.formation.gwt.shared.User;
import com.ippon.formation.gwt.shared.exception.AuthenticationFailureException;


/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	User login(String login, String password) throws AuthenticationFailureException;
}
