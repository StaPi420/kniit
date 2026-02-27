package com.example.lab1.task2;

public class Main {
    public static void main(String args[]){
        Tray tray = new Tray();
        new Thread(new Cook(tray)).start();
        new Thread(new Waiter(tray)).start();
    }
}
