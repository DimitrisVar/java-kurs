
/*
 * Depedancy Injection (Abhaengiges Injektion)
 * constructor injection zu Deutsch:
 * Konstruktor Injection: Abhaengikeiten werden durch ein Konstruktor der Klasse zur Verfuegung gestellt.
 * 
 * d.h. ich erstelle nicht mehr selbst den Teig oder die Glasur sondern gebe diese von aussen dazu
 * 
 */

public class Kuchen {
	
	private Teig teig;
	private Glasur glasur;
	
	public Kuchen() {
		this.teig = new Teig();
		this.glasur = new Glasur();
	}
	
	// constructor injection
	public Kuchen(Teig teig, Glasur glasur) {
		this.teig = teig;
		this.glasur = glasur;
	}
	
	// Setter injection
	// Es gibt noch eine weitere injection, die nennt sich Setter injection
	// Gleiches Prinzip wie der Konstruktor nur mit einem setter sprich einer Methode
	
	public void setKuchen(Teig teig, Glasur glasur) {
		this.teig = teig;
		this.glasur = glasur;
	}
}
