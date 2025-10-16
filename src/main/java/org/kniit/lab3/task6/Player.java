package org.kniit.lab3.task6;
import org.kniit.lab3.task6.races.Race;

public class Player {
    protected String name;
    protected int curHP, maxHP, pos_x, pos_y, damage, defence;
    protected Race race;

    public Player(int maxHP, int damage, int defence, String name){
        this.name = name;
        this.maxHP = maxHP;
        this.curHP = maxHP;
        this.damage = damage;
        this.defence = defence;
    }
}
