package utils;

public class SimpleOperations {

    private static double getValueOfEspecifyOperation(String operation, double... numbers) {
        switch (operation) {
            case "+":
                return execOperation(operation, numbers);
            case "-":
                return execOperation(operation, numbers);
            case "*":
                return execOperation(operation, numbers);
            case "/":
                return execOperation(operation, numbers);
            default:
                break;
        }

        return 0.0;
    }

    private static double execOperation(String operation, double... numbers) {
        double result = 0;
        for (double number : numbers) {
            switch (operation) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    result /= number;
                    break;
            }
        }

        return result;
    }

    public static double sum(double... numbers) {
        return getValueOfEspecifyOperation("+", numbers);
    }

    public static double subtract(double... numbers) {
        return getValueOfEspecifyOperation("-", numbers);

    }

    public static double multiply(double... numbers) {
        return getValueOfEspecifyOperation("*", numbers);

    }

    public static double division(double... numbers) {
        return getValueOfEspecifyOperation("/", numbers);
    }
}
