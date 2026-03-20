package com.example.lab1.task4;

public class Car implements Runnable {
    private final int num;
    private final TrafficLight trafficLight;
    private int crossedCount = 0;
    
    public Car(int number, TrafficLight trafLight) {
        num = number;
        trafficLight = trafLight;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 3000));
            System.out.println(this + " подъехала к светофору");
            
            for (int i = 0; i < 5; ++i) {
                synchronized (trafficLight) {
                    while (trafficLight.isRed()) {
                        System.out.println(this + " ждет зеленый свет...");
                        trafficLight.wait();
                    }
                }
                
                System.out.println(this + " проехала светофор (раз " + (crossedCount + 1) + ")");
                crossedCount++;
                
                Thread.sleep(3000 + (long) (Math.random() * 4000));
                System.out.println(this + " подъехала к светофору");
            }
            System.out.println(this + " завершила поездку (проехала " + crossedCount + " раз)");
        } catch (InterruptedException e) {
            System.out.println(this + " прервана");
            Thread.currentThread().interrupt();
        }
    }
    
    @Override
    public String toString() {
        return "Машина №" + num;
    }
}