package com.hasan.notification.function;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hasan.notification.dto.MessageDto;

@Configuration
public class NotificationFunction {
    private static final Logger log = LoggerFactory.getLogger(NotificationFunction.class);
    @Bean
    public Function<MessageDto,MessageDto> email() {
        return messageDto -> {
            log.info("Sending email notification: " + messageDto);
            return messageDto;
        };
    }
    @Bean
    public Function<MessageDto,String> sms() {
        return messageDto -> {
            log.info("Sending sms notification: " + messageDto);
            return "Notification sent successfully";
        };
    }


}
