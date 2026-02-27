package com.example.lab1.task1;

public class Car extends Thread{
    private int num;

    public Car(int nunOfCar){
        super();
        num = nunOfCar;
    } 

    public void Wait(){
        try {
            sleep(100);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }

    public void run(){
        try {
            wait();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Машина " + num + "начала заправку");
        Wait();
        System.out.println("Машина " + num + "наполовину заправилась");
        Wait();
        System.out.println("Машина " + num + "полностью заправилась и уехала");
        notify();
    }
}
