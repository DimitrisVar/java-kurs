import java.util.*;

public class DSArrayList {

	public static void main(String[] args) {
		
		//ArrayList = "Wie ein Array nur dynamisch"
		
		// Eine ArrayList erstellen:
		ArrayList einkaufsListe = new ArrayList();
		ArrayList<String> namensListe = new ArrayList<String>();
		
		// Dateneingabe:
		einkaufsListe.add("Wasser");
		einkaufsListe.add("Brot");
		// einkaufsListe.add(new Integer(4));
		
		namensListe.add("Hans");
		namensListe.add("Peter");
		// einkaufsListe.add(new Double((4.5));
		
		// Datenausgabe
		for(int i = 0; i < namensListe.size(); i++) {
			System.out.println("Name: " +namensListe.get(i));
		}
		
		for (String string : namensListe) {
			System.out.println("Die Laenge des Names ist: " +string.length());
		}
	}

}
