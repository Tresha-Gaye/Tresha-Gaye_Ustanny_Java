package com.company;

public class Constable extends Characteristics {

    protected String jurisdiction;

    protected int arrestPoints;

    public void arrestAnotherCharacter() {
        System.out.println(this.getName() + " says: You are under arrest!");
        arrestPoints++;
    }

    public void attackAnotherCharacter() {
        System.out.println(this.getName() + " says: You are under attack!");
        attackPower = attackPower + 5;
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
                ", attackPoints=" + attackPoints +
                '}';
    }
}
