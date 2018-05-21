package com.company;

import java.util.Objects;

public class Chance {

    private final double probabilityOfOccurring;


    // Constructors
    private Chance(double probabilityOfOccurring) {
        this.probabilityOfOccurring = probabilityOfOccurring;
    };

//    createChanceFrom...?

    public static Chance probability(double prob) throws Exception {
        if (prob < 0 || prob > 1) {
            throw new Exception("Invalid probability passed");
        }
       return new Chance(prob);
    }

//
//    // Override Methods
//    @Override
//    public int hashCode() {
//        return (int) (probabilityOfOccurring * 100);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj.getClass() != this.getClass()) return false;
//        Chance comparisonObject = (Chance) obj;
//        return (comparisonObject.probabilityOfOccurring == this.probabilityOfOccurring);
//    }

    // Auto Generated override methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(chance.probabilityOfOccurring, probabilityOfOccurring) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(probabilityOfOccurring);
    }

    // Methods
    public Chance complement() {

        return new Chance((1 - this.probabilityOfOccurring));
    }
}
