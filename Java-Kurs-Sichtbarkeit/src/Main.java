import java.util.Iterator;

public class Main {

	// In Java gibt es drei Variablen Typen: Lokale-, Klassen- Und Instanz (Objekt)-Variablen.
	// Mit Variablen werden Daten im Hauptspeicher / Arbeitsspeicher gespeichert
	// Auf diese Daten kann man dann zur Programmlaufzeit zugreifen / nutzen
	
	public static void main(String[] args) {
		
		errechne();
		
		KlasseOne aKlasseOne = new KlasseOne();
		aKlasseOne.a = 100;
		
		System.out.println(KlasseOne.b);

	}
	
	public static void errechne() {
		// Lokale Variablen d.h. diese sind nur innerhalb des Blockes { ... } sichtbar und nach dem 
		// beenden der Funktion werden diese geloescht.
		int zahl = 50; 
		int zahl1 = 50;
		
		System.out.println("Summe: " +(zahl + zahl1));
	}

}
