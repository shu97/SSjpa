package com.chason.service;

import java.util.Map;

import com.chason.bean.User;

/**
 * The Interface UserService.
 */
public interface UserService {

	/**
	 * Gets the user by name.
	 *
	 * @param username the user name
	 * @return the user by name
	 */
	public User getUserByName(String username);
	
	
}
