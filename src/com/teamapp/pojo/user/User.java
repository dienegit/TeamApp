package com.teamapp.pojo.user;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.teamapp.pojo.notification.Notification;
import com.teamapp.util.FilePath;

public class User {
	@JsonView(com.teamapp.view.Views.BaseUser.class)
	private long id;
	@JsonView(com.teamapp.view.Views.BaseUser.class)
	private String name;

	private String password;
	@JsonView(com.teamapp.view.Views.BaseUser.class)
	private String email;

	private Date registerTime;

	private String phoneNo;

	private String imgPath = FilePath.defaultImgPath;
	@JsonIgnore
	private List<Organization> organizations;
	@JsonIgnore
	private List<Notification> notifications;

	private String permission;

	@Override
	public String toString() {
		return "User" + this.name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public List<Organization> getOrganizations() {
		return organizations;
	}

	public void setOrganizations(List<Organization> organizations) {
		this.organizations = organizations;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
