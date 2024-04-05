package SimpleCalculator.UserOperations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputs {
    public Scanner scan;
    private OperationValidator valid;

    public UserInputs() {
        scan = new Scanner(System.in);
        valid = new OperationValidator(this);
    }

    public double getNumber() {
        System.out.println("Please enter number value:");

        while (true) {
            try {
                double number = scan.nextDouble();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value. Please enter a valid number:");
                scan.next();
            }
        }
    }

    public String getOperation() {

        System.out.println("Please provide operation:");

        while (true) {
            try {
                String operation = scan.next().trim();
                if (!valid.operationValidation(operation)) {
                    throw new IllegalArgumentException();
                }
                return operation;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid operation.");
            }
        }
    }
}
