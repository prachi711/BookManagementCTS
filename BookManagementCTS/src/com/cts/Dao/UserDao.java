package com.cts.Dao;

import com.cts.Entity.User;

public interface UserDao {

	
	// public UserDao getUserDAOImpl();
	boolean registerUser(User user) throws Exception;

	boolean loginUser(User user) throws Exception;
}
