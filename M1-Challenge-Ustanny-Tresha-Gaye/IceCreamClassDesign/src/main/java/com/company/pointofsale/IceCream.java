package com.company.pointofsale;

public class IceCream {

    private String flavor;
    private int weight;
    private double price;
    private int cupSize;

    public int getCupSize() {
        return cupSize;
    }

    public void setCupSize(int cupSize) {
        this.cupSize = cupSize;
    }
//    private static int numberOfToppings = 1;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private IceCream(String flavor, int weight, double price) {
        this.flavor = flavor;
        this.weight = weight;
        this.price = price;
//        numberOfToppings++;
    }

    public void yummy() {
        if (weight > 6 && cupSize == 3) {
            System.out.println("YUUUUMMMMYYYYYYYY!!!!");
        } else if(weight <= 5) {
            System.out.println("That looks good!");
        } else {
            System.out.println("Would you like some ice cream?");
        }
    }

    public void upSize() {
        System.out.println("Would you like another scoop?");
        weight += 3;
        cupSize++;
    }


    public void chooseSize(int cupSize) {
        switch (cupSize) {
            case 3:
                System.out.println("You chose a LARGE!");
                break;
            case 2:
                System.out.println("You chose a MEDIUM!");
                break;
            case 1:
                System.out.println("You chose a SMALL!");
                break;
            default:
                System.out.println("Your must choose a cup size from 1 (smallest) to 3 (largest)");
        }
    }

    public String describe() {
        return "Please pay " + this.price + " for " + this.weight + " ounces " + " of " + this.flavor + " ice cream!";
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", cupSize=" + cupSize +
                '}';
    }
}
