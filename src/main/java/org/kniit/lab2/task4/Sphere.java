package org.kniit.lab2.task4;

public class Sphere extends Shape {
    private double radius;
    public Sphere(double radius){
        this.radius = radius;
        this.volume = Math.pow(radius, 3) * Math.PI * 4 / 3;
    }
}
