package com.pankaj.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pankaj.dao.UserDaoImpl;


public class UserAuthService implements UserDetailsService  {

	@Autowired
	private UserDaoImpl userDao;	
	
	
	

	/*public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}*/




	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		com.pankaj.model.User user = userDao.findUserByUserName(username);
		return new User(user.getName(), user.getPassword(), new ArrayList<GrantedAuthority>());
	}
	
	






}
