package com.pankaj.service;

import java.util.List;

import com.pankaj.bean.AppUserBean;
import com.pankaj.model.AppUser;

public interface AppUserService {
	
	public void addAppUser(AppUser user);
	public List<AppUserBean> listAppUsers();
	public AppUserBean getAppUserBean(int id);
	public AppUser getAppUser(int id);
	public void deleteAppUser(AppUser user);
	public void updateAppUser(AppUser user);
	public List<AppUser> listAllAppUserByIds(List<Integer> ids);
}
