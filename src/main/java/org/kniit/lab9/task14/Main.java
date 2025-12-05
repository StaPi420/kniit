package org.kniit.lab9.task14;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий сигнал светофора (RED, YELLOW, GREEN):");
        String light = scanner.nextLine();
        TrafficLight trafficLight = TrafficLight.makeTrafficLight(light);
        for (int i = 0; i < 10; ++i){
            System.out.println(trafficLight.getNextLight());
        }
        scanner.close();
    }
}
