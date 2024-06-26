package main.java.Operation;

import main.java.Exception.InvalidCalculationException;

public class DivideOperation implements IOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        if (secondNum == 0) throw new IllegalArgumentException("계산불가");
        return firstNum / secondNum;
    }
}