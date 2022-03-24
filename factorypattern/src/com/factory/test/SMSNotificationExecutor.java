package com.factory.test;

public class SMSNotificationExecutor implements NotificationExecutor {

	@Override
	public void executeNotification() {
		System.out.println("SMS Notification is sent.");
		
	}

}
