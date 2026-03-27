package com.example.lab2.task2;

public abstract class NotificationCreator {
    public abstract Notification createNotification();
    public void sendNotification(String message) {
        System.out.println("Создание уведомления...");
        Notification notification = createNotification();
        notification.send(message);
    }
}
