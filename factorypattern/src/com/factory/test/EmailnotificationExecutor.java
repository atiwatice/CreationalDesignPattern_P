package com.factory.test;

public class EmailnotificationExecutor implements NotificationExecutor {

	@Override
	public void executeNotification() {
		System.out.println("Email notification is sent");
		
	}

}
