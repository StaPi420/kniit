package org.kniit.lab5.task8;

import java.util.Comparator;

class SortByCost implements Comparator<ShopItem>{
    public int compare(ShopItem a, ShopItem b){
        if (a.cost < b.cost) return -1;
        if (a.cost == b.cost) return 0;
        return 1;
    }
}