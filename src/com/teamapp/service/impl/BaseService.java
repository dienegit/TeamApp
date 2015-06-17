package com.teamapp.service.impl;

import com.teamapp.dao.user.IOrganizationDao;
import com.teamapp.dao.user.IUserDao;
import com.teamapp.service.IBaseService;

public class BaseService<T> implements IBaseService<T> {
	protected IUserDao userDao;
	protected IOrganizationDao organizationDao;
	@Override
	public void create(T entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean modify(T entity) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(T entity) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public T getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
