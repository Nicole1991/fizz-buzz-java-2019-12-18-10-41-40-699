package com.thoughtworks;

class FizzBuzz {
    public String convertNumber(int inputNumber) {
        if (numberIsTimesOf3(inputNumber)) {
            return "Fizz";
        } else if (numberIsTimesOf5(inputNumber)) {
            return "Buzz";
        } else if (numberIsTimesOf7(inputNumber)) {
            return "Whizz";
        }
        return String.valueOf(inputNumber);
    }

    private boolean numberIsTimesOf7(int inputNumber) {
        return inputNumberIsTimesOfGivenNumber(inputNumber, 7);
    }

    private boolean numberIsTimesOf5(int inputNumber) {
        return inputNumberIsTimesOfGivenNumber(inputNumber, 5);
    }

    private boolean numberIsTimesOf3(int inputNumber) {
        return inputNumberIsTimesOfGivenNumber(inputNumber, 3);
    }

    private boolean inputNumberIsTimesOfGivenNumber(int inputNumber, int givenNumber) {
        return inputNumber % givenNumber == 0;
    }
}
