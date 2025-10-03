package org.kniit.lab2.task4;

public class Container {
    private double freeVolume;


    public Container(double volume){
        this.freeVolume = volume;
    }

    public void add(Shape shape){
        double shapeVolume = shape.getVolume();
        if (shapeVolume > freeVolume){
            System.out.println("Невозможно положить фигуру, так как нет достаточно свободного места.");
        }
        else{
            this.freeVolume -= shapeVolume;
        }
    }

    public double getFreeVolume(){
        return this.freeVolume;
    }
}
