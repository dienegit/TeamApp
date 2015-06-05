package com.teamapp.service.project;

import java.util.List;

import com.teamapp.pojo.project.PTask;
import com.teamapp.pojo.project.Project;
import com.teamapp.pojo.user.User;
import com.teamapp.service.IBaseService;

public interface IPTaskService extends IBaseService<PTask> {
	PTask getPTaskById(int id);

	List<User> getMembers(Project project);
	
	boolean isDelayed(PTask ptask);
}
