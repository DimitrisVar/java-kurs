
public class Computer {
	
	// Attribute
	String cpu;
	Mainboard mainboard;
	
	int preis;
	
	// Konstruktor
	
	public Computer() {
		
	}
	
	public Computer(String cpu, Mainboard mainboard, int preis) {
		this.cpu = cpu;
		this.mainboard = mainboard;
		this.preis = preis;
	}
	
	public Computer(int ramSlots, int kartenSlots, int usbPorts, String cpu) {
		mainboard = new Mainboard(ramSlots, kartenSlots, usbPorts);
		this.cpu = cpu;
	}
	
	// Methoden
	
}
