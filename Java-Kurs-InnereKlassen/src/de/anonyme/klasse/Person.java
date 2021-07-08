package de.anonyme.klasse;

public class Person {

	// Eigenschaften
	private String name;
	
	// Konstruktor
	public Person(String _name) {
		name = _name;
		printName();
	}
	
	// Methoden
	public void printName() {
		System.out.println(name);
	}

	public String getName() {
		return name;
	}
}
