
public class BMW extends Auto {
	
	boolean xDrive;
	
	public BMW(int ps, int tuerenAnzahl, String fahrzeugTyp, boolean xDrive) {
		super("BMW", ps, tuerenAnzahl, fahrzeugTyp);
		this.xDrive = xDrive;
		
	}

	@Override
	public void starten() {
		super.starten();
		System.out.println("Naehmich der BMW starte");
		System.out.println("---------------------------------------");
	}

}
