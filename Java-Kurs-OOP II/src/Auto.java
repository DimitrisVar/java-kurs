
public class Auto {
	
	// Eigenschaften / Attribute
	String marke;
	int ps;
	int tuerenAnzahl;
	String fahrzeugTyp;
	
	// Konstruktoren
	public Auto(String marke, int ps, int tuerenAnzahl, String fahrzeugTyp) {
		super();
		this.marke = marke;
		this.ps = ps;
		this.tuerenAnzahl = tuerenAnzahl;
		this.fahrzeugTyp = fahrzeugTyp;
	}
	
	// Methoden
	public void starten() {
		System.out.println("Das Auto startet");
	}
	
}
