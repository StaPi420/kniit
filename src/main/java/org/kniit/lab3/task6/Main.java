package org.kniit.lab3.task6;


public class Main {
    public static void main(String[] args){
        Player mag = new Magician("player1");

        mag.setElfRace();

        Player tank = new Tank("player2");

        tank.setDwarfRace();

        tank.setPos(0, 10);

        System.out.println(mag);
        System.out.println(tank);
        System.out.println();

        tank.attack(mag);
        mag.attack(tank);

        System.out.println(tank);
        System.out.println();

        mag.castHealing(tank);

        System.out.println(tank);

        for (int i = 0; i < 20; ++i){
            mag.attack(tank);
        }
    }
}
