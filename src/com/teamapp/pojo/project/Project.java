package com.teamapp.pojo.project;

import java.util.Date;
import java.util.List;

import com.teamapp.pojo.user.User;
import com.teamapp.util.Report;

public class Project {

	private int id;

	private boolean isComplete;

	private String name;

	private String description;

	private String imgPath;

	private User founder;

	private Date createdTime;

	private Date deadLine;

	private Date startTime;

	private Date completedTime;

	private int maxParticipant;

	private int maxBudget;

	private String comment;

	private List<Document> documnets;

	private List<Discussion> discussions;

	private List<Report> reports;

}
