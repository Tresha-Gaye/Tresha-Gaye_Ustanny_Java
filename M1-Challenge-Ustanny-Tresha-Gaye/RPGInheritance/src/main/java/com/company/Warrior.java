package com.company;

import java.util.Objects;

public class Warrior extends Character {

    protected int shieldStrength;

    // generic constructor
    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.shieldStrength = shieldStrength;
    }

    public Warrior() {

    }

    // constructor with initial values
    public Warrior(String name, int shieldStrength) {
        super(name, 75, 100, 100, 50, 10, false, false);
        this.shieldStrength = shieldStrength;
    }

    // methods

    public int attackAnotherCharacter(String character) {
        // if warrior attack another character
        // warrior attackPower increases, strength decreases
        // other character health decreases
        attackPower += 5;
        System.out.println(this.name + " says: You are under attack, " + character + " !");

                return attackPower;
    }


    // intellisense generated code

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warrior)) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                ", name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", running=" + running +
                ", arrested=" + arrested +
                '}';
    }
}
