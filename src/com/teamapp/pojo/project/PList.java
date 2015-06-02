package com.teamapp.pojo.project;

import java.util.Date;
import java.util.List;

import com.teamapp.pojo.user.User;

public class PList {
	private int id;

	private boolean isComplete;

	private String name;

	private String description;

	private Date createdTime;

	private Date deadLine;
	
	private Date completedTime;

	private User leader;

	private List<PTask> tasks;

	
}
