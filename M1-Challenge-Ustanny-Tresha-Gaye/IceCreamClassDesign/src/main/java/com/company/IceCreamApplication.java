package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class IceCreamApplication {

    public static void main(String[] args) {

        com.company.factory.IceCream customerOrder1 = new com.company.factory.IceCream();

        System.out.println("<======== Making magic in an ICE CREAM FACTORY =======>");
        System.out.println();

        customerOrder1.ingredientList();


        customerOrder1.setQuantity(50);
        customerOrder1.setProductionTime(24);

        System.out.println("We have " + customerOrder1.getProductionTime() + " hours to produce this order for " + customerOrder1.getQuantity() + " gallons of ice cream!");

        System.out.println();
        System.out.println("<======== These are the factory methods =======>");
        customerOrder1.speedProduction(24);
        customerOrder1.discountOrder(20, 9.20);

        System.out.println();
        System.out.println("<======== Serving magic in an ICE CREAM SHOP! =======>");
        System.out.println();

        com.company.pointofsale.IceCream sweetTooth =
                new com.company.pointofsale.IceCream();

        sweetTooth.setFlavor("strawberry-banana");
        sweetTooth.setConeSize(1);
        sweetTooth.setWeight(3);
//        sweetTooth.calculatePrice();;
        sweetTooth.upSize(3);

        System.out.println();


    }


}
