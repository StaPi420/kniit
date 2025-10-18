package org.kniit.lab3.task6;
import org.kniit.lab3.task6.races.Elf;
import org.kniit.lab3.task6.races.Human;
import org.kniit.lab3.task6.races.Race;
import org.kniit.lab3.task6.races.Dwarf;

public abstract class Player {
    protected String name;
    protected int curHP, maxHP, pos_x, pos_y, damage, defence, heal, moveDistance;
    protected Race race;
    protected boolean isAlive = true;

    public Player(int maxHP, int damage, int defence, int heal, String name){
        this.name = name;
        this.maxHP = maxHP;
        this.curHP = maxHP;
        this.damage = damage;
        this.defence = defence;
        this.heal = heal;
    }

    private void setRaceBonuses(){
        this.maxHP += this.race.getHPbonus();
        this.curHP = this.maxHP;
        this.damage += this.race.getDamageBonus();
        this.defence += this.race.getDefenceBonus();
        this.heal = this.race.getHealBonus();
    }

    public void setHumanRace(){
        this.race = new Human();
        this.setRaceBonuses();
    }

    public void setDwarfRace(){
        this.race = new Dwarf();
        this.setRaceBonuses();
    }

    public void setElfRace(){
        this.race = new Elf();
        this.setRaceBonuses();
    }

    public void movePlayer(int x, int y){
        int manhattanDistance = Math.abs(x - this.pos_x) + Math.abs(y - this.pos_y);
        if (manhattanDistance <= this.moveDistance){
            this.pos_x = x;
            this.pos_y = y;
        }
        else {
            System.out.println("Слишком далеко");
        }
    }

    public void changeHP(int changeHPValue){
        int newHP = changeHPValue + this.curHP;
        if (0 < newHP && newHP <= this.maxHP){
            this.curHP = newHP;
        }
        else if (newHP <= 0){
            this.isAlive = false;
        }
        else if (newHP > this.maxHP){
            this.curHP = maxHP;
        }
    }

    abstract String getPlayerClass();

@Override
public String toString() {
    return String.format(
        "Имя: %s\nКласс: %s\nРаса: %s\nТекущее HP: %d/%d\nУрон: %d\nЗащита: %d\nЛечение: %d\nПозиция: (%d, %d)\nСостояние: %s",
        this.name,
        this.getPlayerClass(),
        this.race,
        this.curHP,
        this.maxHP,
        this.damage,
        this.defence,
        this.heal,
        this.pos_x,
        this.pos_y,
        this.isAlive ? "Жив" : "Мертв"
    );
}
}
