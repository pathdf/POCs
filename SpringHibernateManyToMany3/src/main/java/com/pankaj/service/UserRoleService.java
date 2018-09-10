package com.pankaj.service;

import java.util.List;

import com.pankaj.bean.UserRoleBean;
import com.pankaj.model.AppUser;
import com.pankaj.model.UserRole;

public interface UserRoleService {

	public void addUserRole(UserRole userRole);
	public List<UserRoleBean> listUserRoles();
	public UserRole getUserRole(int id);
	public void deleteUserRole(UserRole userRole);
	public void updateUserRole(UserRole userRole);
	public List<UserRole> listAllUserRolesByIds(List<Integer> ids);
}
