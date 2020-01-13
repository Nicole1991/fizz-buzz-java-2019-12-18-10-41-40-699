package com.thoughtworks;

import static com.thoughtworks.SpecialNumberEnum.BUZZ;
import static com.thoughtworks.SpecialNumberEnum.FIZZ;
import static com.thoughtworks.SpecialNumberEnum.WHIZZ;

class FizzBuzz {

    String fizzBuzz(int inputNumber) {
        StringBuilder result = new StringBuilder();
        if (isContainsSpecialNumber(inputNumber, WHIZZ.getSpecialNumber())) {
            if (isTimesOfGivenNumber(inputNumber, FIZZ.getSpecialNumber())) {
                result.append(FIZZ.getTransferString());
            }
            if (isTimesOfGivenNumber(inputNumber, WHIZZ.getSpecialNumber())) {
                result.append(WHIZZ.getTransferString());
            }
        } else if (isContainsSpecialNumber(inputNumber, BUZZ.getSpecialNumber())) {
            if (isTimesOfGivenNumber(inputNumber, BUZZ.getSpecialNumber())) {
                result.append(BUZZ.getTransferString());
            }
            if (isTimesOfGivenNumber(inputNumber, WHIZZ.getSpecialNumber())) {
                result.append(WHIZZ.getTransferString());
            }
        } else if (isContainsSpecialNumber(inputNumber, FIZZ.getSpecialNumber())) {
            return FIZZ.getTransferString();
        } else {
            for (SpecialNumberEnum specialNumberEnum: SpecialNumberEnum.values()) {
                if (isTimesOfGivenNumber(inputNumber, specialNumberEnum.getSpecialNumber())) {
                    result.append(specialNumberEnum.getTransferString());
                }
            }
        }
        return result.length() == 0 ? String.valueOf(inputNumber) : result.toString();
    }

    private boolean isContainsSpecialNumber(int inputNumber, int givenNumber) {
        return String.valueOf(inputNumber).contains(String.valueOf(givenNumber));
    }

    private boolean isTimesOfGivenNumber(int inputNumber, int givenNumber) {
        return inputNumber % givenNumber == 0;
    }
}
