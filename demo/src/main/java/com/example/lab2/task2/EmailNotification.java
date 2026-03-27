package com.example.lab2.task2;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Отправка email уведомления: " + message);
    }
    
}
