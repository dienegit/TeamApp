package com.teamapp.pojo.user;

import java.util.Date;
import java.util.List;

import com.teamapp.pojo.notification.Notification;

public class User {

	private int id;

	private String name;

	private String password;

	private String email;

	private Date registerTime;

	private String phoneNo;

	private String imgPath;

	private List<Organization> organizations;

	private List<Notification> commentNotifications;

	private List<Notification> deadlineNotifications;

	private String permission;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getPermission() {
		return permission;
	}

	public List<Notification> getCommentNotifications() {
		return commentNotifications;
	}

	public void setCommentNotifications(List<Notification> commentNotifications) {
		this.commentNotifications = commentNotifications;
	}

	public List<Notification> getDeadlineNotifications() {
		return deadlineNotifications;
	}

	public void setDeadlineNotifications(
			List<Notification> deadlineNotifications) {
		this.deadlineNotifications = deadlineNotifications;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
