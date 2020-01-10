package com.thoughtworks;

class FizzBuzz {
    public String convertNumber(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return "Fizz";
        } else if (inputNumber % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(inputNumber);
    }
}
