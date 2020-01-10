package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_when_given_number_is_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("Fizz", output);
    }

    @Test
    public void should_return_fizz_when_given_number_is_6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 6;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("Fizz", output);
    }

    @Test
    public void should_return_buzz_when_given_number_is_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 10;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("Buzz", output);
    }
}
