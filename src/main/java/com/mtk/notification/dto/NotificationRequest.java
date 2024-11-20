package com.mtk.notification.dto;

import com.mtk.notification.enums.NotificationType;

public record NotificationRequest(NotificationType type, String recipient, String message)
{
}
