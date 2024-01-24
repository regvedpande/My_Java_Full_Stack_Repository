package com.mkpits.collectionframeworks;

public class AddingSchrodingerCatProperties {

	public static void main(String[] args) {

		SchrodingerCat box = new SchrodingerCat("Box");
		SchrodingerCat cat = new SchrodingerCat("Cat");
		SchrodingerCat radiation = new SchrodingerCat("Radiation");
		SchrodingerCat counter = new SchrodingerCat("Geiger Counter");

		box.addSubConditions(cat);
		box.addSubConditions(radiation);
		box.addSubConditions(counter);

		radiation.decayed = true;

		if (radiation.decayed) {
			SchrodingerCat poison = new SchrodingerCat("Poison");
			box.addSubConditions(poison);
			cat.name = "Cat (Dead)";
		}

		System.out.println(box.print(0));
	}

}
