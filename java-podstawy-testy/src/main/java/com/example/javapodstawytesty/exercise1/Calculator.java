package com.example.javapodstawytesty.exercise1;

public class Calculator {

    public double sum(double a, double b){
        return a + b;
    }

    public int division2(int a, int b){
        if(b == 0){
            return 0;
        }
        return a / b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta.
    public static boolean isEven(int number){
        return number % 2 == 0;
    }




}
