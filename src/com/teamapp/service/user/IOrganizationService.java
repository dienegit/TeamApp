package com.teamapp.service.user;

import java.util.List;

import com.teamapp.pojo.user.Organization;
import com.teamapp.pojo.user.User;
import com.teamapp.service.IBaseService;

public interface IOrganizationService extends IBaseService<Organization> {
	List<Organization> getAllByUser(User user);

	List<Organization> getAllByUser(int userId);

	Organization getById(int id);

	List<User> getMembers(Organization organization);

	List<User> getMembers(int organizationId);
}
