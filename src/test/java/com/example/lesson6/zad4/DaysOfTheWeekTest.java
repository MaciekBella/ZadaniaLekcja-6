package com.example.lesson6.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaysOfTheWeekTest {

    @Test
    void shouldGetDaysofTheWeek(){
        String resultDayNumber = DaysOfTheWeek.getDaysOfTheWeek(4);

       Assertions.assertEquals("Monday",resultDayNumber);
    }
}


