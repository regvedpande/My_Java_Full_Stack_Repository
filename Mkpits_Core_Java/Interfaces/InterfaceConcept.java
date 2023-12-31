//It is just like class which contains abstract methods
//To achieve interface java provides a keyword called 'Implements'
//Interface methods are by default public and abstract
//Interface variuables are by default public + static + final 
//Interface method must be overriden inside the implementing classes
//Interface deals between client and developer
//example :- Developer making Input and Output Interface software for client requirement but you cannot give him final code that's why use satic final keyword
//In Interface we note client requirements so there is no implementation so what developer do is he make classes and add requirement 

// Simple Input Output Program

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

interface Client {
    void input() throws IOException;
    void output();
}

class Regved implements Client {
    String name;
    double salary;

    @Override
    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Username: ");
        name = br.readLine();

        System.out.println("Enter Salary: ");
        salary = Double.parseDouble(br.readLine());
    }

    @Override
    public void output() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) throws IOException {
        Client c = new Regved();
        c.input();
        c.output();
    }
}
