package com.company.M2ChallengeUstannyTreshaGaye.model;

import java.util.Objects;

public class Operation {

    private String add;

    private String subtract;

    private String multiply;

    private String divide;

    public Operation(String add, String subtract, String multiply, String divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public Operation() {
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getSubtract() {
        return subtract;
    }

    public void setSubtract(String subtract) {
        this.subtract = subtract;
    }

    public String getMultiply() {
        return multiply;
    }

    public void setMultiply(String multiply) {
        this.multiply = multiply;
    }

    public String getDivide() {
        return divide;
    }

    public void setDivide(String divide) {
        this.divide = divide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operation)) return false;
        Operation operation = (Operation) o;
        return Objects.equals(getAdd(), operation.getAdd()) && Objects.equals(getSubtract(), operation.getSubtract()) && Objects.equals(getMultiply(), operation.getMultiply()) && Objects.equals(getDivide(), operation.getDivide());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAdd(), getSubtract(), getMultiply(), getDivide());
    }

    @Override
    public String toString() {
        return "Operation{" +
                "add='" + add + '\'' +
                ", subtract='" + subtract + '\'' +
                ", multiply='" + multiply + '\'' +
                ", divide='" + divide + '\'' +
                '}';
    }
}
