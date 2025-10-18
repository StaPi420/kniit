package org.kniit.lab3.task6;

public class Tank extends Warrior{

    public Tank(String name){
        super(name);
        this.maxHP += 3;
        this.curHP = this.maxHP;
        this.damage -= 2;
        this.defence += 1;
        this.moveDistance -= 1;
    }
    
    @Override
    public String getPlayerClass(){
        return "Танк";
    }
    
}
