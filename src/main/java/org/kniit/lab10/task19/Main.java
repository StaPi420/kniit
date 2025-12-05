package org.kniit.lab10.task19;

public class Main {
    public static <T extends Comparable<T>> T findMax(T[] array){
        T maxElem = array[0];
        for (int i = 0; i < array.length; ++i){
            if (maxElem.compareTo(array[i]) < 0){
                maxElem = array[i];
            }
        }
        return maxElem;
    }

    public static void main(String[] args){
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println(findMax(numbers)); // 5

        String[] words = {"apple", "banana", "cherry"};
        System.out.println(findMax(words)); // cherry
    }
}
