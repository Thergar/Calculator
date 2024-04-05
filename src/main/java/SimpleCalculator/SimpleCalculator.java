package SimpleCalculator;

import SimpleCalculator.Interfaces.GetOperationName;
import SimpleCalculator.MathOperations.OperationsMap;
import SimpleCalculator.UserOperations.UserInputs;

public class SimpleCalculator {
    final UserInputs input;
    final OperationsMap operationsMap;
    double currentValue;

    public SimpleCalculator() {
        input = new UserInputs();
        operationsMap = new OperationsMap(input);
    }

    public void createCalculator() {
        currentValue = input.getNumber();

        while (true) {
            String operation = input.getOperation();

            if (operation.equals("=")) {
                System.out.println("Result: " + currentValue);
                break;
            }

            double nextOperand = input.getNumber();

            if (operationsMap.operationNameMap.containsKey(operation)) {
                GetOperationName operationName = operationsMap.operationNameMap.get(operation);
                currentValue = operationName.performOperation(currentValue, nextOperand);
                System.out.println("Current value: " + currentValue);
            } else {
                System.out.println("Invalid operation.");
            }
        }
    }
}
