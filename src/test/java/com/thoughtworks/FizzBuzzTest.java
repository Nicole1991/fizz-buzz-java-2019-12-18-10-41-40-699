package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_when_given_number_is_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("fizz", output);
    }
}
