package com.hasan.gwserver.function;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationStatusUpdateFunction {
    private static final Logger log = LoggerFactory.getLogger(NotificationStatusUpdateFunction.class);
    @Bean
    public Consumer<String> updateNotificationStatus() {
        return statusMessage -> {
            // Simulate sending a notification status update
            log.info("Notification status update: " + statusMessage);
        };
    }
}
