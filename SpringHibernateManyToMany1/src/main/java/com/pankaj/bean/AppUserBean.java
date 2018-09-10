package com.pankaj.bean;

import java.util.ArrayList;
import java.util.List;

public class AppUserBean {

	private Integer userId;
	private String firstName;
	private String lastName;
	private String address;
	private String emailId;
	private List<Integer> userRoleIds = new ArrayList<Integer>();
	private List<UserRoleBean> userRoles = new ArrayList<UserRoleBean>();
	private String roles="";
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<Integer> getUserRoleIds() {
		return userRoleIds;
	}
	public void setUserRoleIds(List<Integer> userRoleIds) {
		this.userRoleIds = userRoleIds;
	}
	public List<UserRoleBean> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(List<UserRoleBean> userRoles) {
		this.userRoles = userRoles;
		
		for(UserRoleBean role : userRoles)
		{
			if(!roles.isEmpty())
			{
				roles= roles+", "+role.getRole();
			}
			else
				roles+=role.getRole();
		}
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	
	
	
	
	
	
}
