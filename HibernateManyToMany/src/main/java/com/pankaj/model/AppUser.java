package com.pankaj.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="appuser")
public class AppUser {
	
	@Id
	@SequenceGenerator(name="sequence_appuser",sequenceName="sequence_appuser")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="sequence_appuser")
	@Column(name="user_id",nullable=false,unique=true)
	private int userId;
	
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name",nullable=false)
	private String lastName;
	
	@Column(name="address", nullable=false)
	private String address;
	
	@Column(name="email_id",nullable=false)
	private String emailId;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(	name="app_user_role",
				joinColumns={@JoinColumn(name="fk_user_id")},
				inverseJoinColumns={@JoinColumn(name="fk_role_id")}
			  )
	private List<UserRole> userRoles = new ArrayList<UserRole>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
	

}
