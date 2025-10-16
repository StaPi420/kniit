package org.kniit.lab3.task6.races;

public class Race {
    protected int HPbonus, damageBonus, defenceBonus, healBonus;

    public Race(int HPbonus, int damageBonus, int defenceBonus, int healBonus){
        this.HPbonus = HPbonus;
        this.damageBonus = damageBonus;
        this.defenceBonus = defenceBonus;
        this.healBonus = healBonus;
    }
}
