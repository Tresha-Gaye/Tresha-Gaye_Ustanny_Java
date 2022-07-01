package com.company.pointofsale;

import java.util.Objects;

public class IceCream {

    private String flavor;
    private int weight;
    private double price;
    private int coneSize;

    public IceCream() {

    }

    public IceCream(String flavor, int weight, double price, int coneSize) {
        this.flavor = flavor;
        this.weight = weight;
        this.price = price;
        this.coneSize = coneSize;
    }

    public double getPrice() {
        return price;
    }

    public int getConeSize() {
        return coneSize;
    }

    public void setConeSize(int coneSize) {
        switch (coneSize) {
            case 1:
                System.out.println("Our customer ordered a SMALL cone!");
                break;
            case 2:
                System.out.println("Our customer ordered a MEDIUM cone!");
                break;
            case 3:
                System.out.println("Our customer ordered a LARGE cone!");
                break;
            default:
                System.out.println("Tell the customer to choose a cone size from 1 (smallest) to 3 (largest)");
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice(double price) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void calculatePrice() {
        double costPerOunce = 0.90;
        price = costPerOunce * weight;
        System.out.println("Please pay " + this.getPrice() + " dollars for " + this.getWeight() + " ounces of " + this.flavor + " ice cream!");
    }

    public void upSize() {
        weight += 3;
        coneSize++;
        System.out.println("Our customer chose a bigger cone!");
        calculatePrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCream)) return false;
        IceCream iceCream = (IceCream) o;
        return getWeight() == iceCream.getWeight() && Double.compare(iceCream.getPrice(), getPrice()) == 0 && getConeSize() == iceCream.getConeSize() && Objects.equals(getFlavor(), iceCream.getFlavor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlavor(), getWeight(), getPrice(), getConeSize());
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", coneSize=" + coneSize +
                '}';
    }
}
