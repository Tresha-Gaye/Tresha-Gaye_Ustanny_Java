package com.company.factory;

import java.util.Arrays;

public class IceCream {

    private String[] ingredients;
    //list array

    private double productionCost;

    private double productionTime;

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(double productionTime) {
        this.productionTime = productionTime;
    }

    public void speedProduction() {
        System.out.println("WE have a tight deadline!");
        productionTime = productionTime - 7;
    }

    public void  createNewFlavor(String[] item) {
        String[] items = {" cream", "sugar", };
    }


    @Override
    public String toString() {
        return "IceCream{" +
                "ingredients=" + Arrays.toString(ingredients) +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                '}';
    }
}
