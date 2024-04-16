package com.mkpits.staticandnonstatic;

public class StaticVariablePractice {
    
    String name;

    public StaticVariablePractice(String name){
        this.name = name;
    }

    public String StaticVariablePractice(){
        return name;
    }

    public static void main(String[] args) {
        
        StaticVariablePractice s = new StaticVariablePractice("Regved");
        String result = s.StaticVariablePractice();
        System.out.println(result);
    }

}
