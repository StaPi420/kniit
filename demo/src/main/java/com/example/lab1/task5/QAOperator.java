package com.example.lab1.task5;

public class QAOperator implements Runnable {
    int amountOfCheckedDetails = 0;

    public void check() {
        try {
            synchronized (Main.lock) {
                while (DetailQueues.detailsToCheck.isEmpty()) {
                    Main.lock.wait();
                }
                DetailQueues.detailsToCheck.take();
                amountOfCheckedDetails++;
                System.out.println("Проверяем деталь! Количество проверенных деталей: " + amountOfCheckedDetails);
                Main.lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            check();
            try {
                Thread.sleep(150); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
