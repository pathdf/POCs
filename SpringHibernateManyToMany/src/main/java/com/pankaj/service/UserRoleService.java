package com.pankaj.service;

import java.util.List;

import com.pankaj.model.UserRole;
import com.pankaj.model.UserRole;

public interface UserRoleService {

	public void addUserRole(UserRole userRole);
	public List<UserRole> listUserRoles();
	public UserRole getUserRole(int id);
	public void deleteUserRole(UserRole userRole);
	public void updateUserRole(UserRole userRole);
}
