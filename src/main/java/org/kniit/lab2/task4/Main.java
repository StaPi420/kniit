package org.kniit.lab2.task4;

public class Main {
    public static void main(String[] args){
        Container container = new Container(1000);
        Sphere sphere = new Sphere(3);
        Cube cube = new Cube(3);
        Cylinder cylinder = new Cylinder(4, 3);
        container.add(sphere);
        container.add(cylinder);
        container.add(cube);
        Sphere sphere1 = new Sphere(100);
        container.add(sphere1);
        System.out.println(container.getFreeVolume());
    }
}
