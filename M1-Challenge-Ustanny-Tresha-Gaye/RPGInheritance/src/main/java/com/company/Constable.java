package com.company;

import java.util.Objects;

public class Constable extends GameCharacter {

    protected String jurisdiction;

    // generic constructor
    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.jurisdiction = jurisdiction;
    }

    public Constable() {

    }

    // constructor with initial values
    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5, false, false);
        this.jurisdiction = jurisdiction;
    }

    // methods

    public void arrestAnotherCharacter() {
        System.out.println(this.getName() + " says: You are under arrest!");
    }

    public int arrestAnotherCharacter (String character) {
        System.out.println(this.name + " says: Stop in the name of the law! " + character + ", you are under arrest!");
        stamina = stamina + 10;
        return stamina;
    }

    public String canArrest(String state) {

        if(state.equals("CT") || state.equals("MA")){
            System.out.println(this.name + "says: You're in my jurisdiction, I am authorized to arrest you!!");
            return "You have arrest authority";
//            strength += 20;
        }
        return "Error: Out of jurisdiction";
    }

    // intellisense generated code
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

