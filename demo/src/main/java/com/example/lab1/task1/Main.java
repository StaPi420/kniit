package com.example.lab1.task1;

public class Main {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        for (int i = 0; i < 8; ++i){
            new Car(i, gasStation).start();
        }
    }
}