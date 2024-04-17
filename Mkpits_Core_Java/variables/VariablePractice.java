package com.mkpits.variables;

public class VariablePractice {
    
    int a = 5;
    static int b = 9;

    void add(){

        int c;
        int d = 3;

        c = a + b + d;
        System.out.println(c);
    
    }

    static void mul(){
        int z = 1;
        int multiply = z+b;
        System.out.println(multiply);
    }

    public static void main(String[] args) {
    VariablePractice v = new VariablePractice();
    v.add();
    mul();

    }
    
}
