package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    @Test
    public void shouldIncreaseAttackPowerWhenWarriorAttacksAnotherCharacter() {

        Warrior warrior = new Warrior();
        warrior.setName("Ron");
        warrior.setAttackPower(10);

        int expectedOutput = 15;
        int actualOutput = warrior.attackAnotherCharacter("Jim");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldDecreaseShieldStrengthIfArrested() {

        Warrior warrior = new Warrior();
        warrior.setName("Ron");
        warrior.setShieldStrength(10);

        int expectedOutput = 5;
        int actualOutput = warrior.resistArrest();

        assertEquals(expectedOutput, actualOutput);
    }

}