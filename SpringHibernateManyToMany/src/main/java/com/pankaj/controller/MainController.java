package com.pankaj.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pankaj.bean.AppUserBean;
import com.pankaj.bean.UserRoleBean;
import com.pankaj.model.AppUser;
import com.pankaj.model.UserRole;
import com.pankaj.service.AppUserService;
import com.pankaj.service.UserRoleService;

@Controller
public class MainController {
	
	@Autowired(required=true)
	public AppUserService appUserService;
	
	@Autowired(required=true)
	public UserRoleService userRoleService;
	
	@RequestMapping(value="/add")
	public ModelAndView addUser(@ModelAttribute("command") AppUser appUser)
	{
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("appUsers", prepareListOfAppUserBean(appUserService.listAppUsers()));
		return new ModelAndView("add",model);
	}
	public List<AppUserBean> prepareListOfAppUserBean(List<AppUser> appUsers)
	{
		List<AppUserBean> beans = null;
		if(appUsers!= null && !appUsers.isEmpty())
		{
			beans = new ArrayList<AppUserBean>();
			AppUserBean bean=null;
			for(AppUser appUser : appUsers)
			{
				bean = new AppUserBean();
				bean.setUserId(appUser.getUserId());
				bean.setFirstName(appUser.getFirstName());
				bean.setLastName(appUser.getLastName());
				bean.setAddress(appUser.getAddress());
				bean.setEmailId(appUser.getEmailId());
				bean.setUserRoles(prepareListOfUserRoleBean(appUser.getUserRoles()));
				beans.add(bean);
			}
		}
		return beans;
		
	}
	
	public List<UserRoleBean> prepareListOfUserRoleBean(List<UserRole> userRoles)
	{
		List<UserRoleBean> beans = null;
		if(userRoles!=null && !userRoles.isEmpty())
		{
			UserRoleBean bean = null;
			beans = new ArrayList<UserRoleBean>();
			for(UserRole userRole : userRoles)
			{
				bean= new UserRoleBean();
				bean.setRoleId(userRole.getRoleId());
				bean.setRole(userRole.getRole());
				beans.add(bean);
			}
		}
		return beans;
	}

}
