package com.iluwatar.tasklist.services.dao;

import java.util.Collection;

import com.iluwatar.tasklist.services.entity.User;

public interface UserDao {
	
	void addUser(User user);
	
	void removeUser(int userId);
	
	void clearUsers();

	Collection<User> findAll();
	
	User getUser(int userId);

	User getUserByUsername(String username);
	
	boolean loginUser(String username, String passwordHash);
	
}
