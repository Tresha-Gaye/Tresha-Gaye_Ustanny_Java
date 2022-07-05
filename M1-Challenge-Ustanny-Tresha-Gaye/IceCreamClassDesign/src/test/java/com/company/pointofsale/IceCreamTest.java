package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class IceCreamTest {


    private com.company.pointofsale.IceCream shop;

    @Before
    public void setUp() {
        shop = new IceCream();
    }

    @Test
    public void shouldCalculatePriceOfIceCreamBasedOnWeight() {
        double expectedOutput = 1.5;
        double actualOutput = shop.calculatePrice(0.5, 3);

        expectedOutput = 4.5;
        actualOutput = shop.calculatePrice(0.5, 9);

        assertEquals(expectedOutput, actualOutput, 0.0001);
    }

    @Test
    public void shouldIncreaseWeightIfCustomerAsksForMore() {
        int expectedOutput = 4;
        int actualOutput = shop.upSize(1);
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void shouldReturnSmallOrMediumOrLargeConeSize() {
        String expectedOutput = "LARGE";
        String actualOutput = shop.setConeSize(3);
        assertEquals(expectedOutput, actualOutput);
    }
//
//    @Test
//    public void shouldCalculateTheCostForAnOrderForTwentyFiveOrMoreGallons() {
//        double expectedOutput = 252.00;
//        double actualOutput = factory.discountOrder(30, 8.4);
//        assertEquals(expectedOutput, actualOutput, 0.0001);
//    }
//
//    @Test
//    public void shouldReturnAListOfIngredientsInArrayList() {
//        List<String> expectedOutput = Arrays.asList("sugar", "milk", "egg yolks", "heavy cream");
//        List<String> actualOutput = factory.ingredientList();
//        assertEquals(expectedOutput, actualOutput);
//    }
//
//    @Test
//    public void shouldReturnOneIngredientElementFromArrayList() {
//        List<String> newList = Arrays.asList("sugar", "milk", "egg yolks", "heavy cream");
//
//        String expectedOutput = "milk";
//        String actualOutput = factory.ingredientList().get(1);
//        assertEquals(expectedOutput, actualOutput);
//    }


}