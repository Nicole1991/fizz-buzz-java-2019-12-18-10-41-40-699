package com.thoughtworks;

class FizzBuzz {

    public static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String fizzBuzz(int inputNumber) {
        if (isTimesOfGivenNumber(inputNumber, 3)) {
            return FIZZ;
        } else if (isTimesOfGivenNumber(inputNumber, 5)) {
            return BUZZ;
        } else if (isTimesOfGivenNumber(inputNumber, 7)) {
            return WHIZZ;
        }
        return String.valueOf(inputNumber);
    }

    private boolean isTimesOfGivenNumber(int inputNumber, int givenNumber) {
        return inputNumber % givenNumber == 0;
    }
}
