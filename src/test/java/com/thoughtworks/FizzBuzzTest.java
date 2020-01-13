package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_when_given_number_is_times_of_3_like_6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 6;
        String output = fizzBuzz.fizzBuzz(inputNumber);
        assertEquals("Fizz", output);
    }

    @Test
    public void should_return_number_when_given_number_is_not_times_of_3_like_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 2;
        String output = fizzBuzz.fizzBuzz(inputNumber);
        assertEquals("2", output);
    }

    @Test
    public void should_return_buzz_when_given_number_is_times_of_5_like_10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 10;
        String output = fizzBuzz.fizzBuzz(inputNumber);
        assertEquals("Buzz", output);
    }

    @Test
    public void should_return_Whizz_when_given_number_is_times_of_7_like_14() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 14;
        String output = fizzBuzz.fizzBuzz(inputNumber);
        assertEquals("Whizz", output);
    }

    @Test
    public void should_return_FizzBuzz_when_given_number_is_times_of_3_and_times_of_5_like_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 15;
        String output = fizzBuzz.fizzBuzz(inputNumber);
        assertEquals("FizzBuzz", output);
    }

    @Test
    public void should_return_FizzWhizz_when_given_number_is_times_of_3_and_times_of_7_like_21() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 21;
        String output = fizzBuzz.fizzBuzz(inputNumber);
        assertEquals("FizzWhizz", output);
    }

    @Test
    public void should_return_Fizz_when_given_number_contains_3_like_13() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 13;
        String output = fizzBuzz.fizzBuzz(inputNumber);
        assertEquals("Fizz", output);
    }
}
