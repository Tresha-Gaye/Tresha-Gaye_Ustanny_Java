package com.company;

public class Farmer extends Characteristics {

    protected boolean plowing;

    protected boolean harvesting;


    public boolean isPlowing() {
        return plowing;
    }

    public void attackAnotherCharacter() {
        System.out.println(this.getName() + " says: You are under attack!");
        attackPower++;
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
                ", attackPoints=" + attackPoints +
                '}';
    }
}
