package com.pankaj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pankaj.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
}
