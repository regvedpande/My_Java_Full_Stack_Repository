package com.mkpits.abstraction;

import java.io.IOException;

public class CallingSavingAccount {

	public static void main(String[] args) throws NumberFormatException, IOException {

		SavingAccount s = new SavingAccount();
		s.accountnumber();
		s.ifsc();
		s.deposit();
		s.withdraw();
		s.remainingbalance();
	}
}
