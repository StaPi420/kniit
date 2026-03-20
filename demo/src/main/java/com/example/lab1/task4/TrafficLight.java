package com.example.lab1.task4;

public class TrafficLight implements Runnable {
    private boolean isRed;
    private int cycleCount = 0;
    
    public TrafficLight() {
        isRed = true;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            try {
                Thread.sleep(5000);
                
                synchronized (this) {
                    isRed = false;
                    System.out.println("\nСВЕТОФОР: ЗЕЛЕНЫЙ (цикл " + (i + 1) + ")");
                    this.notifyAll(); 
                }
                
                Thread.sleep(5000);
                
                synchronized (this) {
                    isRed = true;
                    System.out.println("\nСВЕТОФОР: КРАСНЫЙ (цикл " + (i + 1) + ")");
                    this.notifyAll(); 
                }
            } catch (InterruptedException e) {
                System.out.println("Светофор прерван");
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("Светофор завершил работу");
    }
    
    public synchronized boolean isRed() {
        return isRed;
    }
}