package com.mtk.notification.dto;

import com.mtk.notification.enums.NotificationType;

public record NotificationDTO(NotificationType type, String recipient, String message)
{
}
