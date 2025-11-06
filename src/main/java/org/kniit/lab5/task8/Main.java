package org.kniit.lab5.task8;

import java.util.Arrays;
import java.util.Random;

class Main{
    static void main(String[] args){
        String[] names = {"книга", "ручка", "тетрадь", "карандаш", "линейка"};
        String[] states = {"Россия", "Китай"};

        Random random = new Random();

        ShopItem[] itemsArray = new ShopItem[100];

        for (int i = 0; i < 100; ++i){
            ShopItem newItem = new ShopItem(
                names[random.nextInt(5)],
                states[random.nextInt(2)],
                random.nextInt(1, 10));
            itemsArray[i] = newItem;
        }

        Arrays.sort(itemsArray, new SortByCost());
        for (ShopItem item : itemsArray){
            System.out.println(item);
        }

        int cnt = 0;
        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; ++j){
                if (i == j) continue;
                if (itemsArray[i].equals(itemsArray[j])) ++cnt;
            }
        }

        System.out.println(cnt);
    }

}
