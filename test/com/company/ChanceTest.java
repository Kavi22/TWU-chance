package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChanceTest {

    @Test
    public void shouldConsiderTwoChancesEqual() throws Exception {
        Chance chance1 = Chance.probability(0.1);
        Chance chance2 = Chance.probability(0.1);

        assertEquals(chance1, chance2);
    }

    @Test
    public void shouldConsiderDifferentChancesNotEqual() throws Exception {
        Chance chance1 = Chance.probability(0.1);
        Chance chance2 = Chance.probability(0.2);

        assertNotEquals(chance1, chance2);
    }

    @Test
    public void shouldGetTheComplement() throws Exception {
        Chance chance1 = Chance.probability(0.1);
        Chance chance1Complement = Chance.probability(0.9);

        assertEquals(chance1Complement, chance1.complement());

        Chance chance2 = Chance.probability(0.6);
        Chance chance2Complement = Chance.probability(0.4);

        assertEquals(chance2Complement, chance2.complement());
    }

    @Test
    public void shouldAcceptValidProbability() throws Exception {
        try {
            Chance chance1 = Chance.probability(-0.1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}