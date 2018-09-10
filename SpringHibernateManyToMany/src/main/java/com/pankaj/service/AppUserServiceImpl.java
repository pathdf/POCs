package com.pankaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pankaj.dao.AppUserDao;
import com.pankaj.model.AppUser;

@Service("appUserService")
@Transactional
public class AppUserServiceImpl implements AppUserService {
	
	@Autowired(required=true)
	public AppUserDao appUserDao;
	
	public void addAppUser(AppUser user) {
		
		appUserDao.saveAppUser(user);
	}

	public List<AppUser> listAppUsers() {
		return appUserDao.listAllAppUser();
	}

	public AppUser getAppUser(int id) {
	
		return appUserDao.getAppUser(id);
	}

	public void deleteAppUser(AppUser user) {
		
		appUserDao.deleteAppUser(user);

	}

	public void updateAppUser(AppUser user) {
		
		appUserDao.updateAppUser(user);

	}

}
