package com.mkpits.operators;

public class LogicalOperators {

	public static void main(String[] args)  {
			LogicalOperators l = new LogicalOperators();
			l.logicalAnd();
			l.logicalOr();
			
		}

		private void logicalAnd(){
			int num1 = 5;
			int num2 = 6;
			boolean result = num1 > 10 && num2 < 10;
			System.out.println("Integer is :" +result);
		}
		
		private void logicalOr(){
			int num1 = 5;
			int num2 = 6;
			boolean result = num1 > 10 || num2 < 10;
			System.out.println("Integer is :" +result);
		}


}