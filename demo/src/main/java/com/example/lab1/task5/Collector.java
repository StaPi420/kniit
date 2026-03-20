package com.example.lab1.task5;

public class Collector implements Runnable {
    int amountCollected = 0;

    public void collect() {
        try {
            synchronized (Main.lock) {
                while (DetailQueues.detailsToCollect.isEmpty()) {
                    Main.lock.wait();
                }
                Detail detail = DetailQueues.detailsToCollect.take();
                amountCollected++;
                System.out.println("Собираем! Количество собранных деталей: " + amountCollected);
                DetailQueues.detailsToCheck.add(detail);
                Main.lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            collect();
            try {
                Thread.sleep(300); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}



