package com.alarm.alarm.application;

import com.alarm.alarm.infrastructure.NotificationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationServiceImpl implements NotificationService {

	private final NotificationRepository notificationRepository;
	@Override
	public void SendAlarm(String receiver, String message) {
		// TODO Auto-generated method stub
	}

}
