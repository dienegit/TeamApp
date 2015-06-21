package com.teamapp.service.project.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teamapp.dao.project.IProjectDao;
import com.teamapp.pojo.project.PTask;
import com.teamapp.pojo.project.Project;
import com.teamapp.pojo.user.User;
import com.teamapp.service.project.IProjectService;

@Service
@Transactional
public class ProjectService implements IProjectService {

	@Resource
	private IProjectDao projectDao;

	@Override
	public void create(Project entity) {
		entity.setCreatedTime(new Date());
		this.projectDao.insert(entity);

	}

	@Override
	public boolean modify(Project entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Project entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Project getById(long id) {
		return this.projectDao.getById(id);
	}

	@Override
	public List<Project> getAll() {
		return this.projectDao.findAll();
	}

	@Override
	public Project getProjectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getUserProjectList(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getProjectProgress(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PTask> getPTasks(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getMembers(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDelayed(Project project) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMember(Project project, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMember(int projectId, int userId) {
		// TODO Auto-generated method stub
		return false;
	}

}