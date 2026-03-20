package com.example.lab1.task6;

public class Runner implements Runnable {
    private final int id;
    public Runner(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Main.START_BARRIER.await();
            System.out.println("Бегун " + id + " начал бежать");
            Thread.sleep((long) (Math.random() * 4000));
            System.out.println("Бегун " + id + " закончил бежать");
            Main.END_BARRIER.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
