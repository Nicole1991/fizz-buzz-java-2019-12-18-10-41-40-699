package com.thoughtworks;

class FizzBuzz {

    public String fizzBuzz(int inputNumber) {
        for (SpecialNumberEnum specialNumberEnum: SpecialNumberEnum.values()) {
            if (inputNumber % specialNumberEnum.getSpecialNumber() == 0) {
                return specialNumberEnum.getTransferString();
            }
        }
        return String.valueOf(inputNumber);
    }

    private boolean isTimesOfGivenNumber(int inputNumber, int givenNumber) {
        return inputNumber % givenNumber == 0;
    }
}
