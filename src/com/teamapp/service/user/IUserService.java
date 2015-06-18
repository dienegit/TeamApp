package com.teamapp.service.user;

import java.util.List;

import com.teamapp.pojo.project.PTask;
import com.teamapp.pojo.user.User;
import com.teamapp.service.IBaseService;

public interface IUserService extends IBaseService<User>{

	User login(String email, String password);
	
	boolean isLogin(User user);
	
	boolean isLogin();
	
	void logout();
	
	boolean uploadImg(User user, String imgPath);
	
	User getUserInfo(String userid);
	
	List<User> colleague (User user);
	
	List<PTask> getAllCompletedTasks(User user);
	
	List<PTask> getAllTodoTasks(User user);
	
	List<User> getAllUsers();

	User getByEmailAndPassword(String email, String password);
}
