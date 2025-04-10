package com.hasan.gwserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.gwserver.dto.MessageDto;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/notification")
@AllArgsConstructor
public class NotificationController {
    private static final Logger log = LoggerFactory.getLogger(NotificationController.class);
    StreamBridge streamBridge;
    
    @PostMapping("/send")
    public String notify(@RequestBody MessageDto message) {
        log.info("Notification message:"+message);
        sendNotification(message);
        return "Notification message queued successfully";
    }

    private void sendNotification(MessageDto message) {
        log.info("Sending notification: " + message);
        streamBridge.send("sendNotification-out-0", message);
    }

}
