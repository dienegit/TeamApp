package com.teamapp.service.project;

import java.util.List;

import com.teamapp.pojo.project.Document;
import com.teamapp.pojo.project.Project;
import com.teamapp.pojo.user.User;
import com.teamapp.service.IBaseService;

public interface IDocument extends IBaseService<Document> {
	List<Document> getAllDocuments(Project project);
	
	boolean uploadDoc(Project project, User user);
	
	String downloadDoc(Document doc, User user);
	
}
