package SimpleCalculator.MathOperations;

import SimpleCalculator.Interfaces.GetOperationName;

public class Multiply implements GetOperationName {

    public Multiply() {
    }

    @Override
    public String getOperationName() {

        return "*";
    }

    @Override
    public double performOperation(double currentValue, double nextOperand) {

        return currentValue * nextOperand;
    }
}
