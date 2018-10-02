package com.pankaj.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import com.pankaj.model.AppUser;
import com.pankaj.model.Item;
import com.pankaj.model.UserRole;
import com.pankaj.model.Vendor;

public class Main {
	
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Item item = new Item();
		item.setItemName("ABC");
		item.setStatus("Active");
		Vendor vendor = new Vendor();
		vendor.setVendorName("amd");
		vendor.setStatus("Active");
		vendor.setAddress("RZ");
		vendor.setContactNo("9899");
		vendor.getItems().add(item);
		/*AppUser user = new AppUser();
		user.setFirstName("Pankaj");
		user.setLastName("Chauhan");
		user.setEmailId("emailpankaj");
		user.setAddress("Pratap Garden");
		UserRole role = new UserRole();
		role.setRole("DBA");
		user.getUserRoles().add(role);
		session.save(user);*/
		/*AppUser obj = (AppUser) session.get(AppUser.class, 1);
		obj.getUserRoles().get(0);*/
		
		
		session.save(vendor);
		session.beginTransaction().commit();
		session.close();
		
		factory.close();
	}
}
