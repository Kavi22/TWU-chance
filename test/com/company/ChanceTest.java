package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChanceTest {

    @Test
    public void shouldConsiderTwoChancesEqual() {
        Chance chance1 = new Chance(0.1);
        Chance chance2 = new Chance(0.1);

        assertEquals(chance1, chance2);

    }

    @Test
    public void shouldConsiderDifferentChancesNotEqual() {
        Chance chance1 = new Chance(0.1);
        Chance chance2 = new Chance(0.2);

        assertNotEquals(chance1, chance2);
    }

    @Test
    public void shouldGetTheComplement() {
        Chance chance1 = new Chance(0.1);
        Chance chance1Complement = new Chance(0.9);

        assertEquals(chance1Complement, chance1.complement());

        Chance chance2 = new Chance(0.6);
        Chance chance2Complement = new Chance(0.4);

        assertEquals(chance2Complement, chance2.complement());
    }

}