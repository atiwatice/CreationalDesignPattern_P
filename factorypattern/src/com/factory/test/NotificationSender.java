package com.factory.test;

public class NotificationSender {
	public static void main(String[] args) {
		NotificationExecutorFactory.getNotificationExecuter("Email").executeNotification();
		NotificationExecutorFactory.getNotificationExecuter("SMS").executeNotification();
		NotificationExecutorFactory.getNotificationExecuter("FTP").executeNotification();

	}
}
