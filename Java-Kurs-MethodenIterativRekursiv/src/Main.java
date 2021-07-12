
public class Main {

	// Iterativ
	// def Pizzaessen():
	// vom ersten bis zum letzten Bissen:
	// schneide diesen Bissen ab und iss ihn auf
	// FERTIG
	
	// Rekrusiv
	// def Pizzaessen():
	// wenn Teller leer: FERTIF
	// sonst:
	// scheide einen Bissen ab und iss ihn auf
	// Pizzaessen()
	
	public static void main(String[] args) {
		
		funktionX();
		
		countIterativ(10, 20);
		
		countRekursiv(10, 20);

	}
	
	// Einfache normale Methode wird einmalig aufgerufen
	public static void funktionX() {
		System.out.println("Einmaliger Aufruf der FunktionX");
	}
	
	// Methode wird iterativ aufgerufen werden (iterativ = Wiederholung)
	// Iteration wird ermoeglicht durch Schleifen for, while etc. d.h. es gibt einen Zaehler
	public static void countIterativ(int zahl, int max) {
		while(zahl <= max ) {
			System.out.println("Iterativ: " +zahl);
			zahl = zahl + 1;
		}
	}
	
	// Methode wird rekursiv aufgerufen werden (rekursiv = Methode ruft sich selbst auf)
	// Die Rekursion ist ebenfalls eine wiederholte Ausfuerung, doch es gibt keine Zaehler
	public static void countRekursiv(int zahl, int max) {
		if(zahl > max) {
			return;
		}
		System.out.println("Rekursiv: " +zahl);
		countRekursiv(zahl + 1, max);
	}
}
