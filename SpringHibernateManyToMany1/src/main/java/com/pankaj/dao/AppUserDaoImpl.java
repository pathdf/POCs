package com.pankaj.dao;

import java.util.ArrayList;
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

	public void saveAppUser(AppUser user) {
		
		 sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	public void updateAppUser(AppUser user) {
	  
		sessionFactory.getCurrentSession().merge(user);
	}

	public void deleteAppUser(AppUser user) {
		sessionFactory.getCurrentSession().delete(user);
	}

	public List<AppUser> listAppUsersByIds(List<Integer> ids)
	{
		List<AppUser> users = null;
		if(ids!=null)
		{
			users = new ArrayList<AppUser>();
			AppUser user = null;
			for(Integer id : ids)
			{
				user = getAppUser(id);
				users.add(user);
			}
		}
		return null;
	}
}
