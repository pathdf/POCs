package com.pankaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pankaj.bean.UserRoleBean;
import com.pankaj.converter.UserRoleConverter;
import com.pankaj.dao.UserRoleDao;
import com.pankaj.model.UserRole;

@Service("userRoleService")
@Transactional
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired(required=true)
	public UserRoleDao userRoleDao;
	public void addUserRole(UserRole userRole) {
		
		userRoleDao.saveUserRole(userRole);
		
	}

	public List<UserRoleBean> listUserRoles() {
		
		return UserRoleConverter.getUIBeanListFromEntityList(userRoleDao.listAllUserRole());
	}

	public UserRole getUserRole(int id) {
		
		return userRoleDao.getUserRole(id);
	}

	public void deleteUserRole(UserRole userRole) {
		
		userRoleDao.deleteUserRole(userRole);
	}

	public void updateUserRole(UserRole userRole) {
		
		userRoleDao.updateUserRole(userRole);
		
	}
	
	
	public List<UserRole> listAllUserRolesByIds(List<Integer> ids)
	{
		return userRoleDao.listUserRolesByIds(ids);
	}

	
}
