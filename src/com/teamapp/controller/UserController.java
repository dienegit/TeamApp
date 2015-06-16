package com.teamapp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.teamapp.dao.user.IUserDao;
import com.teamapp.dao.user.impl.UserDao;
import com.teamapp.pojo.user.User;
import com.teamapp.service.user.IUserService;

@Controller
@RequestMapping(value="/user")
@Scope("prototype")
public class UserController {
	
	@Resource
	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public UserController() {
		
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String list(Model model) {
		List<User> users = this.userService.getAllUsers();
		model.addAttribute("users", users);
		return "user/list";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add(@ModelAttribute("user") User user) {
		return "user/add";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(User user, String s) {
		this.userService.create(user);
		return "redirect:/user/";
	}
}
