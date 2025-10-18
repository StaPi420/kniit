package org.kniit.lab3.task6;

public class Warrior extends Player {
    public Warrior(String name){
        super(17, 6, 5, 0, 3, 4, name);
    }

    @Override
    public String getPlayerClass(){
        return "Воин";
    }
}
