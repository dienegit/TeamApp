package com.teamapp.dao.user.impl;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.teamapp.dao.user.IUserDao;
import com.teamapp.pojo.user.User;

@Transactional
@Component
public class UserDao implements IUserDao {
	
	@Resource
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean insert(User t) {
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

	@Override
	public List<User> getAllUsers() {
		String hql = "select user from User user";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		List<User> ulist = query.list();
		return ulist;
	}
	

}
