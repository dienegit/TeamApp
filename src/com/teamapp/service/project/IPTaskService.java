package com.teamapp.service.project;

import com.teamapp.pojo.project.PTask;
import com.teamapp.service.IBaseService;

public interface IPTaskService extends IBaseService<PTask> {
	PTask getPTaskById(int id);

	boolean isDelayed(PTask ptask);
}
