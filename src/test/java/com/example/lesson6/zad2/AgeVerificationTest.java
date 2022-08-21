package com.example.lesson6.zad2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeVerificationTest {


    @Test

    void shouldGetAgeVerification(){
        boolean resultVerification = AgeVerification.getAgeVerification(14);

        Assertions.assertEquals(false,resultVerification);
    }
}
