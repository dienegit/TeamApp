package com.teamapp.service.impl.user;

import java.util.List;

import com.teamapp.dao.user.IUserDao;
import com.teamapp.pojo.project.PTask;
import com.teamapp.pojo.user.User;
import com.teamapp.service.impl.BaseService;
import com.teamapp.service.user.IUserService;

public class UserService extends BaseService<User> implements IUserService {
	IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(String email, String password) {

		return null;
	}

	@Override
	public boolean isLogin(User user) {
		
		return false;
	}

	@Override
	public boolean isLogin() {
		 
		return false;
	}

	@Override
	public void logout() {
		 

	}

	@Override
	public boolean uploadImg(User user, String imgPath) {
		 
		return false;
	}

	@Override
	public User getUserInfo(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> colleague(User user) {
		 
		return null;
	}

	@Override
	public List<PTask> getAllCompletedTasks(User user) {
		 
		return null;
	}

	@Override
	public List<PTask> getAllTodoTasks(User user) {
		 
		return null;
	}

	@Override
	public void create(User entity) {
		if (this.userDao == null) {
			System.out.println("shabi mei you user dao");
		} else {
			System.out.println("shabi zhe ci you le you user dao");
		}
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

}
