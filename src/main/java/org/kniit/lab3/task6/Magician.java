package org.kniit.lab3.task6;

public class Magician extends Player {
    public Magician(String name){
        super(13, 4, 3, 1,4, 20, name);
    }

    @Override
    public String getPlayerClass(){
        return "Маг";
    }
}
