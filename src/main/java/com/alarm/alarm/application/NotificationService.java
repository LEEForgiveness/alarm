package com.alarm.alarm.application;

import org.springframework.stereotype.Service;

public interface NotificationService {
	void SendAlarm(String receiver, String message);
}
