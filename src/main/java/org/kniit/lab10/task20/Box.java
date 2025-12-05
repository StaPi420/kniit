package org.kniit.lab10.task20;

import java.util.ArrayList;

public class Box<T extends Number> {
    private ArrayList<T> content = new ArrayList<>();
    
    public void add(T element){
        content.add(element);
    }

    public double sum(){
        double ans = 0;
        for (T elem : content){
            ans += elem.doubleValue();
        }
        return ans;
    }
}
