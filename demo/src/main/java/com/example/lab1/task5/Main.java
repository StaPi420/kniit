package com.example.lab1.task5;

public class Main {
    public static Object lock = new Object();
    public static void main(String[] args) {
        Stamper stamper = new Stamper();
        Collector collector = new Collector();
        QAOperator qaOperator = new QAOperator();
        Thread stamperThread = new Thread(stamper);
        Thread collectorThread = new Thread(collector);
        Thread qaOperatorThread = new Thread(qaOperator);

        stamperThread.start();
        collectorThread.start();
        qaOperatorThread.start();
    }
}
