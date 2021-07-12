
public class Person {

	private int alter;

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		System.out.println("Nur Zahlen zwischen 10-30");
		
		if(alter >= 10 && alter <= 30) {
			this.alter = alter;
			System.out.println("Alter wurde gesetzt");
		} else {
			System.out.println("Zahl ungueltig");
		}
	}
	
	
}
