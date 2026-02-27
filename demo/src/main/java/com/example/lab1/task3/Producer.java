package com.example.lab1.task3;

public class Producer implements Runnable {
    public Storage storage;
    public int amount;

    public Producer(Storage storage, int amount){
        this.storage = storage;
        this.amount = amount;
    }

    public void run(){
        for (int i = 0; i < amount; ++i){
            storage.put();
        }
    }
    
}
