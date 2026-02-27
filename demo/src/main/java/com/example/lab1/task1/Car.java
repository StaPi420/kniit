package com.example.lab1.task1;

public class Car extends Thread{
    private int num;
    public GasStation gasStation;

    public Car(int nunOfCar, GasStation gasStation){
        super();
        num = nunOfCar;
        this.gasStation = gasStation;
    } 



    public void run(){
        gasStation.RefuelCar(num);
    }
}
