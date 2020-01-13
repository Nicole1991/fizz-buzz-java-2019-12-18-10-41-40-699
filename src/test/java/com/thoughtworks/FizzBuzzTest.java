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
}
