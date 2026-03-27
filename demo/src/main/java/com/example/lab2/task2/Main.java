package com.example.lab2.task2;

public class Main {
    public static void main(String[] args) {
        NotificationCreator emailCreator = new EmailNotificationCreator();
        emailCreator.sendNotification("Привет по электронной почте!");

        NotificationCreator smsCreator = new SMSNotificationCreator();
        smsCreator.sendNotification("Привет по SMS!");
    }
}
