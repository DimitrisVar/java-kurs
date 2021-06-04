
public class Kuh extends Tier {
	
	// Eigenschaften / Attribute
	int hufe;
	
	// Konstruktoren
	public Kuh(String name, int groesse, int gewicht, int hufe) {
		super(name, groesse, gewicht);
		this.hufe = hufe;
	}
	
	// Methoden
	@Override
	public void essen() {
		System.out.println("Die Kuh muss das Essen immer wiederkauen");
		super.essen();
		System.out.println("---------------------------------------");
		
		
	}
}
