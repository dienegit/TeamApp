package com.teamapp.dao.impl.user;

import org.hibernate.SessionFactory;

import com.teamapp.dao.user.IUserDao;
import com.teamapp.pojo.user.User;

public class UserDao implements IUserDao {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean insert(User t) {
		if (this.sessionFactory == null) {
			System.out.println("shabi");
		} else {
			System.out.println("you");
		}
		this.sessionFactory.getCurrentSession().save(t);
		return false;
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User t) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
