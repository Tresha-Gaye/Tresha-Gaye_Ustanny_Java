package com.company;

import java.util.Objects;

public class Farmer extends Character {

    protected boolean plowing;

    protected boolean harvesting;

    public Farmer() {
        name = "";
        strength= 75;
        health= 75;
        stamina= 75;
        speed= 10;
        attackPower= 1;
        running= false;
        arrested= false;
        this.plowing = false;
        this.harvesting = false;
    }

    // methods //
    public void attackAnotherCharacter() {
        System.out.println(this.getName() + " says: You are under attack!");
        attackPower++;
    }

    public void farmWork() {
        if (plowing) {
            strength += 5;
            speed += 2;
        }
    }

    public int farmFresh() {
        if (harvesting) {
            health += 3;
            stamina += 5;
        }
        return health & stamina;
    }

    public void arrested() {
        if (arrested) {
            speed = 0;
            running = false;
        }
    }

    // setters & getters //
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = 75;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = 100;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = 75;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = 10;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = 1;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = false;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = false;
    }

    public boolean isPlowing() {
        return plowing;
    }

     public void setPlowing(boolean plowing) {
        this.plowing = false;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = false;
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
