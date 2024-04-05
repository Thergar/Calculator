package SimpleCalculator.MathOperations;

import SimpleCalculator.Interfaces.GetOperationName;
import SimpleCalculator.UserOperations.UserInputs;

import java.util.HashMap;
import java.util.Map;

public class OperationsMap {

    public Map<String, GetOperationName> operationNameMap;

    public OperationsMap(UserInputs input) {
        operationNameMap = new HashMap<>();
        autoRegisterOperation(new GetOperationName[]{new Addition(), new Subtraction(), new Multiply(), new Division(input)});
    }

    private void addOperationToMap(GetOperationName operationName) {
        operationNameMap.put(operationName.GetOperationName(), operationName);
    }

    private void autoRegisterOperation(GetOperationName[] operations) {
        for (GetOperationName operation : operations) {
            addOperationToMap(operation);
        }
    }
}
