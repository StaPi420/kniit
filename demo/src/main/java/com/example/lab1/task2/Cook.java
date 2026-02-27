package com.example.lab1.task2;

public class Cook implements Runnable{
    public Tray tray = new Tray();

    public Cook(Tray tray){
        this.tray = tray;
    }

    public void run(){
        for (int i = 0; i < 10; ++i){
            tray.put();
        }
    }
}
