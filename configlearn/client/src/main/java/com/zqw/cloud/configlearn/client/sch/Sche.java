package com.zqw.cloud.configlearn.client.sch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Set;
@Component
public class Sche {
    @Autowired
    private ContextRefresher contextRefresher;
    @Scheduled(fixedRate = 5000, initialDelay = 3*1000)
    public void refresh(){
        Set<String> result = contextRefresher.refresh();
        System.err.println(result);
    }
}
