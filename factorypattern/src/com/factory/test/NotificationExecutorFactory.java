package com.factory.test;

public class NotificationExecutorFactory {

	public static NotificationExecutor getNotificationExecuter(String executorType) {
		switch (executorType) {
		
		case "Email":
			return new EmailnotificationExecutor();
			
		case "SMS":
			return new SMSNotificationExecutor();

		default:
			return new NoNotificationExecutor(executorType);
		}

	}
}
