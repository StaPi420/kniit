package org.kniit.lab4.task7;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        DictionaryStatistic dictionaryStatistic = new DictionaryStatistic();

        String filePath = "C:\\Users\\contest.MAIN\\IdeaProjects\\kniit\\src\\main\\java\\org\\kniit\\lab4\\task7\\dictionary.txt";

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                dictionaryStatistic.addWord(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("файл не найден");
        }
        dictionaryStatistic.printLetterFrequency();
        System.out.println(dictionaryStatistic.getRandomword());
        System.out.println(dictionaryStatistic.getRandomword());

        System.out.println(dictionaryStatistic.getDictSize());
        System.out.println(dictionaryStatistic.getPolindrom());
        System.out.println(dictionaryStatistic.getMaxWordlength());
        System.out.println(dictionaryStatistic.getMinWordlength());
    }
}