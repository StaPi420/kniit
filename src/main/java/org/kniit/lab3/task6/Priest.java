package org.kniit.lab3.task6;

public class Priest extends Player {
    public Priest(String name){
        super(10, 2, 3, 3, 4, 20, name);
    }

    @Override
    public String getPlayerClass(){
        return "Священник";
    }
}
