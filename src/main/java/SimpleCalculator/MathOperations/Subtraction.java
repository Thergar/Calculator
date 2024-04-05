package SimpleCalculator.MathOperations;

import SimpleCalculator.Interfaces.GetOperationName;

public class Subtraction implements GetOperationName {

    public Subtraction() {
    }

    @Override
    public String getOperationName() {

        return "-";
    }

    @Override
    public double performOperation(double currentValue, double nextOperand) {

        return currentValue - nextOperand;
    }
}
