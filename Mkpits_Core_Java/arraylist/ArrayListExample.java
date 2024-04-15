import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(50); 

        // Iterating through the ArrayList
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
