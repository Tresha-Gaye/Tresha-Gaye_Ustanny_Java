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

    // integer tests - add, subtract, multiply divide
    // positive & negative & mixed integers

    @Test
    public void shouldAddTwoPositiveIntegers() {
        int expectedOutput = 12;
        int actualOutput = calculator.add(7, 5);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldAddTwoNegativeIntegers() {
        int expectedOutput = -10;
        int actualOutput = calculator.add(-8, -2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldSubtractTwoNegativeIntegers() {
        int expectedOutput = -1;
        int actualOutput = calculator.subtract(-3, -2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldSubtractTwoPositiveIntegers() {
        int expectedOutput = 12;
        int actualOutput = calculator.subtract(17, 5);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldSubtractPositiveAndNegativeIntegers() {
        int expectedOutput = -12;
        int actualOutput = calculator.subtract(-8, 4);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldMultiplyTwoPositiveIntegers() {
        int expectedOutput = 12;
        int actualOutput = calculator.multiply(2, 6);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldMultiplyTwoNegativeIntegers() {
        int expectedOutput = 10;
        int actualOutput = calculator.multiply(-5, -2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldMultiplyPositiveAndNegativeIntegers() {
        int expectedOutput = -18;
        int actualOutput = calculator.multiply(-9, 2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldDivideTwoPositiveIntegers() {
        int expectedOutput = 3;
        int actualOutput = calculator.divide(6, 2);
//        int actualOutput = calculator.divide(4, 2);
//        int actualOutput = calculator.divide(10, 5);
        assertEquals(expectedOutput, actualOutput);
//        assertEquals(2, 4); //find out how to test variations
    }

    @Test
    public void shouldDividePositiveAndNegativeIntegers() {
        int expectedOutput = -16;
        int actualOutput = calculator.divide(-32, 2);
        assertEquals(expectedOutput, actualOutput);
    }

    // doubles tests - add, subtract, multiply divide
    // positive & negative & mixed doubles

    @Test
    public void shouldAddTwoPositiveDoubles() {
        double delta = 1e-8; // got this suggestion for delta from https://coderanch.com/t/94967/engineering/jUnit-assert-delta
        double expectedOutput = 2.0;
        double actualOutput = calculator.divide(6.0d, 3.0d);
        assertEquals(expectedOutput, actualOutput, delta); // error message suggested adding delta to assertEquals() for doubles
    }

    @Test
    public void shouldAddTwoNegativeDoubles() {

        double delta = 1e-8;
        double expectedOutput = -10.0;
        double actualOutput = calculator.add(-8.0, -2.0);
        assertEquals(expectedOutput, actualOutput, delta);
    }

    @Test
    public void shouldSubtractTwoNegativeDoubles() {
        double delta = 1e-8;
        double expectedOutput = -1;
        double actualOutput = calculator.subtract(-3, -2);
        assertEquals(expectedOutput, actualOutput, delta);
    }

    @Test
    public void shouldSubtractTwoPositiveDoubles() {
        double delta = 1e-8;
        double expectedOutput = 1.1;
        double actualOutput = calculator.subtract(2.6, 1.5);
        assertEquals(expectedOutput, actualOutput, delta);
    }

    @Test
    public void shouldSubtractPositiveAndNegativeDoubles() {
        double delta = 1e-8;
        double expectedOutput = -13.6;
        double actualOutput = calculator.subtract(-9.5, 4.1);
        assertEquals(expectedOutput, actualOutput, delta);
    }

    @Test
    public void shouldMultiplyTwoPositiveDoubles() {
        double delta = 1e-8;
        double expectedOutput = 13.64;
        double actualOutput = calculator.multiply(2.2, 6.2);
        assertEquals(expectedOutput, actualOutput, delta);
    }

    @Test
    public void shouldMultiplyTwoNegativeDoubles() {
        double delta = 1e-8;
        double expectedOutput = 11.0;
        double actualOutput = calculator.multiply(-5.5, -2.0);
        assertEquals(expectedOutput, actualOutput, delta);
    }

    @Test
    public void shouldMultiplyPositiveAndNegativeDoubles() {
        double delta = 1e-8;
        double expectedOutput = -6.25;
        double actualOutput = calculator.multiply(-2.5, 2.5);
        assertEquals(expectedOutput, actualOutput, delta);
    }

    @Test
    public void shouldDivideTwoPositiveDoubles() {
        double delta = 1e-8;
        double expectedOutput = 3.1;
        double actualOutput = calculator.divide(6.2, 2.0);
        assertEquals(expectedOutput, actualOutput, delta);
    }

    @Test
    public void shouldDividePositiveAndNegativeDoubles() {
        double delta = 1e-8;
        double expectedOutput = -4.1;
        double actualOutput = calculator.divide(-32.8, 8.0);
        assertEquals(expectedOutput, actualOutput, delta);
    }

}