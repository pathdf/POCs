package com.pankaj.bean;

import java.util.ArrayList;
import java.util.List;

import com.pankaj.bean.AppUserBean;

public class UserRoleBean {

	private Integer roleId;
	private String role;
	private List<AppUserBean> appUsers = new ArrayList<AppUserBean>();
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
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
