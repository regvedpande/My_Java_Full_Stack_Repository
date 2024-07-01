public class HandlingUnchecked {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds: " + e.getMessage());
        }
        
        try {
            String text = null;
            System.out.println(text.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.err.println("Null pointer exception: " + e.getMessage());
        }
    }
}
