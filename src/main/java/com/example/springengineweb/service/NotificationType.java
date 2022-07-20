package com.example.springengineweb.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum NotificationType {

    PHONE("phoneNotificationService"),
    EMAIL("emailNotificationService")
    ;

    private final String beanName;

    public static NotificationType findByBeanName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Notification cannot be null");
        }

        return Arrays.stream(NotificationType.values())
                .filter(x -> x.getBeanName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Notification is not supported"));
    }
}
