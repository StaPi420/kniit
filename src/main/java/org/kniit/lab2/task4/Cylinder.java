package org.kniit.lab2.task4;

public class Cylinder extends Shape {
    private double h, radius;
    public Cylinder(double h, double radius){
        this.h = h;
        this.radius = radius;
        this.volume = Math.pow(this.radius, 3) * Math.PI * 4 * this.h / 3;
    }
}
