package org.kniit.lab3.task6;

public class Warrior extends Player {
    protected int range = 4; 
    public Warrior(String name){
        super(17, 6, 5, 0, name);
    }

    public void attack(Player otherPlayer){
        int manhattanDistance = Math.abs(this.pos_x - otherPlayer.pos_x) + Math.abs(this.pos_y - otherPlayer.pos_y);
        if (manhattanDistance <= this.range){
            int damage = -(this.damage > otherPlayer.defence ? this.damage : this.damage / 2);
            otherPlayer.changeHP(damage);
        } 
        else {
            System.out.println("Мимо!");
        }
    }

    @Override
    public String getPlayerClass(){
        return "Воин";
    }
}
