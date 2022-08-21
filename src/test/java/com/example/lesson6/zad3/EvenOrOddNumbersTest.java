package com.example.lesson6.zad3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenOrOddNumbersTest {



    @Test
    void shouldEvenNumbers(){
        boolean resultEvenNumbers = EvenOrOddNumbers.getEvenNumbers(20);
        Assertions.assertEquals(true,resultEvenNumbers);
    }

    @Test
    void shouldOddNumbers(){
        boolean resultOddNumbers = EvenOrOddNumbers.getOddNumbers(69);

        Assertions.assertEquals(true,resultOddNumbers);
    }
}
