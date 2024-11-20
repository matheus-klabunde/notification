package com.mtk.notification.factory;

import com.mtk.notification.enums.NotificationType;
import com.mtk.notification.service.NotificationService;
import com.mtk.notification.service.impl.EmailNotificationService;
import com.mtk.notification.service.impl.SlackNotificationService;
import com.mtk.notification.service.impl.SmsNotificationService;

public class NotificationFactory
{
	private NotificationFactory()
	{
	}

	public static NotificationService create(NotificationType type)
	{
		if (type == NotificationType.EMAIL)
		{
			return new EmailNotificationService();
		}

		if (type == NotificationType.SMS)
		{
			return new SmsNotificationService();
		}

		if (type == NotificationType.SLACK)
		{
			return new SlackNotificationService();
		}

		throw new IllegalArgumentException("Unsupported notification type: " + type);
	}
}
