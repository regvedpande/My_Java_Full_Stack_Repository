package com.mkpits.math;
public class MathMethod {

	public static void main(String[] args) {

		MathMethod m = new MathMethod();
		m.getmathMethod();
	}

	private void getmathMethod() {
		
		int a = 30;
		int b = 60;
		
		//For the Maximum number amongst two numbers 
		System.out.println("Maximum of a and b is : " + Math.max(a, b));
		
		//For the Square Root of a
		System.out.println("Square Root of a is" + Math.sqrt(a));
		
		//For the Cube Root of b
		System.out.println("Cube Root of b is " + Math.cbrt(b));
		
		//For the Tan of b
		System.out.println("Tan of b is " + Math.tan(b));
		
		//For the Logarithm of a 
		System.out.println("Logarithm value of a is " + Math.log(a));
		
		//Used to find smallest integer value that is greater than or equal to Argument / Mathematical Integer
		System.out.println("Smallest Integer value is" + Math.ceil(a));
		
		//Give value of a rest to the power b
		System.out.println("Smallest Integer value is " + Math.pow(a,b));
		
		//Logarithm value of b is 
		System.out.println("Integer log value is" + Math.log(b));
	
		//Value to Radian
		System.out.println("Value to Radian is" + Math.toRadians(a));
		
		//Value to Degrees
		System.out.println("Value to Degree is" + Math.toDegrees(a));
		
		//Used to calculate power of E and subtract one from it 
		System.out.println("Power of E is" + Math.expm1(a));
		
		//Round Decimal Number to the Nearest Value
		System.out.println("Decimal Number nearest  value is" + Math.round(b));
		
		//	Difference of the two arguments
		System.out.println("Difference of two Arguments is" + Math.subtractExact(a,b));
		
		//Used to calculate power of E and subtract one from it 
		System.out.println("Power of E is" + Math.expm1(a));
		
		//Give Floor Modulus of Int Arguments
		System.out.println("Value to Radian is" + Math.floorMod(a, b));	
		
		//Increment the value of One
		System.out.println("Incremented value is" + Math.incrementExact(a));
			
		
	}
}         
