package com.mkpits.operators;

class Calculator
{
    public int add(int n1, int n2)
    {
        int r = n1+n2;
        r=r+12;

        return r;
    }
}

public class demo
{
    public static void main(String a[])
    {
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);

    }
}