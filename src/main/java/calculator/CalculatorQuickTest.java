package calculator;

public class CalculatorQuickTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum result: " + calculator.sum(5, 15) + ".");
        System.out.println("Multiply result: " + calculator.multiply(3, 15) + ".");
        System.out.println("Divide result: " + calculator.divide(15, 0) + ".");
        System.out.println("Substract result: " + calculator.substract(15, 3) + ".");
    }
}
