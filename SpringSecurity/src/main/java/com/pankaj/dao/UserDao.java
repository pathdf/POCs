package com.pankaj.dao;

import com.pankaj.model.User;

public interface UserDao {

	public User findUserByUserName(String name);
}
