package org.kniit.lab5.task9;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class RandomWords {
    private String[] words = {"вселенная",
        "квантовый",
        "бесконечность",
        "созвездие",
        "гравитация",
        "спираль",
        "эфир",
        "сингулярность",
        "пульсар",
        "галактика",
        "сверкать",
        "шепот",
        "сумерки",
        "безмятежный",
        "хрустальный",
        "мерцание",
        "таинственный",
        "сияние",
        "прозрачный",
        "отражение",
        "эволюция",
        "синтез",
        "анализировать",
        "гипотеза",
        "парадокс",
        "интуиция",
        "феномен",
        "структура",
        "интерпретация",
        "критерий",
        "вдохновение",
        "воспоминание",
        "гармония",
        "изысканный",
        "ностальгия",
        "впечатление",
        "восторг",
        "уязвимый",
        "эфемерный",
        "созерцание",
        "механизм",
        "калейдоскоп",
        "лабиринт",
        "воронка",
        "маховик",
        "шестеренка",
        "портал",
        "конструкция",
        "алгоритм",
        "интерактивный" };
    private ArrayList<String> randomWords;
    private int currenWord = 0;

    public RandomWords(){
        randomWords = new ArrayList<>();

        for (String word : words){
            randomWords.add(word);
        }

        Collections.shuffle(randomWords);
    }

    Random random = new Random();
    
    public String getRandomWord(){
        return randomWords.get(currenWord++ % 50);
    }
}
