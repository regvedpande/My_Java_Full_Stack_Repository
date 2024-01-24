package com.mkpits.collectionframeworks;

import java.util.ArrayList;

public class SchrodingerCat {
	String data;
	ArrayList<SchrodingerCat> subconditions;
	public boolean decayed;
	public String name;

	public SchrodingerCat(String data) {
		this.data = data;
		this.subconditions = new ArrayList<SchrodingerCat>();
	}

	public void addSubConditions(SchrodingerCat node) {
		this.subconditions.add(node);

	}

	public String print(int level) {
		String ret;
		ret = "  ".repeat(level) + data + "\n";
		for (SchrodingerCat node : this.subconditions) {
			ret += node.print(level + 1);
		}
		return ret;
	}
}
