
public class ExceptionTest {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 0;
		
		// Ein Java Programm kann einen Fehler (Exception) werfen
		try {
			int summe = a / b;
			System.out.println(summe);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Durch 0 teilen geht nicht!");
		}
		
		System.out.println("Programm laeuft noch weiter");

	}

}
