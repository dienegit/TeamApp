package com.teamapp.controller.user;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.teamapp.pojo.user.User;
import com.teamapp.service.user.IUserService;
import com.teamapp.util.UserException;

@Controller
@SessionAttributes("loginUser")
public class LoginController {

	@Resource
	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public LoginController() {

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@ModelAttribute("user") User user) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String email, String password, Model model) {
		User u = this.userService.getByEmailAndPassword(email, password);
		if (u == null) {
			throw new UserException("Login failed!");
		}
		model.addAttribute("loginUser", u);
		return "redirect:/project";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, HttpSession session) {
		model.asMap().remove("loginUser");
		session.invalidate();
		return "redirect:/login";
	}

	@ExceptionHandler(UserException.class)
	public String handlerException(Exception ex, HttpServletRequest req) {
		req.setAttribute("ex", ex);
		return "error";
	}
}
