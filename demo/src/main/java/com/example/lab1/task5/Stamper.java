package com.example.lab1.task5;

public class Stamper implements Runnable{
    int amountOfStamps = 0;

    public void stamp() {
        amountOfStamps++;
        System.out.println("Штампуем! Количество штампов: " + amountOfStamps);
        DetailQueues.detailsToCollect.add(new Detail());
        synchronized (Main.lock) {
            Main.lock.notifyAll();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            stamp();
            try {
                Thread.sleep(100); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
