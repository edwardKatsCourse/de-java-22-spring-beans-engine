package com.example.springengineweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Runner implements CommandLineRunner {

//    @Autowired
//    private PrintService printService;

//    @Autowired
//    @Qualifier("emailNotificationService")
//    private NotificationService notificationService;

//    @Autowired
//    private List<NotificationService> notificationServices;

    @Autowired
    private Map<NotificationType, NotificationService> notificationServiceMap;


    @Autowired
    private List<List<String>> values;

    @Override
    public void run(String... args) throws Exception {
//        printService.printAbc();

        String message = "Hello";
        boolean isPhoneNotification = true;
//
        if (isPhoneNotification) {
            notificationServiceMap.get(NotificationType.EMAIL).notifyUser(message);
        }

//        notificationServices
//                .forEach(x -> x.notifyUser(message));

//        System.out.println(values);

    }
}
