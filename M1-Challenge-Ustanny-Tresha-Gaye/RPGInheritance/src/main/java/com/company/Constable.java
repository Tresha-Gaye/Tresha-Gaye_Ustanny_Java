package com.company;

import java.util.Objects;

public class Constable extends Character {

    protected String jurisdiction;
    // this should be a String

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5, false, false);
        this.jurisdiction = jurisdiction;
    }

    public Constable() {

    }

    public Constable(String name, String jurisdiction) {
        this.name = name;
        this.jurisdiction = jurisdiction;
    }


    public void arrestAnotherCharacter() {
        System.out.println(this.getName() + " says: You are under arrest!");
    }

        public void attackAnotherCharacter () {
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

    @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (!(o instanceof Constable)) return false;
            if (!super.equals(o)) return false;
            Constable constable = (Constable) o;
            return jurisdiction == constable.jurisdiction;
        }

        @Override
        public int hashCode () {
            return Objects.hash(super.hashCode(), jurisdiction);
        }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction=" + jurisdiction +
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

