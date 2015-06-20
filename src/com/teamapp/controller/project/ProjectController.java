package com.teamapp.controller.project;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamapp.pojo.project.Project;
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

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Model model) {
		List<Project> projects = this.projectService.getAll();
		model.addAttribute("projects", projects);
		return "project/list";
	}

}