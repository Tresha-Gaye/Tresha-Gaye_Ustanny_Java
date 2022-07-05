package com.company;

import java.util.Objects;

public class Warrior extends Character {

    protected int shieldStrength;

    public Warrior(){
        name = "";
        strength = 75;
        health = 100;
        stamina = 100;
        speed = 50;
        attackPower = 10;
        running = false;
        arrested = false;
        this.shieldStrength = shieldStrength;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public int attackAnotherCharacter(int attackPower, String name) {
        // if warrior attack another character
        // warrior attackPower increases, strength decreases
        // other character health decreases
        name = this.getName();
        attackPower += 5;
        System.out.println(this.name + " says: You are under attack, " + this.getName() + " !");

                return attackPower;
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
