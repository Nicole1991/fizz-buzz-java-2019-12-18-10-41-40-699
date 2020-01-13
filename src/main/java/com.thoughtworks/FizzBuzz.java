package com.thoughtworks;

class FizzBuzz {

    public static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String fizzBuzz(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return FIZZ;
        } else if (inputNumber % 5 == 0) {
            return BUZZ;
        } else if (inputNumber % 7 == 0) {
            return WHIZZ;
        }
        return String.valueOf(inputNumber);
    }
}
