package org.kniit.lab3.task6;

public class Priest extends Player {
    public Priest(String name){
        super(10, 2, 3, 3, name);
    }

    public void castSpell(Player otherPlayer){
        int damage = -(this.damage > otherPlayer.defence ? this.damage : this.damage / 2);
        otherPlayer.changeHP(damage);
    }

    @Override
    public String getPlayerClass(){
        return "Священник";
    }
}
