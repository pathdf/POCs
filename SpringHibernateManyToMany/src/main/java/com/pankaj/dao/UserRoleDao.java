package com.pankaj.dao;

import java.util.List;

import com.pankaj.model.AppUser;
import com.pankaj.model.UserRole;

public interface UserRoleDao {
	
	public UserRole getUserRole(int id);
	public List<UserRole> listAllUserRole();
	public int saveUserRole(UserRole role);
	public void updateUserRole(UserRole role);
	public void deleteUserRole(UserRole role);
}
