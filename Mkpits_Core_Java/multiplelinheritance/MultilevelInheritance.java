package com.mkpits.multipleinheritance;

import java.io.IOException;

public class MultilevelInheritance {

	public static void main(String[] args) throws NumberFormatException, IOException {

		CheeseOption p = new CheeseOption();
		p.measurements();
		p.toppingsmenu();
		p.cheeseoption();
		p.result();
	}
}