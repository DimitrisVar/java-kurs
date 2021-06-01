import java.util.Scanner;

public class Aufgabe_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Aufgabe 
		/*
		 * Erstelle erneut ein Objekt der Klasse Scanner
		 * und lese 2 Werte mithilfe dieser Klasse ein
		 * 
		 * 1. ist eine Ganzzahl, die Zahl soll dein Alter sein
		 * 2. ist eine Zeichenkette(String), dein Namen
		 * 
		 * Am Ende soll dein Alter und dein Namen in der Konsoles ausgegeben werden
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie Ihr Alter ein: ");
		
		int alter = scan.nextInt();
		
		System.out.println("Geben Sie Ihr Namen ein: ");
		
		String name = scan.next();
		
		System.out.println("Name: " +name +"\n" +"Alter: " +alter);
	}

}
