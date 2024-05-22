package com.alarm.alarm.domain;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Document(collection = "notification")
public class Notification {

	@Id
	private Long id;
	private String message;
	private LocalDateTime createdAt;
	private String userTo;
	private String userFrom;
	private NotificationType notificationType;

	@Builder
	public Notification(String message, LocalDateTime createdAt, String userTo, String userFrom,
		NotificationType notificationType) {
		this.message = message;
		this.createdAt = createdAt;
		this.userTo = userTo;
		this.userFrom = userFrom;
		this.notificationType = notificationType;
	}
}
