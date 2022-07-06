package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    @Test
    public void shouldIncreaseStaminaWhenConstableMakesArrest() {

        Constable constable = new Constable();
        constable.setName("Jon Snow");
        constable.setStamina(25);

        int expectedOutput = 35;
        int actualOutput = constable.arrestAnotherCharacter("Jim");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldSpecifyConstableJurisdiction() {

        Constable constable = new Constable();
        constable.setName("Jon Snow");
        constable.setStamina(25);

        int expectedOutput = 35;
        int actualOutput = constable.arrestAnotherCharacter("Jim");

        assertEquals(expectedOutput, actualOutput);
    }

}