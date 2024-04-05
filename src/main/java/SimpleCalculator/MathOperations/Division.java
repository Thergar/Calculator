package SimpleCalculator.MathOperations;

import SimpleCalculator.Interfaces.GetOperationName;
import SimpleCalculator.UserOperations.UserInputs;

public class Division implements GetOperationName {

    final UserInputs input;

    public Division(UserInputs input) {
        this.input = input;
    }

    @Override
    public String GetOperationName() {

        return "/";
    }

    @Override
    public double performOperation(double currentValue, double nextOperand) {
        do {
            if (nextOperand == 0) {
                System.out.println("Cannot divide by zero, provide non-zero value");
                nextOperand = input.getNumber();
            }
        } while (nextOperand == 0);

        return currentValue / nextOperand;
    }
}

