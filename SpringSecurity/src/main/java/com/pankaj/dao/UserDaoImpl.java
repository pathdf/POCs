package com.pankaj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pankaj.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;


	public User findUserByUserName(String name) {

		List<User> list = sessionFactory.getCurrentSession().createQuery("FROM User u WHERE u.name=:name1").setParameter("name1", name).list();

		if (list != null && !list.isEmpty() && list.size() > 0)
			return list.get(0);
		else
			return null;

	}

}
