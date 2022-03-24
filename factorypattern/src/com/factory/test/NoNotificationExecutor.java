package com.factory.test;

public class NoNotificationExecutor implements NotificationExecutor {

	private String NotificationType;

	public NoNotificationExecutor(String notificationType) {
		NotificationType = notificationType;
	}

	@Override
	public void executeNotification() {
		System.out.println("No notification is available for the type -> " + NotificationType);

	}

}
