package org.kniit.lab2.task3;

public class Calculator {

    double a, b, result;
    String operation;

    public void setA(double a){
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setOperation(String operation){
        this.operation = operation;
    }

    public void add(){
        this.result = this.a + this.b;
    }

    public void subtract(){
        this.result = this.a - this.b;
    }

    public void multiply(){
        this.result = this.a * this.b;
    }

    public void divide(){
        if (this.b != 0)
            this.result = this.a / this.b;
        else
            System.out.println("Ошибка! Деление на 0 невозможно.");
    }

    public String toString(){
        return String.valueOf(this.result);
    }

}
