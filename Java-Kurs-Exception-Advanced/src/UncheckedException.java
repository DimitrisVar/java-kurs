import java.util.ArrayList;
import java.util.Iterator;

public class UncheckedException {

	public static void main(String[] args) {
		
		// Exception (Fehler) -> Exception Handling -> try, catch
		// Es gibt in Java 2 Arten von Exception's (Fehlern)
		
		// Unchecked -> Das sind die Bugs
		// Diese Fehler passieren zur Runtime (Laufzeit des Programmes)
		
		// ArrayIndexOutOfBoundsException
		
		String[] warenkorb = new String[40]; // Index 0 - 39
		
		warenkorb[0] = "Schuhe";
		warenkorb[1] = "Hemd";
		warenkorb[2] = "Guertel";
		// ..
		// [39]
		
		
		try {
			warenkorb[40] = "Handy";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dein Warenkorb ist maximal gefuellt");
		}
		

		
		// NumberFormatException tritt auf, wenn man z.B. die Methode parseInt()
		// verwendet und statt Zahlen, Buchstaben konvertiert
	
		String inputTextField = "";
		inputTextField= "AA"; // Beispiel: inputTextField= "AA";
		System.out.println(inputTextField +" Schuhe");
		
		int artikelPreis = 20;
		
		try {
			// Integer.parseInt() wandelt den Wert der Variable inputTextField zu einem Integer um.
			int gesamtSumme = artikelPreis * Integer.parseInt(inputTextField);
			System.out.println("Gesamtsumme: " +gesamtSumme);
		} catch (NumberFormatException e) {
			System.out.println("Bitte keine Buchstaben in das TextField eintippen");
		}
		
		
		// NullPointerException tritt auf, wenn man z.B. die Laenge eines Nulls mit einem Wert vergeicht
		String passwort = null;
		
		try {
			if(passwort.length() <= 10) {
				System.out.println("Dein Passwort ist viel zu kurz");
			}
		} catch (NullPointerException e) {
			System.out.println("Dein Kennwort ist null und hat keine laenge");
		}
		
		
		
		// ClassCastException
//		double number = 30.3221321;
//		int numberAsInt = (int)number;
//		
//		System.out.println(numberAsInt);
//		
//		Object iObject = Integer.valueOf(42);
//		String string = (String)iObject;
//		
//		// Aus einem Golf Auto machen
//		Auto meinAuto = new Auto();
//		Golf golf = new Golf();
//		
//		golf = (Golf)meinAuto;
//		
//		meinAuto = (Auto)golf;
//		
//		ArrayList list = new ArrayList();
//		list.add("Brot");
//		list.add("Tomaten");
//		list.add(30);
//		
//		for (Object object : list) { // Das geht nicht, mann kann aus einer Nummer kein String machen
//			String string = (String)object;
//			System.out.println(string);
//		}
	}
	
}

class Auto {
	
}

class Golf extends Auto {
	
}




