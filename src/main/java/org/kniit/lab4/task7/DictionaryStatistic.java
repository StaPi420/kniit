package org.kniit.lab4.task7;

import java.util.ArrayList;

public class DictionaryStatistic {
    private ArrayList<String> words = new ArrayList<>();
    private int dictSize, polindrom, maxWordlength, minWordlength = (int) 1e9;

    private int[] letterFrequency = new int[33];

    public DictionaryStatistic() {

    }

    public void addWord(String word) {
        this.words.add(word);
        int wordLen = word.length();
        this.dictSize++;
        boolean isPolindrom = true;

        for (int i = 0; i < wordLen / 2; ++i) {
            if (word.charAt(i) != word.charAt(wordLen - 1 - i)) {
                isPolindrom = false;
                break;
            }
        }
        this.polindrom += (isPolindrom ? 1 : 0);

        this.maxWordlength = Math.max(this.maxWordlength, wordLen);
        this.minWordlength = Math.min(this.minWordlength, wordLen);

        for (char letter : word.toCharArray()) {
            if (Character.isLetter(letter)) {
                letterFrequency[letter - 'а']++;
            }
        }

    }

    public void printLetterFrequency() {
        StringBuilder res = new StringBuilder();
        for (int letter = 0; letter < 32; ++letter) {
            res.append(String.format("%c - %d\n", letter + 'а', letterFrequency[letter]));
        }
        System.out.println(res);
    }

    public String getRandomword() {
        return words.get((int) (words.size() * Math.random()));
    }

    public int getDictSize() {
        return this.dictSize;
    }

    public int getPolindrom() {
        return this.polindrom;
    }

    public int getMaxWordlength() {
        return this.maxWordlength;
    }

    public int getMinWordlength() {
        return this.minWordlength;
    }
}