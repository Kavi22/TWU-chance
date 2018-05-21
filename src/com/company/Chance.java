package com.company;

public class Chance {

    private double number ;

    public Chance (double num){
        this.number = num;
    }

    @Override
    public boolean equals(Object obj){
        if(getClass() != (obj.getClass())) return false;
        Chance otherChance = (Chance) obj;
        return this.number == otherChance.number;
    }

    public Chance complimentaryNumber() {
        return new Chance(1 - this.number);
    }
}
