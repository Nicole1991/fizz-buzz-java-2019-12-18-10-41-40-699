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
        int inputNumber = 60;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("FizzBuzz", output);
    }

    @Test
    public void should_return_number_when_given_number_is_not_times_of_3_or_5_or_7_like_4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 4;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("4", output);
    }

    @Test
    public void should_return_fizz_when_given_number_is_contains_3_like_13() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 23;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("Fizz", output);
    }

    @Test
    public void should_return_fizz_when_given_number_is_contains_3_and_times_of_5_or_7_like_30() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 30;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("Fizz", output);
    }

    @Test
    public void should_return_buzzwhizz_when_given_number_is_contains_5_and_times_of_or_5_or_7_and_ignore_times_of_3_or_contains_3_like_35() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 35;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("BuzzWhizz", output);
    }

    @Test
    public void should_return_fizz_when_given_number_is_contains_7_and_times_of_3_and_ignore_times_of_5_or_contains_5_like_75() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 75;
        String output = fizzBuzz.convertNumber(inputNumber);
        assertEquals("Fizz", output);
    }
}
