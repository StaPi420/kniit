package org.kniit.lab11.task25.demo.src.main.java.com.example;

import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу или папке: ");
        String path = scanner.nextLine();

        FileProcessor processor = new FileProcessor();
        processor.proccesFiles(path);
        scanner.close();
    }
}