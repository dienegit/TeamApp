package com.teamapp.service.user;

import java.util.List;

import com.teamapp.pojo.user.User;
import com.teamapp.service.IBaseService;

public interface IUserService extends IBaseService<User>{

	User login(String email, String password);
	
	void logout();
	
	boolean uploadImg(User user, String imgPath);
	
	User getUserInfo(String userid);
	
	List<User> colleague (User user);
	
}
