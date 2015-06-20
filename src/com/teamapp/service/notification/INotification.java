package com.teamapp.service.notification;

import java.util.List;

import com.teamapp.pojo.notification.Notification;
import com.teamapp.service.IBaseService;

public interface INotification extends IBaseService<Notification> {
	List<Notification> getAllNotifications();

	List<Notification> getUnreadNotifications();

	void setRead(int id);

	Notification getNotificationById(int id);
}
