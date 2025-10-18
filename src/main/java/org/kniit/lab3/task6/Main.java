package org.kniit.lab3.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите имя героя");

        String name = scanner.nextLine();

        System.out.println("Выберите класс:\n1 - Воин\n2 - Танк\n3 - Маг\n4 - Священник");

        int choice = scanner.nextInt();

        Player player; //= new Warrior(name);
        
        switch(choice){
            case 1:
                player = new Warrior(name);
                break;
            case 2:
                player = new Tank(name);
                break;
            case 3:
                player = new Magician(name);
                break;
            default:
                player = new Priest(name);
                break;
        }

        System.out.println("Выберите расу:\n1 - Человек\n2 - Эльф\n3- Дварф");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                player.setHumanRace();
                break;
            case 2:
                player.setElfRace();
                break;
            case 3:
                player.setDwarfRace();
                break;

        }

        System.out.println(player);

        System.out.println("Введите имя злодея");

        String villianName = scanner.next();

        System.out.println("Выберите класс:\n1 - Воин\n2 - Танк\n3 - Маг\n4 - Священник");

        choice = scanner.nextInt();

        Player vilian; 
        
        switch(choice){
            case 1:
                vilian = new Warrior(villianName);
                break;
            case 2:
                vilian = new Tank(villianName);
                break;
            case 3:
                vilian = new Magician(villianName);
                break;
            default:
                vilian = new Priest(villianName);
                break;
        }

        System.out.println("Выберите расу:\n1 - Человек\n2 - Эльф\n3- Дварф");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                vilian.setHumanRace();
                break;
            case 2:
                vilian.setElfRace();
                break;
            case 3:
                vilian.setDwarfRace();
                break;
        }

        System.out.println(vilian);

        vilian.setPos(15, 15);

        while (true) {
            System.out.println("Выберите действие:\n1 - Двигаться\n2 - Атаковать злодея\n3 - Отхилить себя");
            int actionChoice = scanner.nextInt();

            switch (actionChoice) {
                case 1:
                    System.out.println("Введите новые координаты");
                    String[] coords = scanner.nextLine().split(" ");

                    player.movePlayer(Integer.parseInt(coords[0]), Integer.parseInt(coords[1]));
                    break;
                case 2:
                    player.attack(vilian);
                    break;
                case 3:
                    player.castHealing(player);
                    break;
            }
            if (!vilian.isAlive()){
                System.out.println("Поздравляю вы победили!");
                return;
            }
            vilian.attack(player);
            if (!player.isAlive()){
                System.out.println("Вы проиграли!");
            }
            System.out.println(player);
            System.out.println(vilian);
        }

    }

       
}
