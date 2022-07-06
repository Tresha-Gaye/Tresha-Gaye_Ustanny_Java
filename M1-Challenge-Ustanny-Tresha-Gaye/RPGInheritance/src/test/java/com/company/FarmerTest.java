package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    @Test
    public void shouldDecreaseStrengthIfAttackedByAnotherCharacter() {

        Farmer farmer = new Farmer();
        farmer.setName("Jim");
        farmer.setStrength(10);

        int expectedOutput = 5;
        int actualOutput = farmer.gotAttacked("Constable");

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void shouldIncreaseHealthWhenHarvesting() {

        Farmer farmer = new Farmer();
        farmer.setName("Tom");
        farmer.setHealth(10);


        int expectedOutput = 13;
        int actualOutput = farmer.farmFresh();

        // Assert
        assertEquals(expectedOutput, actualOutput);


    }
}