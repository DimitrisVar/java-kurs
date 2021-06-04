
public class Laptop {
	
	// Attribute / Eigenschaften
	int ram;
	double preis;
	
	String marke;
	
	// Konstruktor
	public Laptop(int ram, double preis, String marke) {
		this.ram = ram;
		this.preis = preis;
		this.marke = marke;
	}
	
	// Methode
	public void getData() {
		System.out.println("-----------------------------");
		System.out.println("Marke: " +this.marke +"\n" +"RAM: " +this.ram +" GB" +"\n" +"Preis: " +this.preis + " Euro");
	}
}
