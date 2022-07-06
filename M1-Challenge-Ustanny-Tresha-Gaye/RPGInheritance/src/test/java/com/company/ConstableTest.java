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
    public void shouldAllowConstableToMakeArrestIfWithinJurisdiction() {

        Constable constable = new Constable();
        constable.setName("Jon Snow");

        String expectedOutput = "You have arrest authority";
        String actualOutput = constable.canArrest("CT");


        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnErrorMessageIfNotWithinJurisdiction() {

        Constable constable = new Constable();
        constable.setName("Jon Snow");
        constable.setStrength(20);


        String expectedOutput = "Error: Out of jurisdiction";
        String actualOutput = constable.canArrest("PA");

        assertEquals(expectedOutput, actualOutput);
    }

}