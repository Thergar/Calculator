package SimpleCalculator.UserOperations;

import SimpleCalculator.MathOperations.OperationsMap;

public class OperationValidator {
    private OperationsMap name;

    public OperationValidator(UserInputs input) {
        name = new OperationsMap(input);
    }

    public boolean operationValidation(String operation) {
        if (!name.operationNameMap.containsKey(operation)) {
            return false;
        }
        return true;
    }
}
