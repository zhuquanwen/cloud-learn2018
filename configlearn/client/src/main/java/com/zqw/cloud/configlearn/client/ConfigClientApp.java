package com.zqw.cloud.configlearn.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@SpringBootApplication
@RestController
@RefreshScope
@EnableScheduling
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
