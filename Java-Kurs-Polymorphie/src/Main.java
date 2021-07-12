
public class Main {
	
	// Polymorphie = Vielgestaltigkeit / Vielfalt

	public static void main(String[] args) {
		
		// Warum ist das wichtig?
		// Die Polymorphie wird dann wichtig, wenn es erst zur Laufzeit des Programmes klar ist, welches
		// Auto es sein soll!
		// Beispielweise gibt es ein Program wo der Nutzer sich fuer einen BMW oder einen Audi entscheiden kann
		
		
		// wir ersetzen die Klasse Bmw beim erstellen des Objektes durch die Klasse Auto
		Auto auto = new Audi();
		auto.starten();
		
//		Bmw auto = new Bmw();
//		auto.starten();
		
		Audi auto1 = new Audi();
		auto1.starten();
		
	}

}
