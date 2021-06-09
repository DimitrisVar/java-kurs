
public class Auto {
	
	// Attribute
	String autoMarke;
	Reifen reifen;
	
	// Konstruktor
	public Auto () {
		
	}
	
	public Auto(String autoMarke, String reifenMarke, String reifenTyp) {
		this.autoMarke = autoMarke;
		reifen = new Reifen(reifenMarke, reifenTyp);
	}
	
	// Methoden
	public void ausgabeDaten() {
		System.out.println("Automarke: " +this.autoMarke +"\n" +"Reifentyp: " +this.reifen.reifenTyp);
		System.out.println("-------------------------");
	}
}
