package com.kocirfan.listener;

import com.kocirfan.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    //dinleyen

    @RabbitListener(queues = "spring-rabbit-queue")
    public void handleMessage(Notification notification){
        System.out.println("Mesaj Alındı");
        System.out.println(notification.toString());
    }
}
