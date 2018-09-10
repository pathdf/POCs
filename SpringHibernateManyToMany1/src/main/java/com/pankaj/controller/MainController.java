package com.pankaj.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pankaj.bean.AppUserBean;
import com.pankaj.converter.AppUserConverter;
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
	public ModelAndView addUser(@ModelAttribute("command") AppUserBean bean)
	{
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("appUsers",appUserService.listAppUsers());
		model.put("userRoles",userRoleService.listUserRoles());
		return new ModelAndView("add",model);
	}
	
	@RequestMapping(value="/edit")
	public ModelAndView editUser(@ModelAttribute("command")AppUserBean bean)
	{
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("appUser", appUserService.getAppUser(bean.getUserId()));
		model.put("appUsers",appUserService.listAppUsers());
		model.put("userRoles",userRoleService.listUserRoles());
		return new ModelAndView("add",model);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void saveUser(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("command")AppUserBean bean) throws IOException
	{
		Map<String,Object> model = new HashMap<String,Object>();
		List<UserRole> roles = userRoleService.listAllUserRolesByIds(bean.getUserRoleIds()) ;
		AppUser user = AppUserConverter.getEntityFromUIBean(bean);
		user.setUserRoles(roles);
		appUserService.addAppUser(user);
		res.sendRedirect("add.html");
//		model.put("appUser", new AppUser());
//		model.put("appUsers",appUserService.listAppUsers());
//		model.put("userRoles",userRoleService.listUserRoles());
//		return new ModelAndView("add",model);
	}
	
	
	@RequestMapping(value="/delete")
	public void deleteUser(HttpServletResponse res,@ModelAttribute("command")AppUserBean bean) throws IOException
	{
		AppUser user = appUserService.getAppUser(bean.getUserId());
		appUserService.deleteAppUser(user);
		res.sendRedirect("add.html");
	}
	

}
