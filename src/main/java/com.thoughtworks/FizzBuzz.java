package com.thoughtworks;

class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String convertNumber(int inputNumber) {
        String result = "";
        if (inputNumberContainsGivenNumber(inputNumber, 7)) {
            if (numberIsTimesOf3(inputNumber)) {
                result += FIZZ;
            }
            if (numberIsTimesOf7(inputNumber)) {
                result += WHIZZ;
            }
        } else if (inputNumberContainsGivenNumber(inputNumber, 5)) {
            result = getOutputForNumberIsTimesOf5And7(inputNumber, result);
            return result;
        } else {
            if (inputNumberContainsGivenNumber(inputNumber, 3)) {
                return FIZZ;
            }
            if (numberIsTimesOf3(inputNumber)) {
                result += FIZZ;
            }
            result = getOutputForNumberIsTimesOf5And7(inputNumber, result);
            if (!numberIsTimesOf3(inputNumber) && !numberIsTimesOf5(inputNumber) && !numberIsTimesOf7(inputNumber)) {
                return String.valueOf(inputNumber);
            }
        }
        return result;
    }

    private String getOutputForNumberIsTimesOf5And7(int inputNumber, String result) {
        if (numberIsTimesOf5(inputNumber)) {
            result += BUZZ;
        }
        if (numberIsTimesOf7(inputNumber)) {
            result += WHIZZ;
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
