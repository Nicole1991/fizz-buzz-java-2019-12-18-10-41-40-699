package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_when_given_number_is_times_of_3_like_6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 6;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("Fizz", output);
    }

    @Test
    public void should_return_buzz_when_given_number_is_times_of_5_like_10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 10;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("Buzz", output);
    }

    @Test
    public void should_return_whizz_when_given_number_is_times_of_7_like_14() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 14;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("Whizz", output);
    }

    @Test
    public void should_return_fizzbuzz_when_given_number_is_times_of_3_and_5_like_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 15;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("FizzBuzz", output);
    }
}
