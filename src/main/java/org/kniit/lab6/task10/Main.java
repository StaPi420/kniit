package org.kniit.lab6.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "ibm866");

        Gallow gallow = new Gallow();
        Character letter = scanner.nextLine().charAt(0);
        while(gallow.makeGuess(letter)){
            if (gallow.isWin()){
                System.out.printf("Поздравляю! Вы угадали загаданное слово %s", gallow.getWord());
                scanner.close();
                return;
            }
            letter = scanner.nextLine().charAt(0);
        }
        System.out.printf("Вы проиграли! Загаданное слово %s", gallow.getWord());
        scanner.close();
    }
}
