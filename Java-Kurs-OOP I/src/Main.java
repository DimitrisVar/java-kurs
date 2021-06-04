
public class Main {

	public static void main(String[] args) {
		
		// Datentyp variableNamen = new Konstruktor();
//		Auto bmw = new Auto(0, 0, null);
//		
//		bmw.preis = 5000;
//		bmw.marke = "BMW";
//		
//		System.out.println("Preis: " +bmw.preis +"\n" +  "Marke: " +bmw.marke);
		
		Auto audi = new Auto(4, 5000, "Audi");
		System.out.println("Reifenanzahl: " +audi.reifen +"\n" +"Preis: " +audi.preis +"\n" +"Marke: " +audi.marke);
	}

}
