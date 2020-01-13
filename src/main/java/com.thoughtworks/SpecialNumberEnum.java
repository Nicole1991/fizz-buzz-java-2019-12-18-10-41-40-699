package com.thoughtworks;

public enum  SpecialNumberEnum {
    FIZZ(3, "Fizz"),
    BUZZ(5, "Buzz"),
    WHIZZ(7, "Whizz"),;

    private int specialNumber;
    private String transferString;

    SpecialNumberEnum(int specialNumber, String transferString) {
        this.specialNumber = specialNumber;
        this.transferString = transferString;
    }

    public int getSpecialNumber() {
        return specialNumber;
    }

    public String getTransferString() {
        return transferString;
    }
}
