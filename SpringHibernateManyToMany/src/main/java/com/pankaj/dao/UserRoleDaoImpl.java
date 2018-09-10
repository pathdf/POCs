package com.pankaj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pankaj.model.AppUser;
import com.pankaj.model.UserRole;

@Repository("userRoleDao")
public class UserRoleDaoImpl implements UserRoleDao {

	@Autowired(required=true)
	public SessionFactory sessionFactory;
	
	public UserRole getUserRole(int id) {
		
		return (UserRole)sessionFactory.getCurrentSession().get(UserRole.class, id);
	}

	public List<UserRole> listAllUserRole() {
		
		return sessionFactory.getCurrentSession().createCriteria(UserRole.class).list();
	}

	public int saveUserRole(UserRole role) {
		
		return (Integer)sessionFactory.getCurrentSession().save(role);
	}

	public void updateUserRole(UserRole role) {
	  
		sessionFactory.getCurrentSession().merge(role);
	}

	public void deleteUserRole(UserRole role) {
		sessionFactory.getCurrentSession().delete(role);
	}

}
