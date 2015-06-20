package com.teamapp.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teamapp.pojo.user.User;

@Service
// @Component("beanName"), @Controller, @Service, @Repository 都是声明一个bean
public class TestService {

	@Resource
	private SessionFactory sessionFactory;

	@Transactional
	public void saveTwoUsers() {
		Session session = sessionFactory.getCurrentSession();
		session.save(new User());
		int a = 1 / 0; // exception
		session.save(new User());
	}
}
