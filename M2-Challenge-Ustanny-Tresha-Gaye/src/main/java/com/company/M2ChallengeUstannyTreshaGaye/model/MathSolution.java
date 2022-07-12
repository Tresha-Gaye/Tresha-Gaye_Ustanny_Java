package com.company.M2ChallengeUstannyTreshaGaye.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class MathSolution {

    @NotNull(message="a number value is required")
    @Digits(integer = 9, fraction = 0)
    private int operand1;
    @NotNull(message="a number value is required")
    @Digits(integer = 9, fraction = 0)
    private int operand2;

    private String operation;

    private int answer;

    // constructor

    public MathSolution(int operand1, int operand2, String operation, int answer) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.answer = answer;
    }

    public MathSolution(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public MathSolution() {

    }


    // operation methods


    public int add() {
        if(operation.equals("add")){
            answer = operand1 + operand2;
        };
        return answer;
    }

    public int subtract(){
        if(operation.equals("subtract")){
            answer = operand1 - operand2;
        };
        return answer;
    }

    public int multiply(){
        if(operation.equals("multiply")){
            answer = operand1 * operand2;
        };
        return answer;
    }

    public int divide() throws Exception {
        if(operation.equals("divide") && operand2 != 0){
            answer = operand1 / operand2;
        } else {
            throw new Exception("ArithmeticException");
        };
        return answer;
    }


    // setters & getters
    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathSolution that = (MathSolution) o;
        return operand1 == that.operand1 && operand2 == that.operand2 && answer == that.answer && Objects.equals(operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation, answer);
    }

    @Override
    public String toString() {
        return "MathSolution{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", operation='" + operation + '\'' +
                ", answer=" + answer +
                '}';
    }

}
