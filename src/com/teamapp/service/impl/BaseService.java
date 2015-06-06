package com.teamapp.service.impl;

import com.teamapp.dao.user.IOrganizationDao;
import com.teamapp.dao.user.IUserDao;
import com.teamapp.service.IBaseService;

public abstract class BaseService<T> implements IBaseService<T> {
	protected IUserDao userDao;
	protected IOrganizationDao organizationDao;

	

}
