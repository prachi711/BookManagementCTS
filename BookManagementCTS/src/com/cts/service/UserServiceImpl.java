package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.Dao.UserDao;
import com.cts.Entity.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public boolean registerUser(User user) throws Exception {
		
		return userDao.registerUser(user);
	}

	@Override
	public boolean loginUser(User user) throws Exception {
		
		return userDao.loginUser(user);
	}

}
