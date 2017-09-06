package com.example.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ProdNotificationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private NotificationProperties properties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        properties.getMails().forEach(System.out::println);

    }
}
