package com.example.lesson6.zad3;

public class EvenOrOddNumbers {


    public static boolean getEvenNumbers(int number){
        if (number % 2 == 0){
            System.out.println("Liczba parzysta - " + number);
        }
        return number % 2 == 0;
    }

    public static boolean getOddNumbers (int number){
        if (number % 2 > 0){
            System.out.println("Liczba nieparzysta - " + number);
        }
        return number % 2 > 0;
    }
}
