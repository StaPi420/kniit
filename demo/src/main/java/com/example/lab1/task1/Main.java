package com.example.lab1.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Thread myThread = new MyThread();
        myThread.start();
        System.out.println("Main Thread ended");
    }
}