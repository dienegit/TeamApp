package com.teamapp.service.project;

import com.teamapp.pojo.project.PList;
import com.teamapp.service.IBaseService;

public interface IPListService extends IBaseService<PList> {
	PList getPListById(int id);

	int[] getPListProgress(PList plist);
	
	boolean isDelayed(PList plist);
}
