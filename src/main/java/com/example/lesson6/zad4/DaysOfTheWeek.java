package com.example.lesson6.zad4;

public class DaysOfTheWeek {

    public static String getDaysOfTheWeek(int numberDay){
        String nameDay;
        if (numberDay < 6){
            nameDay = "Monday";
        } else if (numberDay <=7) {
            nameDay = "Weekend";
        }else {
            nameDay = "There is no such day!";
        }
        return nameDay;
    }

}
