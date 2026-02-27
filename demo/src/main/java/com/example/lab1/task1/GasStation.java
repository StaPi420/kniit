package com.example.lab1.task1;

public class GasStation {
    public int placesBusy;
    private final Object lock = new Object();

    public GasStation(){
        placesBusy = 0;
    }

    public void Wait(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }

    public void RefuelCar(int num){
        synchronized (lock){
            while (placesBusy >= 2){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }     
            }
        
            placesBusy++;
            System.out.println("Машина " + num + " начала заправку");
        }
        Wait();
        System.out.println("Машина " + num + " наполовину заправилась");
        Wait();
        synchronized (lock){
            System.out.println("Машина " + num + " полностью заправилась и уехала");
            placesBusy--;
            lock.notify();
        }
    }
}
