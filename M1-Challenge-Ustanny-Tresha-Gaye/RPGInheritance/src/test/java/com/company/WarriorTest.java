package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    @Test
    public void shouldIncreaseAttackPowerWhenWarriorAttacksAnotherCharacter() {

        Warrior warrior = new Warrior();
        warrior.setShieldStrength(10);

        int expectedOutput = 25;
        int actualOutput = warrior.attackAnotherCharacter("Jim");

//        expectedOutput = 4.5;
//        actualOutput = shop.calculatePrice(0.5, 9);

        assertEquals(expectedOutput, actualOutput, 0.0001);
    }

}