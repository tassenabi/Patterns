package com.patterns.factory.notificationexample;

public class NotificationService {

    NotificationFactory notificationFactory;

    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public Notification createNotification(String type) {

        return notificationFactory.createNotification(type);
    }

}
