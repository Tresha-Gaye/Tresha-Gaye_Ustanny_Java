package com.company;

public class Warrior extends Characteristics {

    protected int shieldStrength;

    public void attackAnotherCharacter() {
        System.out.println(this.getName() + " says: You are under attack!");
        attackPower = attackPower + 10;
    }
}
