package com.teamapp.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamapp.dao.impl.user.UserDao;
import com.teamapp.pojo.user.User;
import com.teamapp.service.impl.user.UserService;
import com.teamapp.service.user.IUserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	private Map<String, User> users = new HashMap<String, User>();
	
	public UserController() {
//		users.put("u1", new User("u1", "123", "u1@aaa.com"));
//		users.put("u2", new User("u2", "123", "u2@aaa.com"));
//		users.put("u3", new User("u3", "123", "u3@aaa.com"));
//		users.put("u4", new User("u4", "123", "u4@aaa.com"));
		IUserService uService = new UserService();
		User user = new User();
		user.setName("ssss");
		uService.create(user);
		
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("users", users);
		return "user/list";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add(@ModelAttribute("user") User user) {
		return "user/add";
	}
	
//	@RequestMapping(value="/{User.getUsername}", method=RequestMethod.GET)
//	public String show() {
//		
//		return "user/add";
//	}
//	
//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public String add(@Validated User user, BindingResult br) {
//		System.out.println(br.hasErrors());
//		if(br.hasErrors()) {
//			System.out.println(br.hasErrors());
//			return "user/add";
//		}
//		users.put(user.getUsername(), user);
//		return "redirect:/user/";
//	}
}
