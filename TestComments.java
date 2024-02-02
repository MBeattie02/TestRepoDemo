public class BasicCalculator {

    // Method for addition
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    // Method for subtraction
    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    // Method for multiplication
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    // Method for division
    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        // Example calculations
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
    }
}
