package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorObjectTest {

    private CalculatorObject calculator;

    @Before
    public void setUp () {
        calculator = new CalculatorObject();
    }

    @Test
    public void shouldAddTwoIntegersAndReturnSum() {
        int expectedOutput = 12;
        int actualOutput = calculator.add(7, 5);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = -10;
        actualOutput = calculator.add(-8, -2);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = -1;
        actualOutput = calculator.add(-3, 2);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = 1;
        actualOutput = calculator.add(3, -2);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = 12;
        actualOutput = calculator.add(0, 12);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void shouldSubtractTwoIntegersAndReturnDifference() {
        int expectedOutput = -1;
        int actualOutput = calculator.subtract(-3, -2);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = 12;
        actualOutput = calculator.subtract(17, 5);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = -12;
        actualOutput = calculator.subtract(-8, 4);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = 4;
        actualOutput = calculator.subtract(4, 0);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = -7;
        actualOutput = calculator.subtract(0, 7);
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void shouldMultiplyTwoIntegersAndReturnProduct() {
        int expectedOutput = 12;
        int actualOutput = calculator.multiply(2, 6);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = 10;
        actualOutput = calculator.multiply(-5, -2);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = -18;
        actualOutput = calculator.multiply(-9, 2);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = 0;
        actualOutput = calculator.multiply(12, 0);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = -1;
        actualOutput = calculator.multiply(1, -1);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void shouldDivideTwoIntegersAndReturnQuotient() {
        int expectedOutput = 3;
        int actualOutput = calculator.divide(6, 2);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = -16;
        actualOutput = calculator.divide(-32, 2);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = -2;
        actualOutput = calculator.divide(32, -16);
        assertEquals(expectedOutput, actualOutput);

        expectedOutput = 0;
        actualOutput = calculator.divide(0, 19);
        assertEquals(expectedOutput, actualOutput);
    }



//    @Test
//    public void shouldThrowErrorIfDividendIsZero() {
//
//        String failMessage = "Expected calculator to handle long division.";
//        assertEquals(failMessage, 0, calculator.divide((int) 2, (int) 0));
//
//            int expectedOutput = 0;
//            int actualOutput = String.valueOf(calculator.divide(32, 0));
//            assertEquals(expectedOutput, actualOutput);
//
//            expectedOutput = "Error: you cannot divide an integer by zero";
//            actualOutput = String.valueOf(calculator.divide(0, 19));
//            assertEquals(expectedOutput, actualOutput);

//    }

    // doubles tests - add, subtract, multiply divide
    // positive & negative & mixed doubles

    @Test
    public void shouldAddTwoDoublesAndReturnSum() {
        double delta = 1e-4; // 0.0001 - got this suggestion for delta from https://coderanch.com/t/94967/engineering/jUnit-assert-delta
        double expectedOutput = 2.0;
        double actualOutput = calculator.divide(6.0d, 3.0d);
        assertEquals(expectedOutput, actualOutput, delta); // error message suggested adding delta to assertEquals() for doubles

        expectedOutput = -10.0;
        actualOutput = calculator.add(-8.0, -2.0);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = 8.0;
        actualOutput = calculator.add(8.0, 0);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = 0.3;
        actualOutput = calculator.add(0, 0.3);
        assertEquals(expectedOutput, actualOutput, delta);

    }



    @Test
    public void shouldSubtractTwoDoublesAndReturnDifference() {
        double delta = 1e-4;
        double expectedOutput = -1;
        double actualOutput = calculator.subtract(-3, -2);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = 1.1;
        actualOutput = calculator.subtract(2.6, 1.5);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = -13.6;
        actualOutput = calculator.subtract(-9.5, 4.1);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = 11.5;
        actualOutput = calculator.subtract(11.5, 0);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = -12.7;
        actualOutput = calculator.subtract(0, 12.7);
        assertEquals(expectedOutput, actualOutput, delta);
    }


    @Test
    public void shouldMultiplyTwoDoublesAndReturnProduct() {
        double delta = 1e-4;
        double expectedOutput = 13.64;
        double actualOutput = calculator.multiply(2.2, 6.2);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = 11.0;
        actualOutput = calculator.multiply(-5.5, -2.0);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = -6.25;
        actualOutput = calculator.multiply(-2.5, 2.5);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = 0;
        actualOutput = calculator.multiply(0, 3.9);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = 0;
        actualOutput = calculator.multiply(1.9, 0);
        assertEquals(expectedOutput, actualOutput, delta);
    }


    @Test
    public void shouldDivideTwoDoublesAndReturnQuotient() {
        double delta = 1e-4;
        double expectedOutput = 3.1;
        double actualOutput = calculator.divide(6.2, 2.0);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = -4.1;
        actualOutput = calculator.divide(-32.8, 8.0);
        assertEquals(expectedOutput, actualOutput, delta);

        expectedOutput = 0;
        actualOutput = calculator.divide(0, 3.2);
        assertEquals(expectedOutput, actualOutput, delta);
    }


}