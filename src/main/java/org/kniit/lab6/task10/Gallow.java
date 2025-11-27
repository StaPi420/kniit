package org.kniit.lab6.task10;

import java.util.TreeSet;

public class Gallow {
    private int triesLeft;
    private String word; 
    private boolean[] isLetterOpened;
    private TreeSet<Character> lettersUsed = new TreeSet<>();
    private RandomWords randomWords = new RandomWords();


    public Gallow(){
        word = randomWords.getRandomWord();
        triesLeft = 6;
        isLetterOpened = new boolean[word.length()];
        System.out.printf("Загаданное слово: %s\n", getCurGameState());
    }

    public String getWord(){
        return word;
    }

    public String getCurGameState(){
        StringBuilder response = new StringBuilder(); 
        for (int i = 0; i < word.length(); ++i){
            if (isLetterOpened[i]){
                response.append(word.charAt(i)).append(' ');
            }
            else {
                response.append("_ ");
            }
        }
        return response.toString();
    }

    public boolean makeGuess(Character letter){
        if (lettersUsed.contains(letter)){
            System.out.println("Эта буква уже была, попробуйте другую.");
            return true;
        }
        lettersUsed.add(letter);
        if (word.indexOf(letter) != -1){
            setLetterOpened(letter);
            System.out.printf("Верно!Загаданное слово: %s\n", getCurGameState());
            return true;
        }
        else {
            triesLeft--;
            if (triesLeft == 0){
                return false;
            }
            System.out.printf("Неверно! Попыток осталось: %d.\n", triesLeft);
            return true;
        } 
    }

    public void setLetterOpened(Character letter){
        for (int i = 0; i < word.length(); ++i){
            if (letter == word.charAt(i)){
                isLetterOpened[i] = true;
            }
        }
    }

    public boolean isWin(){
        for (boolean isOpened : isLetterOpened){
            if (!isOpened) return false;
        }
        return true;
    }
}
