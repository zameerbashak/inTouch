package com.InTouch.services;

import com.InTouch.entities.User;

public interface UserService {
	boolean userExists(String username, String email);

	void addUser(User user);

	boolean validateUser(String username, String password);

}
