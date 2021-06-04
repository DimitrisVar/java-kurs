
public class Audi extends Auto {

	boolean quattro;
	
	public Audi(int ps, int tuerenAnzahl, String fahrzeugTyp, boolean quattro) {
		super("Audi", ps, tuerenAnzahl, fahrzeugTyp);
		this.quattro = quattro;
		
	}

	@Override
	public void starten() {
		super.starten();
		System.out.println("Ja und zwar ein Audi startet");
		System.out.println("---------------------------------------");
		
	}
}
