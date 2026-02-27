package com.example.lab1.task2;

public class Waiter implements Runnable{
    public Tray tray = new Tray();

    public Waiter(Tray tray){
        this.tray = tray;
    }

    public void run(){
        for (int i = 0; i < 10; ++i){
            tray.get();
        }
    }   
}
