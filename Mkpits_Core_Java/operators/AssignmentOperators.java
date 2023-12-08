package com.mkpits.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AssignmentOperators o = new AssignmentOperators();
		o.assignmentPreIncrement();
		o.assignmentPostIncrement();
	}
	
		private void assignmentPreIncrement() {
			String name = "Steve Jobs";
			System.out.println("Name is :" +name);
		}
		
		private void assignmentPostIncrement() {
			int num = 50;
			System.out.println("Number is :" +num);
		}
		
}