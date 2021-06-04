
public class Hund extends Tier {

	// Eigenschaften / Attribute
	int zaehne;
	
	// Konstruktoren
	public Hund(String name, int groesse, int gewicht, int zaehne) {
		super(name, groesse, gewicht);
		this.zaehne = zaehne;
	}
	
	@Override
	public void essen() {
		System.out.println("Der Hund muss sein Essen noch kauen");
		super.essen();
		System.out.println("---------------------------------------");
	}

	// Methoden
	public void bellen() {
		
	}
}
