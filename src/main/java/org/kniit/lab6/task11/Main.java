package org.kniit.lab6.task11;

import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("""
Меню:
1. Добавить студента
2. Удалить студента
3. Показать всех студентов
4. Найти студента
5. Выйти""");
        TreeSet<String> students = new TreeSet<>();
        Scanner scanner = new Scanner(System.in, "ibm866");
        String student;
        while (true){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите ФИО студента");
                    student = scanner.nextLine();
                    if (students.contains(student)){
                        System.out.println("Студент уже есть");
                    }                    
                    else {
                        students.add(student);
                    }
                    break;
                case 2:
                    System.out.println("Введите ФИО студента");
                    student = scanner.nextLine();
                    if (!students.contains(student)){
                        System.out.println("Такого студента нет!");
                    }                    
                    else {
                        students.remove(student);
                    }
                    break;
                case 3:
                        for (String st : students) {
                            System.out.println(st);
                        }
                        break;
                case 4:
                    System.out.println("Введите ФИО студента");
                    student = scanner.nextLine();
                    if (students.contains(student)){
                        System.out.println("Такой студент есть");
                    }                    
                    else {
                        System.out.println("Такого студента нет");
                    }
                    break;   
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Такой команды нет");
                break;
                
            }
            System.out.println("Введите комманду");
        }
    }
}
