package com.teamapp.controller.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamapp.pojo.user.User;
import com.teamapp.service.user.IUserService;

@Controller
@RequestMapping(value="/user")
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
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)  
    public String show(@PathVariable long id, Model model){  
        model.addAttribute(this.userService.getById(id));  
        return "user/show";
    }  
}