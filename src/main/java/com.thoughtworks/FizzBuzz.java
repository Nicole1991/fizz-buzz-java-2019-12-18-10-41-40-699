package com.thoughtworks;

class FizzBuzz {
    public String convertNumber(int inputNumber) {
        String result = "";
        if (numberIsTimesOf3(inputNumber) || inputNumberContainsGivenNumber(inputNumber, 3)) {
            result = result + "Fizz";
        }
        if (numberIsTimesOf5(inputNumber)) {
            result = result +"Buzz";
        }
        if (numberIsTimesOf7(inputNumber)) {
            result = result + "Whizz";
        }
        if (!numberIsTimesOf3(inputNumber) && !numberIsTimesOf5(inputNumber) && !numberIsTimesOf7(inputNumber)
            && !inputNumberContainsGivenNumber(inputNumber, 3)) {
            return String.valueOf(inputNumber);
        }
        return result;
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

    private boolean inputNumberContainsGivenNumber(int inputNumber, int givenNumber) {
        return String.valueOf(inputNumber).contains(String.valueOf(givenNumber));
    }
}
