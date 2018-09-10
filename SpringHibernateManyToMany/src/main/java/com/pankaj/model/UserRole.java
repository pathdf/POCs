package com.pankaj.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user_role")
public class UserRole {
	
	@Id
	@SequenceGenerator(name="sequence_userrole",sequenceName="sequence_userrole")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="sequence_userrole")
	@Column(name="role_id",nullable=false,unique=true)
	private int roleId;
	
	@Column(name="role",nullable=false,unique=true)
	private String role;
	
	@ManyToMany(mappedBy="userRoles")
	private List<AppUser> appUsers = new ArrayList<AppUser>();

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

	public List<AppUser> getAppUsers() {
		return appUsers;
	}

	public void setAppUsers(List<AppUser> appUsers) {
		this.appUsers = appUsers;
	}
	
	
	
	
	

}
