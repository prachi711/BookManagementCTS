package com.cts.service;



import com.cts.Entity.User;


public interface UserService {

	
	boolean registerUser(User user) throws Exception;

	boolean loginUser(User user) throws Exception;
}
