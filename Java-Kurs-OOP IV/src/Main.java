
public class Main {

	public static void main(String[] args) {
		
		Held player1 = new Held(50);
		
		player1.getLebenspunkte();
		
		int schaden = 10;
		
		player1.setLebenspunkte(schaden);
		
		GoogleKonto peter = new GoogleKonto("peter123", "1234");
		
		peter.setPasswort("123");
		
	}

}
