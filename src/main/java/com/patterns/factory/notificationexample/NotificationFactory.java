package com.patterns.factory.notificationexample;

public class NotificationFactory {

    public Notification createNotification(String type) {

        if (type == null || type.isEmpty())
            return null;
        if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }
        else if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }

        return null;
    }
}
