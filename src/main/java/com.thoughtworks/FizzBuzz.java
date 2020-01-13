package com.thoughtworks;

class FizzBuzz {

    public String fizzBuzz(int inputNumber) {
        StringBuilder result = new StringBuilder();
        for (SpecialNumberEnum specialNumberEnum: SpecialNumberEnum.values()) {
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
