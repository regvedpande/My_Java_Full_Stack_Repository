package com.mkpits.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetRetainAll {
    public static void main(String[] args) {
        LinkedHashSet<String> diseases = new LinkedHashSet<>();
        diseases.add("Malaria");
        diseases.add("Dengue");
        diseases.add("Ebola");

        LinkedHashSet<String> anotherdiseases = new LinkedHashSet<>();
        anotherdiseases.add("Corona");
        anotherdiseases.add("Cold");
     
        diseases.addAll(anotherdiseases);
        System.out.println("List of all Diseases: " + diseases);
    
        diseases.retainAll(anotherdiseases);
        System.out.println("List of Diseases after retaining common elements: " + diseases);

        diseases.removeAll(anotherdiseases);
        System.out.println("List of Diseases after removing remaining elements: " + diseases);
    }
}

