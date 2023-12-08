
package com.mkpits.typeconversion;

public class PrimitiveToObjectCasting {

	public static void main(String [] args) {
		
		//PrimitiveToObjectCasting p = new PrimitiveToObjectCasting;
		//System.out.println(p);
		
		//we have two things string or integer value to print output
		int pinCode = 440024;
		Float i = new Float(pinCode);
	    System.out.println(i);
	    
	    //you only have two values string and integer you cannot use any other value than this
	    String lottery = "12.25";
	    Float i2 = new Float(lottery);
	    System.out.println(i2);
	    
	    String decision = "5>6 || 6>5";
	    Boolean b1 = new Boolean(decision);
	    System.out.println(b1);
	    
	    String moon = "White";
	    Character c1 = moon.charAt(0);
	    System.out.println(c1);
	    
	}
}