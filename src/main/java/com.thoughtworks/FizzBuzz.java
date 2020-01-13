package com.thoughtworks;

class FizzBuzz {

    public static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String fizzBuzz(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return FIZZ;
        } else if (inputNumber % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(inputNumber);
    }
}
