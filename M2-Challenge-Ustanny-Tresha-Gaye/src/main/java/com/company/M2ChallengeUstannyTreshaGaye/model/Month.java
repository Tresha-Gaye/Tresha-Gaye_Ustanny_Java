package com.company.M2ChallengeUstannyTreshaGaye.model;

import java.util.Objects;

public class Month {

    private int number;

    private String name;

    public Month(String name, int number) {
        this.number = number;
        this.name = name;
    }

    public Month() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Month)) return false;
        Month month = (Month) o;
        return getNumber() == month.getNumber() && Objects.equals(getName(), month.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }

    @Override
    public String toString() {
        return "Month{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
