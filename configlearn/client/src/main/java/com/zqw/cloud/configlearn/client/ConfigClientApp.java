package com.zqw.cloud.configlearn.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApp {
    @Value("${profile}")
    private String profile;
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp.class, args);
    }
    @GetMapping("/get")
    public String get(){
        return profile;
    }
}
