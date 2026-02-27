package com.example.lab1.task2;

public class Tray {
    public int amountOfDishes;

    public Tray(){
        amountOfDishes = 0;
    }

    public synchronized void get(){
        while (amountOfDishes <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        amountOfDishes--;
        System.out.println("Оффициант забрал и отнёс блюдо");
        notify();
    }

    public synchronized void put(){
        while (amountOfDishes >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        amountOfDishes++;
        System.out.println("Повар положил блюдо");
        notify();
    }
}
