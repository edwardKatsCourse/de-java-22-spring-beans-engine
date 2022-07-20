package com.example.springengineweb.service;

import org.springframework.stereotype.Service;

@Service("phoneNotificationService")
public class PhoneNotificationServiceImpl implements NotificationService {

    @Override
    public void notifyUser(String message) {
        System.out.println("Phone " + message);
    }
}
