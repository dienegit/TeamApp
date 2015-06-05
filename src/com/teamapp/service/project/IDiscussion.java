package com.teamapp.service.project;

import java.util.List;

import com.teamapp.pojo.project.Discussion;
import com.teamapp.pojo.project.Project;
import com.teamapp.service.IBaseService;

public interface IDiscussion extends IBaseService<Discussion> {
	List<Discussion> getAllByProject(Project project);

	Discussion getById(int id);
}
