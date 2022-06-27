package com.company;

public class CalcApp {

    public static void main(String[] args) {

        CalculatorObject result = new CalculatorObject();

        result.add(1, 1);

        result.subtract(23, 52);

        result.multiply(34, 2);

        result.divide(12, 3);

        result.divide(12, 7);

        result.add(3.4, 2.3);

        result.subtract(5.5, 0.5);

        result.multiply(6.7, 4.4);

        result.divide(10.8, 2.2);
    }
}
