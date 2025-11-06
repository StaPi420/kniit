package org.kniit.lab5.task9;

import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class Main {
   static void main(String[] args){
        final long DURATION = 60000;
        RandomWords randomWords = new RandomWords();
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8 );

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        int cnt = 0, rightWordCount = 0, symbolCount = 0;
        while (true){
            String word = randomWords.getRandomWord();
            ++cnt;
            System.out.println(word);

            String userWord = scanner.nextLine();
            System.out.print(userWord);
            endTime = System.currentTimeMillis();
            if (endTime - startTime > DURATION){
                System.out.println("Вы не успели!");
                break;
            }
            if (word.equals(userWord)){
                ++rightWordCount;
                symbolCount += word.length();
                System.out.println("Верно!");
            }
            else {
                System.out.println("Неверно");
            }
        }
        System.out.printf("Всего слов: %d\nПравильно введено: %d\nСимволов в минуту: %d",
        cnt, rightWordCount, symbolCount);

        scanner.close();
   } 
}
