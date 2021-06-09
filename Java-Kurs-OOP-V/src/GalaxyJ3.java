
public class GalaxyJ3 extends Samsung implements ITelefon{

	// Attribute
	
	// Konstruktoren
	public GalaxyJ3(double preis, String produktTyp) {
		super(preis, produktTyp);
	}
	// Methoden
	
	@Override
	public void powerOn() {
		System.out.println("Das Galaxy J3 geht an der rechte Seite an und man muss Power Button 3 Sekunden halten");
		
	}

	@Override
	public boolean esKlingelt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anrufen() {
		// TODO Auto-generated method stub
		return false;
	}

}
