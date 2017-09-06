package com.example.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@EnableConfigurationProperties(NotificationProperties.class)
public class AutoConfiguration {

    @Bean
    @Profile("PROD")
    private ProdNotificationListener listener(){
        return new ProdNotificationListener();
    }
}
