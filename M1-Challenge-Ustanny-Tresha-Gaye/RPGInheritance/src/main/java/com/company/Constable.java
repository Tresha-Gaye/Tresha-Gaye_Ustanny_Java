package com.company;

import java.util.Objects;

public class Constable extends Character {

    protected String jurisdiction;

    protected int arrestPoints;
    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, String jurisdiction, int arrestPoints) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.name = name;
        this.strength = 60;
        this.health = 100;
        this.stamina = 60;
        this.speed = 20;
        this.attackPower = 5;
        this.running = false;
        this.arrested = false;
        this.jurisdiction = jurisdiction;
        this.arrestPoints = arrestPoints;
    }

    public Constable() {

    }

    public void arrestAnotherCharacter() {
        System.out.println(this.getName() + " says: You are under arrest!");
        arrestPoints++;
    }

    public void attackAnotherCharacter() {
        System.out.println(this.getName() + " says: You are under attack!");
        attackPower = attackPower + 5;
        health = health - 10;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public int getArrestPoints() {
        return arrestPoints;
    }

    public void setArrestPoints(int arrestPoints) {
        this.arrestPoints = arrestPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Constable)) return false;
        Constable constable = (Constable) o;
        return getArrestPoints() == constable.getArrestPoints() && Objects.equals(getJurisdiction(), constable.getJurisdiction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJurisdiction(), getArrestPoints());
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                ", arrestPoints=" + arrestPoints +
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
