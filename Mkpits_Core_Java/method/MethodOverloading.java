
//Method Overloading in which 
package com.mkpits.method;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading m = new MethodOverloading();
		m.getData(33);
		m.getData(55, 78);
		m.getData(9, 10);
		m.getData(2.6f,7.6f);
		m.getData(33489L,75859L);
		System.out.println(m.getData(3.8f, 9.9f));
		
	}
	

	public int getData(int a) {
		System.out.println(a);
		return a;
	}
	//dont take int int in one method go with int float it is its property
	private float getData(int i, float j) {
		// TODO Auto-generated method stub
		float o = i*j;
		System.out.println(o);
		return o;
	}
	
	private boolean getData(int f, int g) {
		
		boolean result = f > g;
		System.out.println(result);
		return result;
	}
	
	private void getData(float f, int g) {
		// TODO Auto-generated method stub
	    float add  = f+g;
	    System.out.println(add);
	}
	
	public long getData(long e, long x) {
		long add = e + x;
		System.out.println(add);
		return add;
	}
	
	private String getData(double f, float g) {
		// TODO Auto-generated method stub
		int r = (int)f;
		int t = (int)g;
		//System.out.println("Integers are :" r +" and " +t );
		//System.out.println(r+" "+t);
		String details = r+","+t;
		return details;
		
		
	}
	
	
	
	
}
	
