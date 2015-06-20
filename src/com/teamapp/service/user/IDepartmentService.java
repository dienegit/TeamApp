package com.teamapp.service.user;

import java.util.List;

import com.teamapp.pojo.user.Department;
import com.teamapp.pojo.user.Organization;
import com.teamapp.service.IBaseService;

public interface IDepartmentService extends IBaseService<Department> {
	List<Department> getAllByOrganization(Organization organization);

	List<Department> getAllByOrganization(int organizationId);

	Department getById(int id);
}
