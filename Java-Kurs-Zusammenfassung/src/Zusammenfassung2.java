import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class vergleicheStringLaenge implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		int laenge1 = o1.length();
		int laenge2 = o2.length();
		
		if (laenge1 > laenge2) {
			return 1;
		} else if (laenge1 < laenge2) {
			return -1;
		} else {
			return 0;
		}
		
		// compare = vergleiche
		// 1 = o1 groesser o2
		// -1 = o1 kleiner als o2
		// 0 = beide gleich
		
	}
}

class umgekehrteAlphabetischeReihenfolgeString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
}


public class Zusammenfassung2 {

	public static void main(String[] args) {
		
		// Comparator = Vergleicher
		
		java.util.List<String> angestelltenListe = new ArrayList<>();
		
		angestelltenListe.add("Habs");
		angestelltenListe.add("Chris");
		angestelltenListe.add("Andi");
		angestelltenListe.add("Petra");
		angestelltenListe.add("Peter");
		angestelltenListe.add("Christian");
		
		Collections.sort(angestelltenListe, new umgekehrteAlphabetischeReihenfolgeString());
		
		for(String string : angestelltenListe ) {
			System.out.println(string);
		}
		
	}
}
