
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching and handling specific exception
            System.out.println("Exception caught: Division by zero");
        } finally {
            // Code that always executes, whether exception occurs or not
            System.out.println("Program completed.");
        }
    }

    // Method that throws an exception
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
