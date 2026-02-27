package com.example.lab1.task3;

public class Storage {
    int currentAmount;
    public synchronized void put(){
        while (currentAmount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO: handle exception
            }            
        }
        currentAmount++;
        System.out.println(
            "Производитель добавил продукт. Сейчас на складе" + 
            currentAmount
        );
        notify();

    }
    public synchronized void get(){
        while (currentAmount <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO: handle exception
            }            
        }
        currentAmount--;
        System.out.println(
            "Потребитель забрал продукт. Сейчас на складе:" +
            currentAmount
        );  
        notify();     
    }
}
