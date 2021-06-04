
public class Tier {
	// Eigenschaften
	String name;
	int groesse;
	int gewicht;
	
	// Konstruktoren
	public Tier(String name, int groesse, int gewicht) {
		this.name = name;
		this.groesse = groesse;
		this.gewicht = gewicht;
	}
	
	// Methoden
	public void essen() {
		System.out.println("Das Tier hat gegessen");
		
	}
}
