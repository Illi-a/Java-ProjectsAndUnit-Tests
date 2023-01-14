package calculator;

public class Calculator {

    public int sum(int a, int b) {
        int sumResult = a + b;
        return sumResult;
    }

    public int multiply(int a, int b) {
        int multiplyResult = a * b;
        return multiplyResult;
    }

    public String divide(int a, int b) {
        try {
            int divideResult = a / b;
            return Integer.toString(divideResult);
        } catch (ArithmeticException e) {
            String divideResult = "You can't divide by zero :(.";
            return divideResult;
        }
    }

    public int substract(int a, int b) {
        int substractingResult = a - b;
        return substractingResult;
    }
}

