
public class MehrZuString {
	
	// Ein String ist eine Zeichenkette
	// Eine Zeichenkette ist dabei nichts anderes als ein Array von einzelnen Zeichen, Datentyp, char.
	
	public static void main(String[] args) {
		
		// Merke: String erzeugt oder veraendert -> Es wird immer in \
		// neuer String erstellt, weil String immutable(unveraenderbar) sind
				
		// Merke: StringBuffer erzeugt oder veraendert -> Es ist immer das selbe Objekt
		
		String string = "Hallo"; // Nennt man auch erstellen durch einen String Literal
		String string2 = new String("Hi");
		
		// Methoden der Klasse String
		String passwort = "123456";
		String eingabeUser = "123456";
		
		if(passwort.equals(eingabeUser)) {
			System.out.println("Login erfolgreich");
		} else {
			System.out.println("Falschen Passwort");
		}
		
		System.out.println(passwort.length());
		
		String test = "Hallo ich bin der Olli";
		String name = "Olli";
		
		int namePosition = test.indexOf(name);
		System.out.println(namePosition);
		
		String passwortUser = "halloICHBinDa";
		String passWortUserEingabe = "halloichbinda";
		
		if(passwortUser.toLowerCase().equals(passWortUserEingabe)) {
			System.out.println("Login Erfolgreich");
		} else {
			System.out.println("Passwort falsch");
		}
		
		String string1 = "Hallo,Peter,du,bist,super";
		
		System.out.println(string1);
		String string3 = string1.replace(',', ' ');
		
		System.out.println(string3);
		
	}

}
