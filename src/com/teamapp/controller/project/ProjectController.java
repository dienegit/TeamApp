package com.teamapp.controller.project;

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
@RequestMapping(value="/project")
public class ProjectController {
	
//	@Resource
//	private IUserService userService;
//
//	public IUserService getUserService() {
//		return userService;
//	}
//
//	public void setUserService(IUserService userService) {
//		this.userService = userService;
//	}
//
//	public ProjectController() {
//		
//	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String list(Model model) {
//		List<User> users = this.userService.getAllUsers();
//		model.addAttribute("users", users);
		return "project/list";
	}
	
}
