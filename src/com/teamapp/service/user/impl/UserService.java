package com.teamapp.service.user.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teamapp.dao.user.IUserDao;
import com.teamapp.pojo.project.PTask;
import com.teamapp.pojo.user.User;
import com.teamapp.service.user.IUserService;

@Service
@Transactional
public class UserService implements IUserService {

	@Resource
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLogin(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLogin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean uploadImg(User user, String imgPath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserInfo(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> colleague(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PTask> getAllCompletedTasks(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PTask> getAllTodoTasks(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}

	@Override
	public void create(User entity) {
		entity.setRegisterTime(new Date());
		entity.setPermission("user");
		this.userDao.insert(entity);

	}

	@Override
	public boolean modify(User entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getById(long id) {
		return this.userDao.getById(id);
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		// password = DigestUtils.md5DigestAsHex(password.getBytes("UTF-8"));
		return this.userDao.getByEmailAndPassword(email, password);
	}

}