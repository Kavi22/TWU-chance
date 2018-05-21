package com.company;

public class Chance {

    private double probabilityOfOccurring;

    public Chance(double probabilityOfOccurring) {
        this.probabilityOfOccurring = probabilityOfOccurring;
    };

    @Override
    public int hashCode() {
        return (int) probabilityOfOccurring;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) return false;
        Chance comparisonObject = (Chance) obj;
        return (comparisonObject.probabilityOfOccurring == this.probabilityOfOccurring);
    }


    public Chance complement() {
        return new Chance((1 - this.probabilityOfOccurring));
    }
}
