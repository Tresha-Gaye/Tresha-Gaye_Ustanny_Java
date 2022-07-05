package com.company.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IceCream {

    private double productionCost;

    private int productionTime;

    private int quantity;

    public IceCream() {

    }

    public IceCream(double productionCost, int productionTime, int quantity) {
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public int speedProduction(int productionTime) {
        int rushTime= productionTime - 12;
        System.out.println("Now we have " + rushTime + " hours to complete this order!");
        return rushTime;
    }

    public double discountOrder(int quantity, double costPerOrder) {
        // cost per gallon = $10.00
        // if customer orders more than 10 gallons, discount is 80 cents per gallon
        // if customer orders more than 25 gallons, discount is $1.60 per gallon
        costPerOrder = 10.00;

        if (quantity > 10) {
            costPerOrder = 9.20;
        }
        if (quantity >= 25) {
            costPerOrder = 8.40;
        }
        double totalCost = quantity * costPerOrder;
        System.out.println("The total cost for producing "
                + quantity + " gallons at "
                + costPerOrder + " dollars per gallon is "
                + totalCost + " dollars.");
        return totalCost;
    }

    public List<String> ingredientList() {
        List<String> ingredientList = new ArrayList<>();
        ingredientList.add("sugar");
        ingredientList.add("milk");
        ingredientList.add("egg yolks");
        ingredientList.add("heavy cream");

        System.out.println("The number of items on this list are: " + ingredientList.size());
        System.out.println("This is our list of ingredients " + ingredientList);
        return ingredientList;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCream)) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.getProductionCost(), getProductionCost()) == 0 && Double.compare(iceCream.getProductionTime(), getProductionTime()) == 0 && getQuantity() == iceCream.getQuantity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductionCost(), getProductionTime(), getQuantity());
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", quantity=" + quantity +
                '}';
    }

}
