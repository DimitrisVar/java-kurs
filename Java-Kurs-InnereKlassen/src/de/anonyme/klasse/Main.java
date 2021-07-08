package de.anonyme.klasse;

public class Main {

	public static void main(String[] args) {
		
		// Bisher
		Person p1 = new Person("Ralf");
		
		// Anonyme Klasse (Einweg-Klasse) Syntax: new KlasseOderSchnittstelle() { ... }
		// Sind Klassen von denen immer ein Objekt gebildet wird
		// und leihen den Namen einer Klasse/Inferfaces

		new Person("Olfa") {
			
			@Override
			public void printName() {
				System.out.println("Der Name: " +this.getName());
			}
		};
		
		Hund hund1 = new Hund();
		hund1.machLaute();
		
		Katze katze1 = new Katze();
		katze1.machLaute();
		
		Tier elefant = new Tier() {
			
			@Override
			public String machLaute() {
				
				return "turu";
			}
		};
		
		Tier schwein = new Tier() {
			
			@Override
			public String machLaute() {
				return "oink oink";
			}
		};
	}

}
