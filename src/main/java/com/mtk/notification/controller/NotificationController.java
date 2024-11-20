package com.mtk.notification.controller;

import com.mtk.notification.dto.NotificationRequest;
import com.mtk.notification.factory.NotificationFactory;
import com.mtk.notification.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@RestController
@RequestMapping("/notification")
public class NotificationController
{
	@PostMapping("/send")
	public ResponseEntity<String> send(@RequestBody NotificationRequest request)
	{
		NotificationService service = NotificationFactory.create(request.type());
		service.send(request.message(), request.recipient());
		return ResponseEntity.ok("Mensagem enviada com sucesso");
	}
}
