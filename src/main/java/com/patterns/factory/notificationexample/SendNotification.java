package com.patterns.factory.notificationexample;

public class SendNotification {

    public static void main(String[] args) {

        var notificationFactory = new NotificationFactory();
        var notificationService = new NotificationService(notificationFactory);

        var notification = notificationService.createNotification("sms");

        notification.notifyUser();

        notification = notificationService.createNotification("email");

        notification.notifyUser();
    }
}
