package org.kniit.lab5.task8;

public class ShopItem {
    String name, stateOfManufacturing;
    int cost; 

    public ShopItem(String name, String stateOfManufacturing, int cost){
        this.name = name;
        this.cost = cost;
        this.stateOfManufacturing = stateOfManufacturing;
    }

    @Override
    public String toString(){
        return String.format("Наименование: %s. Цена: %d. Страна проивзодитель: %s",
        this.name, this.cost, this.stateOfManufacturing);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        ShopItem other = (ShopItem) o;
        boolean isNameEqual = this.name.equals(other.name);
        boolean isCostEqual = this.cost == other.cost;
        boolean isStateEqual = this.stateOfManufacturing.equals(other.stateOfManufacturing);
        if (isNameEqual && isCostEqual && isStateEqual) return true;
        return false;
    }

    @Override
    public int hashCode(){
        return this.cost + this.name.hashCode() + this.stateOfManufacturing.hashCode();
    }
}
