package com.teamapp.dao.user.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teamapp.dao.impl.BasicDaoImpl;
import com.teamapp.dao.user.IUserDao;
import com.teamapp.pojo.user.User;

@Transactional
@Repository
public class UserDao extends BasicDaoImpl<User> implements IUserDao {

}
