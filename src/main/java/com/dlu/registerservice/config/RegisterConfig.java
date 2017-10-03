package com.dlu.registerservice.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;


@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "application")
public class RegisterConfig {

//    @Value("${application.message}")
    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
