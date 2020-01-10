package com.thoughtworks;

class FizzBuzz {
    public String convertNumber(int inputNumber) {
        String result = "";
        if (inputNumberContainsGivenNumber(inputNumber, 5)) {
            if (numberIsTimesOf5(inputNumber)) {
                result += "Buzz";
            }
            if (numberIsTimesOf7(inputNumber)) {
                result += "Whizz";
            }
            return result;
        } else {
            if (inputNumberContainsGivenNumber(inputNumber, 3)) {
                return "Fizz";
            }
            if (numberIsTimesOf3(inputNumber)) {
                result += "Fizz";
            }
            if (numberIsTimesOf5(inputNumber)) {
                result += "Buzz";
            }
            if (numberIsTimesOf7(inputNumber)) {
                result += "Whizz";
            }
            if (!numberIsTimesOf3(inputNumber) && !numberIsTimesOf5(inputNumber) && !numberIsTimesOf7(inputNumber)) {
                return String.valueOf(inputNumber);
            }
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
