package com.thoughtworks;

import static com.thoughtworks.SpecialNumberEnum.BUZZ;
import static com.thoughtworks.SpecialNumberEnum.FIZZ;
import static com.thoughtworks.SpecialNumberEnum.WHIZZ;

class FizzBuzz {

    String fizzBuzz(int inputNumber) {
        StringBuilder result = new StringBuilder();
        if (isContainsSpecialNumber(inputNumber, WHIZZ.getSpecialNumber())) {
            containsSpecialNumberRule(inputNumber, result, FIZZ);
        } else if (isContainsSpecialNumber(inputNumber, BUZZ.getSpecialNumber())) {
            containsSpecialNumberRule(inputNumber, result, BUZZ);
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

    private void containsSpecialNumberRule(int inputNumber, StringBuilder result, SpecialNumberEnum specialNumber) {
        if (isTimesOfGivenNumber(inputNumber, specialNumber.getSpecialNumber())) {
            result.append(specialNumber.getTransferString());
        }
        if (isTimesOfGivenNumber(inputNumber, WHIZZ.getSpecialNumber())) {
            result.append(WHIZZ.getTransferString());
        }
    }

    private boolean isContainsSpecialNumber(int inputNumber, int givenNumber) {
        return String.valueOf(inputNumber).contains(String.valueOf(givenNumber));
    }

    private boolean isTimesOfGivenNumber(int inputNumber, int givenNumber) {
        return inputNumber % givenNumber == 0;
    }
}
