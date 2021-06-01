import java.util.Scanner;

public class Einlesen1 {
	public static void main(String[] args) {
		
		// Klasse = Koplexer Datentyp sprich dort sind mehr als nur eine Information gespeichert
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte eine Zahl eingeben: " );
		
		double zahl = scan.nextDouble();
		System.out.println("Ihre Zahl lautet: " +zahl);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Geben Sie Ihren Namen ein: ");
		String zeichenKette = scan2.next();
		System.out.println("Bitte geben Sie Ihr Alter ein: ");
		int alter = scan2.nextInt();
		
		System.out.println("Ihr Name:" +zeichenKette + " Ihr Alter: " +alter);
	}
}
