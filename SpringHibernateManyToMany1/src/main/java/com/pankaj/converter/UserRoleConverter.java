package com.pankaj.converter;

import java.util.ArrayList;
import java.util.List;

import com.pankaj.bean.AppUserBean;
import com.pankaj.bean.UserRoleBean;
import com.pankaj.model.AppUser;
import com.pankaj.model.UserRole;

public class UserRoleConverter {

	public static List<UserRoleBean> getUIBeanListFromEntityList(List<UserRole> userRoles) {
		List<UserRoleBean> beans = null;
		if (userRoles != null && !userRoles.isEmpty()) {

			beans = new ArrayList<UserRoleBean>();
			UserRoleBean bean = null;
			for (UserRole userRole : userRoles) {
				bean = new UserRoleBean();
				bean.setRoleId(userRole.getRoleId());
				bean.setRole(userRole.getRole());
				beans.add(bean);
			}

		}
		return beans;
	}

	public static List<UserRole> getEntityListFromUIBeanList(List<UserRoleBean> beans) {

		List<UserRole> userRoles = null;

		if (beans != null && !beans.isEmpty()) {
			userRoles = new ArrayList<UserRole>();
			UserRole userRole = null;
			for (UserRoleBean bean : beans) {
				if (bean != null) {
					userRole = new UserRole();
					userRole.setRoleId(bean.getRoleId());
					userRole.setRole(bean.getRole());
					userRoles.add(userRole);
				}
			}

		}
		return userRoles;
	}

	public static UserRoleBean getUIBeanFromEntity(UserRole userRole)
	{
		UserRoleBean bean = null;
		if(userRole!=null)
		{
			bean = new UserRoleBean();
			bean.setRoleId(userRole.getRoleId());
			bean.setRole(userRole.getRole());
		}
		return bean;
	}
	
	
	public static UserRole getEntityFromUIBean(UserRoleBean bean)
	{
		UserRole userRole = null;
		if(bean!=null)
		{
			userRole = new UserRole();
			userRole.setRoleId(bean.getRoleId());
			userRole.setRole(bean.getRole());
		}
		return userRole;
	}
}
