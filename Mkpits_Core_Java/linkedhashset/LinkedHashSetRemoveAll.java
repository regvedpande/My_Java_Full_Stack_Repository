package com.mkpits.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetRemoveAll {
    
    public static void main(String[] args) {
        
        LinkedHashSet<String>insects = new LinkedHashSet<String>();
        insects.add("Cockroach");
        insects.add("Beetle");
        insects.add("Grasshopper");

        LinkedHashSet<String>anotherinsects = new LinkedHashSet<String>();
        anotherinsects.add("Dragon Fly");
        anotherinsects.add("Worm");

        insects.addAll(anotherinsects);
        System.out.println("List of all Insects" + insects);

        insects.removeAll(anotherinsects);
        System.out.println("List of all after removing some Insects" + insects);


    }
}
