package com.thoughtworks;

import static com.thoughtworks.SpecialNumberEnum.FIZZ;

class FizzBuzz {

    String fizzBuzz(int inputNumber) {
        StringBuilder result = new StringBuilder();
        for (SpecialNumberEnum specialNumberEnum: SpecialNumberEnum.values()) {
            if (String.valueOf(inputNumber).contains(String.valueOf(FIZZ.getSpecialNumber()))) {
                return FIZZ.getTransferString();
            }
            if (isTimesOfGivenNumber(inputNumber, specialNumberEnum.getSpecialNumber())) {
                result.append(specialNumberEnum.getTransferString());
            }
        }
        return result.length() == 0 ? String.valueOf(inputNumber) : result.toString();
    }

    private boolean isTimesOfGivenNumber(int inputNumber, int givenNumber) {
        return inputNumber % givenNumber == 0;
    }
}
