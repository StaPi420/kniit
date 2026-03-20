package com.example.lab1.task4;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        Thread trafficLightThread = new Thread(trafficLight, "Светофор");
        trafficLightThread.start();
        
        for (int i = 0; i < 5; ++i) {
            Car car = new Car(i + 1, trafficLight);
            Thread carThread = new Thread(car, "Car-" + (i + 1));
            carThread.start();
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        try {
            trafficLightThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}