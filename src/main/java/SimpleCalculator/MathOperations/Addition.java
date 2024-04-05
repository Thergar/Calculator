package SimpleCalculator.MathOperations;

import SimpleCalculator.Interfaces.GetOperationName;

public class Addition implements GetOperationName {

    public Addition() {
    }

    @Override
    public String getOperationName() {

        return "+";
    }

    @Override
    public double performOperation(double currentValue, double nextOperand) {

        return currentValue + nextOperand;
    }
}
