
public class Laptop {

	// Attribute
	String marke;
	String cpu;
	
	int ram;
	double preis;
	
	// Konstruktoren
	public Laptop(String marke, String cpu, int ram, double preis) {
		this.marke = marke;
		this.cpu = cpu;
		this.ram = ram;
		this.preis = preis;
	}
	
	// Methoden 
	public void starten() {
		System.out.println("Laptop startet");
	}

}
