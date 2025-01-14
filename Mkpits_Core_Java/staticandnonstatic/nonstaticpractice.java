package staticandnonstatic;

public class nonstaticpractice {
    // Non-static instance variables
    private int number;
    private String text;

    // Constructor
    public nonstaticpractice(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Non-static method
    public void displayInfo() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }


    public void updateValues(int newNumber, String newText) {
        this.number = newNumber;
        this.text = newText;
    }

    public static void main(String[] args) {
        // Create objects to use non-static members
        nonstaticpractice obj1 = new nonstaticpractice(10, "Hello");
        nonstaticpractice obj2 = new nonstaticpractice(20, "World");

        // Call non-static methods
        obj1.displayInfo();
        obj2.displayInfo();

        // Update values
        obj1.updateValues(30, "Updated");
        obj1.displayInfo();
    }
}