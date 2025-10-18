package org.kniit.lab3.task6;

public class Magician extends Player {
    public Magician(String name){
        super(13, 4, 3, 1, name);
    }

    public void castSpell(Player otherPlayer){
        int damage = -(this.damage > otherPlayer.defence ? this.damage : this.damage / 2);
        otherPlayer.changeHP(damage);
    }

    @Override
    public String getPlayerClass(){
        return "Маг";
    }
}
