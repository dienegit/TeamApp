package com.teamapp.dao.user.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teamapp.dao.impl.BasicDao;
import com.teamapp.dao.user.IUserDao;
import com.teamapp.pojo.user.User;

@Transactional
@Repository
public class UserDao extends BasicDao<User> implements IUserDao {

	@Override
	public User getByEmailAndPassword(String email, String password) {
		return (User)getSession().createQuery(//
				"FROM User u WHERE u.email=? AND u.password=?")//
				.setParameter(0, email)//
				.setParameter(1, password)//
				.uniqueResult();
	}

}
