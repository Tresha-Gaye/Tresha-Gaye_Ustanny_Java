package com.company;

import java.util.Objects;

public class Farmer extends GameCharacter {

    protected boolean plowing;

    protected boolean harvesting;

    // generic constructor
    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean plowing, boolean harvesting) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    // constructor with initial values
    public Farmer(String name, boolean plowing, boolean harvesting) {
        super(name, 75, 75, 75, 10, 1, false, false);
        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    public Farmer() {

    }
    // methods //

    public int gotAttacked(String character) {
        boolean attacked = true;
        if (attacked) {
            strength -= 5;
        }
        System.out.println(this.name + " says: Oh no! We're under attack by " + character + " !");
        System.out.println(this.name + " now has " + this.strength + " health!");
        return strength;
    }


    public int farmFresh() {
        boolean harvesting = true;
        if(harvesting) {
            health += 3;
        }
       return health ;
    }

    // intellisense generated code

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Farmer)) return false;
        Farmer farmer = (Farmer) o;
        return isPlowing() == farmer.isPlowing() && isHarvesting() == farmer.isHarvesting();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPlowing(), isHarvesting());
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "plowing=" + plowing +
                ", harvesting=" + harvesting +
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
