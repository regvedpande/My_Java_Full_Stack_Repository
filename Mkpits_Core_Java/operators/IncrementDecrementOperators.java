package com.mkpits.operators;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IncrementDecrementOperators u = new IncrementDecrementOperators();
		u.getIncrementDecrement(5);
		
	}
	
	private void getIncrementDecrement(int a) {
		// TODO Auto-generated method stub
		System.out.println("Integer is : " + ++a);//6
		System.out.println("Integer is : " + a--);//6
		System.out.println("Integer is : " + a++);//5
		System.out.println("Integer is : " + --a);//5
		System.out.println("Integer is : " + a++);//5j
		
	}

}