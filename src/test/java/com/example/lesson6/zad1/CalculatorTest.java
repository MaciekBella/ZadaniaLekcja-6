package com.example.lesson6.zad1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {




    @Test
    void shouldAddTwoValues1and1() {
        int sum = Calculator.sum(65, 54);

        Assertions.assertEquals(119, sum);
    }

    @Test
    void shouldSubtractTwoValues1and1() {
        int subtraction = Calculator.subtract(86, 62);

        Assertions.assertEquals(24, subtraction);
    }

    @Test
    void shouldMultipTwoValues1and1() {
        int multiplication = Calculator.multiply(95, 36);

        Assertions.assertEquals(3420, multiplication);
    }

    @Test
    void shouldDivideTwoValues1and1() {
        int division = Calculator.division(290, 9);

        Assertions.assertEquals(32, division);
    }
}

