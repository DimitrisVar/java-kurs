
public class Macbook extends Laptop {
	
	// Attribute
	boolean touchBar;
	
	// Konstruktoren
	public Macbook (String cpu, int ram, double preis, boolean touchBar) {
		super("Apple", cpu, ram, preis);
		this.touchBar = touchBar;
		
	}
	
	// Methoden
	@Override
	public void starten() {
		super.starten();
		System.out.println("Macbook startet");
	}
	
	public void getData() {
		System.out.println("Marke: " +this.marke +"\n" +"Prozessor: " +this.cpu + "\n" +"RAM: " +this.ram +" GB" +"\n" +"Preis: " +this.preis + " Euro");
		System.out.println("-----------------------");
	}
}
