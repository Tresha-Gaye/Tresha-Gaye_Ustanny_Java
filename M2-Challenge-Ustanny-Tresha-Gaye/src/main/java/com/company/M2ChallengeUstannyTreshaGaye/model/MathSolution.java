package com.company.M2ChallengeUstannyTreshaGaye.model;

public class MathSolution {

    private int operand1;

    private int operand2;

    private Operation add;

    private Operation subtract;

    private Operation multiply;

    private Operation divide;

    public MathSolution(int operand1, int operand2, Operation add, Operation subtract, Operation multiply, Operation divide) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }
}
