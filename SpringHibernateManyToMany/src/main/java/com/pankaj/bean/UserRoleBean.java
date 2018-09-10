package com.pankaj.bean;

import java.util.ArrayList;
import java.util.List;

import com.pankaj.bean.AppUserBean;

public class UserRoleBean {

	private int roleId;
	private String role;
	private List<AppUserBean> appUsers = new ArrayList<AppUserBean>();
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<AppUserBean> getAppUsers() {
		return appUsers;
	}
	public void setAppUsers(List<AppUserBean> appUsers) {
		this.appUsers = appUsers;
	}
	
	
}
