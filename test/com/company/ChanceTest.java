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

}