package com.example.lab2.task2;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Отправка SMS уведомления: " + message);
    }
    
}
