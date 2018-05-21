package com.company;


import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class Chance {

    private double probabilityOfOccurring;

    public Chance(double probabilityOfOccurring) {
        this.probabilityOfOccurring = probabilityOfOccurring;
    };

    public static Chance probability(double prob) throws Exception {
        if (prob < 0 || prob > 1) {
            throw new Exception("Invalid probability passed");
        }
       return new Chance(prob);
    }

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
