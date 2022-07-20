package com.example.springengineweb.configuration;

import com.example.springengineweb.service.NotificationService;
import com.example.springengineweb.service.NotificationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class SpringEngineConfiguration {

    // @Bean
    // public String ....


    @Bean
    public Map<NotificationType, NotificationService> notificationMap(@Autowired Map<String, NotificationService> originalMap) {
        Map<NotificationType, NotificationService> map = new HashMap<>();

        originalMap.entrySet()
                .forEach(entry ->
                        map.put(
                                NotificationType.findByBeanName(entry.getKey()),
                                entry.getValue()
                        ));

        return map;
    }

    @Bean
    public String abc() {
        return "abc";
    }

    @Bean
    public String bbb() {
        return "bbb";
    }

    @Bean
    public Long aaa() {
        return 117L;
    }

    @Bean
    public String zyx(@Qualifier("aaa") Long value) {
        return "zyx";
    }


    // @Autowire
    // List<List<String>>

    @Bean
    public List<String> names() {
        return List.of("james", "anna");
    }

    @Bean
    public List<String> cars() {
        return List.of("mazda", "volvo");
    }


}
