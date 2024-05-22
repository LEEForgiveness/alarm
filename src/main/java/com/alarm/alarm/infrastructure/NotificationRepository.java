package com.alarm.alarm.infrastructure;

import com.alarm.alarm.domain.Notification;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface NotificationRepository extends ReactiveMongoRepository<Notification, Long> {

	@Tailable
	@Query("{ 'receiver' : ?0 }")
	Flux<Notification> findNotificationByReceiver(String userTo, String receiver);
}
