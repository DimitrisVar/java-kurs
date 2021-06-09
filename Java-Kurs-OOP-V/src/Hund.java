
public class Hund extends Tier {

	// Eigenschaften / Attribute
	int zaehne;
	
	// Konstruktoren
	public Hund(String name, int groesse, int gewicht, int zaehne) {
		super(name, groesse, gewicht);
		this.zaehne = zaehne;
	}
	
	// Methoden
		public void bellen() {
			
		}
	
	@Override
	public void essen() {
		System.out.println("Der Hund muss sein Essen noch kauen");
		System.out.println("---------------------------------------");
	}

	@Override
	public void atmen() {
		System.out.println("Der Hund atmet ueber die Lunge");
		
	}
}
