package com.mkpits.abstraction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SavingAccount extends Bank {

	static int depositedamount, remainingbalance, withdrawedamount;
	static long accountnumber;

	@Override
	public void accountnumber() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Enter your account number:");
			accountnumber = Long.parseLong(br.readLine());
			if (accountnumber == 9049874883l) {
				System.out.println("Access! ");
				break;
			} else {
				System.out.println("Access Denied !");
				continue;
			}
		}


	@Override
	public void ifsc() throws NumberFormatException, IOException {
		double ifsc = Math.floor(Math.random() * 10000000);
		int code = (int) ifsc;
		System.out.println("Your IFSC Code is " + code);

	}

	@Override
	public void deposit() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Amount to be Deposited:");
		depositedamount = Integer.parseInt(br.readLine());
		System.out.println("Deposited Amount is " + depositedamount);
	}

	@Override
	public void withdraw() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Amount to be Withdrawed:");
		withdrawedamount = Integer.parseInt(br.readLine());
		System.out.println("Withdrawed Amount is " + withdrawedamount);

	}

	public void remainingbalance() throws NumberFormatException, IOException {

		remainingbalance = depositedamount - withdrawedamount;
		System.out.println("Remaining balance is:" + remainingbalance);

	}
}
