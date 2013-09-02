package com.ippon.formation.gwt.server;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.ippon.formation.gwt.client.LoginService;
import com.ippon.formation.gwt.shared.User;
import com.ippon.formation.gwt.shared.exception.AuthenticationFailureException;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {

	List<User> users = new ArrayList<User>();

	public LoginServiceImpl() {
		users.add(new User("1", "Han", "Solo", "ishotfirst@millenium.com", "password"));
	}


	public User login(String login, String password) throws AuthenticationFailureException {
		User loggedUser = null;

		for (User user : users) {
			if (user.getEmailAddress().equalsIgnoreCase(login)
					&& user.getPassword().equals(password)) {
				loggedUser = user;
				break;
			}
		}

		if (loggedUser == null) {
			throw new AuthenticationFailureException();
		}

		return loggedUser;
	}
}
