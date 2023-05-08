package calculator;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Result of adding: " + calculator.add(2, 3));
        System.out.println("Result of divideModulo method call is: " + calculator.divideModulo(5, 3));
    }
}