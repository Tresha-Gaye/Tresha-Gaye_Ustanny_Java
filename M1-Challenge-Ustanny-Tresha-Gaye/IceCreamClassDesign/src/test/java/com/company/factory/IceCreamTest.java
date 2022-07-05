package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IceCreamTest {

    private IceCream factory;

    @Before
    public void setUp() {
        factory = new IceCream();
    }

    @Test
    public void shouldDeductTwelveHoursFromProductionTimeIfOrderRushed() {
        int expectedOutput = 10;
        int actualOutput = factory.speedProduction(22);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldCalculateTheCostForAnOrderLessThanTenGallons() {
        double expectedOutput = 90.00;
        double actualOutput = factory.discountOrder(9, 10.00);
        assertEquals(expectedOutput, actualOutput, 0.0001);
    }

    @Test
    public void shouldCalculateTheCostForAnOrderBetweenTenAndTwentyFiveGallons() {
        double expectedOutput = 110.40;
        double actualOutput = factory.discountOrder(12, 9.2);
        assertEquals(expectedOutput, actualOutput, 0.0001);
    }

    @Test
    public void shouldCalculateTheCostForAnOrderForTwentyFiveOrMoreGallons() {
        double expectedOutput = 252.00;
        double actualOutput = factory.discountOrder(30, 8.4);
        assertEquals(expectedOutput, actualOutput, 0.0001);
    }

    @Test
    public void shouldReturnAListOfIngredientsInArrayList() {
        List<String> expectedOutput = Arrays.asList("sugar", "milk", "egg yolks", "heavy cream");
        List<String> actualOutput = factory.ingredientList();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnOneIngredientElementFromArrayList() {
        List<String> newList = Arrays.asList("sugar", "milk", "egg yolks", "heavy cream");

        String expectedOutput = "milk";
        String actualOutput = factory.ingredientList().get(1);
        assertEquals(expectedOutput, actualOutput);
    }

}
