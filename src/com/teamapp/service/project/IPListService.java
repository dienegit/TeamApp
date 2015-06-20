package com.teamapp.service.project;

import java.util.List;

import com.teamapp.pojo.project.PList;
import com.teamapp.pojo.project.Project;
import com.teamapp.pojo.user.User;
import com.teamapp.service.IBaseService;

public interface IPListService extends IBaseService<PList> {
	PList getPListById(int id);

	List<PList> getListsByProjectId(int id);

	int[] getPListProgress(PList plist); // 12/33

	List<User> getMembers(Project project);

	boolean isDelayed(PList plist);
}
