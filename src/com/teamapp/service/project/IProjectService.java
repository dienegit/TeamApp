package com.teamapp.service.project;

import java.util.List;

import com.teamapp.pojo.project.PTask;
import com.teamapp.pojo.project.Project;
import com.teamapp.pojo.user.User;
import com.teamapp.service.IBaseService;

public interface IProjectService extends IBaseService<Project> {

	Project getProjectById(int id);

	List<Project> getUserProjectList(User user);

	int[] getProjectProgress(Project project);

	List<PTask> getPTasks(Project project);

	boolean isDelayed(Project project);
}
