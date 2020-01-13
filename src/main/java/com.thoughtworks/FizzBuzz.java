package com.thoughtworks;

class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String fizzBuzz(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return FIZZ;
        }
        return String.valueOf(inputNumber);
    }
}
