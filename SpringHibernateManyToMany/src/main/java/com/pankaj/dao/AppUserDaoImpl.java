package com.pankaj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pankaj.model.AppUser;
@Repository("appUserDao")
public class AppUserDaoImpl implements AppUserDao {
	@Autowired(required=true)
	public SessionFactory sessionFactory;
	
	public AppUser getAppUser(int id) {
		
		return (AppUser)sessionFactory.getCurrentSession().get(AppUser.class, id);
	}

	public List<AppUser> listAllAppUser() {
		
		return sessionFactory.getCurrentSession().createCriteria(AppUser.class).list();
	}

	public int saveAppUser(AppUser user) {
		
		return (Integer)sessionFactory.getCurrentSession().save(user);
	}

	public void updateAppUser(AppUser user) {
	  
		sessionFactory.getCurrentSession().merge(user);
	}

	public void deleteAppUser(AppUser user) {
		sessionFactory.getCurrentSession().delete(user);
	}

}
