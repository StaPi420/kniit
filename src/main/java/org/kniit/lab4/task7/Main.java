package org.kniit.lab4.task7;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        DictionaryStatistic dictionaryStatistic = new DictionaryStatistic();

        Path file = Paths.get("dictionary.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            dictionaryStatistic.addWord(scanner.nextLine());
        }
        scanner.close();
        dictionaryStatistic.printLetterFrequency();
    }
}