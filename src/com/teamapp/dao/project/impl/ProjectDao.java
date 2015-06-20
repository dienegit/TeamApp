package com.teamapp.dao.project.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teamapp.dao.impl.BasicDao;
import com.teamapp.dao.project.IProjectDao;
import com.teamapp.pojo.project.Project;

@Transactional
@Repository
public class ProjectDao extends BasicDao<Project> implements IProjectDao {

}
