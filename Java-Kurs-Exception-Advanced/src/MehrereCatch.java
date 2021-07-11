
public class MehrereCatch {

	public static void main(String[] args) {
		
		// catch - fang den Fehler (Exception) ein
		
		try {
			int a[]= new int[5]; // Index: 0, 1, 2, 3, 4
			a[3] = 30 / 3;
			a[2] = 30 / 2;
			
			int summe = 30 * 3;
			
			a[1] = summe;
			a[5] = 20;
			
		} catch (ArithmeticException e) {
			System.out.println("Man kann durch 0 nicht teilen");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dein Warenkorb ist voll..");
		} catch (Exception e) {
			System.out.println("Fehler ist passiert");
		}

	}

}
