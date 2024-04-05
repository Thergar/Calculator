package SimpleCalculator.UserOperations;

import SimpleCalculator.MathOperations.OperationsMap;

public class OperationValidator {
    final OperationsMap name;

    public OperationValidator(UserInputs input) {
        name = new OperationsMap(input);
    }

    public boolean operationValidation(String operation) {
        return name.operationNameMap.containsKey(operation);
    }
}
