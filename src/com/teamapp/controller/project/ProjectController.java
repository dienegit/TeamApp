package com.teamapp.controller.project;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamapp.pojo.project.Project;
import com.teamapp.pojo.user.User;
import com.teamapp.service.project.IProjectService;

@Controller
@RequestMapping(value = "/project")
public class ProjectController {

	@Resource
	private IProjectService projectService;

	public IProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(IProjectService projectService) {
		this.projectService = projectService;
	}

	public ProjectController() {

	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String list() {
		return "redirect:/project/";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Model model) {
		List<Project> projects = this.projectService.getAll();
		model.addAttribute("projects", projects);
		return "project/list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(@ModelAttribute("project") Project project, Model model, HttpSession session) {
		project.setFounder((User)session.getAttribute("loginUser"));
		//model.addAttribute("user", session.getAttribute("loginUser"));
		return "project/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@Validated Project project, BindingResult br) {
		if (br.hasErrors()) {
			return "project/add";
		}
		this.projectService.create(project);
		return "redirect:/project/";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String show(@PathVariable long id, Model model) {
		model.addAttribute(this.projectService.getById(id));
		return "project/show";
	}
}