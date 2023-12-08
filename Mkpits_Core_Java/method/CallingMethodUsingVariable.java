package com.mkpits.method;

public class CallingMethodUsingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String uname="rigvedpande";
		String pass="12345678";
		String num = "9049874883";
		String bool = "True";
		MethodWithArguementAndNoReturnType vb= new MethodWithArguementAndNoReturnType();
		vb.getUser(uname);
		vb.getPassword(pass);
		vb.getNumber(num);
		vb.getBoolean(bool);;
		
	}
	
	public void getUser(String uname) {
		System.out.println("User Name is :-" + uname);
	}

	public void getPassword(String pass) {
		System.out.println("Password :- " + pass);
	}
    public void getNumber(String num) {
			System.out.println("User Name is :-" + num);
		}

	public void getBoolean(String bool) {
			System.out.println("Password :- " + bool);

}
}
