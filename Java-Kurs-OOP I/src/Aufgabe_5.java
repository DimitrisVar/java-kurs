
public class Aufgabe_5 {

	public static void main(String[] args) {
		
		/*
		 * Aufgabe zu Klassen und Objekte:
		 * Erstelle aus der eben erstellten Klasse 2 Objekte:
		 * 
		 * 1. samsungLaptop: ram: 8gb, preis 600 Euro, marke: Samsung
		 * 2. medionLaptop: ram: 4gb, preis: 400 Euro, marke: Medion
		 * 
		 * und rufe die Methode getData() mit dem Objekt samsungLaptop und medionLaptop auf
		 * 
		 */
		
		Laptop samsungLaptop = new Laptop(8, 600, "Samsung");
		Laptop medionLaptop = new Laptop(4, 400, "Medion");
		
		samsungLaptop.getData();
		medionLaptop.getData();
		

	}

}
