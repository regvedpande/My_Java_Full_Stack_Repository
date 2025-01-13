package staticandnonstatic;

public class staticpractice {
    // Static variable shared by all instances
    static int counter = 0;
    
    // Non-static instance variable
    String name;
    
    public staticpractice(String name) {
        this.name = name;
        counter++; // Increment counter for each instance created
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Total instances created: " + counter);
    }
    
    public static void main(String[] args) {
        // Creating multiple instances
        staticpractice obj1 = new staticpractice("Object 1");
        obj1.displayInfo();
        
        staticpractice obj2 = new staticpractice("Object 2");
        obj2.displayInfo();
        
        staticpractice obj3 = new staticpractice("Object 3");
        obj3.displayInfo();
    }
}