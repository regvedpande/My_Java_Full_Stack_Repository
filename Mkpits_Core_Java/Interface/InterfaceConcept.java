package com.mkpits.Interfaces;
//It is just like class which contains abstract methods

//To achieve interface java provides a keyword called 'Implements'
//Interface methods are by default public and abstract
//Interface variables are by default public + static + final 
//Interface method must be overridden inside the implementing classes
//Interface deals between client and developer
//example :- Developer making Input and Output Interface software for client requirement but you cannot give him final code that's why use  final keyword
//In Interface we note client requirements so there is no implementation so what developer do is he make classes and add requirement 

// Simple Input Output Program

import java.io.IOException;

//Interfaces which have by default abstract method that is the reason why we can achieve 100% abstraction in Interfaces
//we can only make default and static method in interface after java 8
interface InterfaceConcept {

	void input() throws IOException;

	void output();

}