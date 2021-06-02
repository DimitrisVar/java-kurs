
public class Aufgabe_3 {
	public static void main(String[] args) {
		/*
		 * Aufgabe:
		 * 
		 * 1. Wert: 3.547 2. Wert: 6.354
		 * 
		 * Definiere (erstelle) eine Methode die als Aufgabe hat, diese zwei
		 * Werte zu multiplizieren (mal nimmt) Diese Werte sollen dabei als
		 * Paramter an die Methode übergeben werden
		 * 
		 * Der Wert der errechnet wird soll dabei zurück gegeben werden, sodass
		 * wir den Wert in der Konsole ausgeben können.
		 * 
		 */

		double summe = werteMultiplizieren(3.547, 6.354);
		System.out.println(summe);
		
		
	}
	
	public static double werteMultiplizieren(double wert1, double wert2) {
		
		double summe;
		summe = wert1 * wert2;
		
		return summe;
	}
}
