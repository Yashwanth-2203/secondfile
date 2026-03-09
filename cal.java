public class Calculator {
    public static void main(String[] args) {
        // Inbuilt numbers
        double num1 = 12;
        double num2 = 4;

        // Inbuilt operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN;

        // Print results
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
