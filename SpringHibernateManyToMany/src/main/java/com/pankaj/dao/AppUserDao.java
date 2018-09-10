package com.pankaj.dao;

import java.util.List;

import com.pankaj.model.AppUser;

public interface AppUserDao {
	
	public AppUser getAppUser(int id);
	public List<AppUser> listAllAppUser();
	public int saveAppUser(AppUser user);
	public void updateAppUser(AppUser user);
	public void deleteAppUser(AppUser user);

}
