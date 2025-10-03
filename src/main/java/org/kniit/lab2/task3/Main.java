package org.kniit.lab2.task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            Calculator calculator = new Calculator();
            System.out.println("Введите первое число:");
            String a = scanner.nextLine();
            if (a.equals("exit")) System.exit(0);
            calculator.setA(Double.parseDouble(a));

            System.out.println("Введите второе число:");
            String b = scanner.nextLine();
            if (b.equals("exit")) System.exit(0);
            calculator.setB(Double.parseDouble(b));


            System.out.println("Введите оператор (+, -, *, /):");
            String operation = scanner.nextLine();
            if (operation.equals("exit")) System.exit(0);
            calculator.setOperation(operation);

            System.out.println(calculator);
        }
    }
}
