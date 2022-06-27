package com.company;

public class CharacterApplication {

    public static void main(String[] args) {
        Farmer farmer1 = new Farmer();
        farmer1.setName("Fred Wagon");
        farmer1.setStrength(75);
        farmer1.setHealth(100);
        farmer1.setStamina(75);
        farmer1.setSpeed(10);
        farmer1.setAttackPower(1);
        farmer1.setRunning(false);
        farmer1.setArrested(false);
        farmer1.setPlowing(false);
        farmer1.setHarvesting(false);

        farmer1.attackAnotherCharacter();

        System.out.println(farmer1);

        Constable constable1 = new Constable();
        constable1.setName("Jon Snow");
        constable1.setStrength(60);
        constable1.setHealth(100);
        constable1.setStamina(60);
        constable1.setSpeed(20);
        constable1.setAttackPower(5);
        constable1.setRunning(false);
        constable1.setArrested(false);

        constable1.attackAnotherCharacter();
        constable1.arrestAnotherCharacter();

        System.out.println(constable1);

        Warrior warrior1 = new Warrior();
        warrior1.setName("Black Knight");
        warrior1.setStrength(75);
        warrior1.setHealth(100);
        warrior1.setStamina(100);
        warrior1.setSpeed(50);
        warrior1.setAttackPower(10);
        warrior1.setRunning(false);
        warrior1.setArrested(false);

        warrior1.attackAnotherCharacter();
        System.out.println(warrior1);

    }
}
