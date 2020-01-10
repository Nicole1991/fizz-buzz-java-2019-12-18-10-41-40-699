package com.thoughtworks;

class FizzBuzz {
    public String convertNumber(int inputNumber) {
        String result = "";
        if (numberIsTimesOf3(inputNumber)) {
            result = result + "Fizz";
        }
        if (numberIsTimesOf5(inputNumber)) {
            result = result +"Buzz";
        }
        if (numberIsTimesOf7(inputNumber)) {
            result = result + "Whizz";
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
}
