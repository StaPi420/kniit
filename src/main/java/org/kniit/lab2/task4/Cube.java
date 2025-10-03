package org.kniit.lab2.task4;

public class Cube extends Shape{
    private double a;
    public Cube(double a){
        this.a = a;
        this.volume = a * a * a;
    }
}