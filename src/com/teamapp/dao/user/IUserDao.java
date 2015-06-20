package com.teamapp.dao.user;

import com.teamapp.dao.IBasicDao;
import com.teamapp.pojo.user.User;

public interface IUserDao extends IBasicDao<User> {

	User getByEmailAndPassword(String email, String password);

}
