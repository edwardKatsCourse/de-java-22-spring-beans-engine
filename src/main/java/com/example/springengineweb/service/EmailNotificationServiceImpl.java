package com.example.springengineweb.service;

import org.springframework.stereotype.Service;

@Service("emailNotificationService")
public class EmailNotificationServiceImpl implements NotificationService{

    @Override
    public void notifyUser(String message) {
        System.out.println("Email " + message);
    }
}
