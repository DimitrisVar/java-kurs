import java.util.*;

public class TryCatchVerschatelung {

	public static void main(String[] args) {
		
		try {
			System.out.println("Bitte Anzahl der Hemden eingeben...");
			java.util.Scanner scanner = new Scanner(System.in);
			String textString = scanner.nextLine();
			
			int gesamtKosten = Integer.valueOf(textString); // Umwandelung eines Strings zum Integer
			System.out.println("Deine Kosten: " +gesamtKosten * 10 + "$");
			
		} catch (NumberFormatException e) {
			System.out.println("Bitte nur Zahlen 1 - 10 eintippen");
			
			try {
				System.out.println("Bitte Anzahl der Hemden eingeben...");
				java.util.Scanner scanner = new Scanner(System.in);
				String textString = scanner.nextLine();
				
				int gesamtKosten = Integer.valueOf(textString); // Umwandelung eines Strings zum Integer
				System.out.println("Deine Kosten: " +gesamtKosten * 10 + "$");
				
			} catch (NumberFormatException e2) {
				System.out.println("Bitte nur Zahlen 1 - 10 eintippen");
				
				try {
					System.out.println("Bitte Anzahl der Hemden eingeben...");
					java.util.Scanner scanner = new Scanner(System.in);
					String textString = scanner.nextLine();
					
					int gesamtKosten = Integer.valueOf(textString); // Umwandelung eines Strings zum Integer
					System.out.println("Deine Kosten: " +gesamtKosten * 10 + "$");
					
				} catch (Exception e3) {
					System.out.println("Bitte nur Zahlen 1 - 10 eintippen");
				}
			}
		}

	}

}
