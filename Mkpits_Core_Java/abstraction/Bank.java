package com.mkpits.abstraction;

import java.io.IOException;

public abstract class Bank {

	public abstract void accountnumber() throws NumberFormatException, IOException;

	public abstract void ifsc() throws NumberFormatException, IOException;

	public abstract void deposit() throws NumberFormatException, IOException;

	public abstract void withdraw() throws NumberFormatException, IOException;

	public abstract void remainingbalance() throws NumberFormatException, IOException;
}
