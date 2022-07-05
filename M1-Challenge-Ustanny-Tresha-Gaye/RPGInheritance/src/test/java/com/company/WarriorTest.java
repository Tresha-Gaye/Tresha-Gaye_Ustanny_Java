package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {


    private Warrior warrior;
    private Farmer farmer;
    private Constable constable;

    @Before
    public void setUp() {
        warrior = new Warrior();
        farmer = new Farmer();
        constable = new Constable();
    }

    @Test
    public void shouldIncreaseAttackPowerWhenWarriorAttacksAnotherCharacter() {
//        int attackPower = 20;
        int expectedOutput = 25;
        int actualOutput = warrior.attackAnotherCharacter(20, "John");

//        expectedOutput = 4.5;
//        actualOutput = shop.calculatePrice(0.5, 9);

        assertEquals(expectedOutput, actualOutput, 0.0001);
    }

}