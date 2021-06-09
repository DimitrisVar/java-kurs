
public abstract class Tier {
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
	public abstract void essen();
	public abstract void atmen();
	
	public String getName() {
		return name;
	}
}
