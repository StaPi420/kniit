package com.example.lab1.task3;

public class Consumer implements Runnable{
    public Storage storage;
    public int amount;

    public Consumer(Storage storage, int amount){
        this.storage = storage;
        this.amount = amount;
    }

    public void run(){
        for (int i = 0; i < amount; ++i){
            storage.get();
        }
    }
       
}
