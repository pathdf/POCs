package com.pankaj.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.pankaj.bean.AppUserBean;
import com.pankaj.model.AppUser;

public class AppUserConverter {


	public static List<AppUserBean> getUIBeanListFromEntityList(List<AppUser> appUsers) {
		List<AppUserBean> beans = null;
		
		if(appUsers!=null && !appUsers.isEmpty())
		{
			beans = new ArrayList<AppUserBean>();
			AppUserBean bean = null;
			for(AppUser appUser : appUsers)
			{
				bean = new AppUserBean();
				bean.setUserId(appUser.getUserId());
				bean.setFirstName(appUser.getFirstName());
				bean.setLastName(appUser.getLastName());
				bean.setEmailId(appUser.getEmailId());
				bean.setAddress(appUser.getAddress());
				bean.setUserRoles(UserRoleConverter.getUIBeanListFromEntityList(appUser.getUserRoles()));
				beans.add(bean);
				
			}
		}
		
		
		return beans;
	}

	public static List<AppUser> getEntityListFromUIBeanList(List<AppUserBean> beans) {
		List<AppUser> appUsers = null;
		if (beans != null && !beans.isEmpty()) {
			appUsers = new ArrayList<AppUser>();
			AppUser appUser = null;
			for(AppUserBean bean : beans)
			{
				appUser = new AppUser();
				appUser.setUserId(bean.getUserId());
				appUser.setFirstName(bean.getFirstName());
				appUser.setLastName(bean.getLastName());
				appUser.setAddress(bean.getAddress());
				appUser.setEmailId(bean.getEmailId());
				appUser.setUserRoles(UserRoleConverter.getEntityListFromUIBeanList(bean.getUserRoles()));
				appUsers.add(appUser);
			}
			
			
		}
		return appUsers;
	}
	
	public static AppUserBean getUIBeanFromEntity(AppUser appUser)
	{
		AppUserBean bean = null;
		if(appUser!=null)
		{
			bean = new AppUserBean();
			bean.setUserId(appUser.getUserId());
			bean.setFirstName(appUser.getFirstName());
			bean.setLastName(appUser.getLastName());
			bean.setEmailId(appUser.getEmailId());
			bean.setAddress(appUser.getAddress());
			bean.setUserRoles(UserRoleConverter.getUIBeanListFromEntityList(appUser.getUserRoles()));
		}
		return bean;
	}
	
	public static AppUser getEntityFromUIBean(AppUserBean bean)
	{
		AppUser appUser = null;
		if(bean!=null)
		{
			appUser = new AppUser();
			appUser.setUserId(bean.getUserId());
			appUser.setFirstName(bean.getFirstName());
			appUser.setLastName(bean.getLastName());
			appUser.setAddress(bean.getAddress());
			appUser.setEmailId(bean.getEmailId());
			appUser.setUserRoles(UserRoleConverter.getEntityListFromUIBeanList(bean.getUserRoles()));
			bean=null;
		}
		return appUser;
	}
}
