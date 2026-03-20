package com.example.lab1.task6;

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static final int N = 5;
    public static final CyclicBarrier START_BARRIER = new CyclicBarrier(N, new Starter());
    public static final CyclicBarrier END_BARRIER = new CyclicBarrier(N, new Finisher());
    public static class Starter implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("Все бегуны готовы. Стартуем!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static class Finisher implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("Все бегуны финишировали!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            new Thread(new Runner(i + 1)).start();
            System.out.println("Бегун " + (i + 1) + " готовится к старту");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
