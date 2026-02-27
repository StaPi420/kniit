package com.example.lab1.task3;

public class Main {
    public static void main(String[] args){
        int n = 7;
        Storage storage = new Storage();
        Runnable producer = new Producer(storage, n);
        Runnable consumer = new Consumer(storage, n);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
