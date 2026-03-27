package com.example.lab2.task1;

public class Main {
    public static void main(String[] args) {
        FileInterface fileInterface = FileInterface.getInstance();
        fileInterface.writeToFile("Hello, World!");
        fileInterface = null;
        fileInterface = FileInterface.getInstance();
        System.out.println(fileInterface.readFromFile());
    }
}
