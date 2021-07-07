import java.util.*;

//compare = vergleiche
// 1 = o1 groesser o2
// -1 = o1 kleiner als o2
// 0 = beide gleich
		

class soritereAngestelltenID implements Comparator<Angestellter> {

	@Override
	public int compare(Angestellter o1, Angestellter o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}

class sortiereAngestelltenNamen implements Comparator<Angestellter> {

	@Override
	public int compare(Angestellter o1, Angestellter o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class sortiereAngestelltenGeburtsjahr implements Comparator<Angestellter> {

	@Override
	public int compare(Angestellter o1, Angestellter o2) {

		if(o1.getGeburtsJahr() > o2.getGeburtsJahr()) {
			return 1;
		} else if (o1.getGeburtsJahr() < o2.getGeburtsJahr()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}


public class AngestelltenListe {

	public static void main(String[] args) {
		
		List<Angestellter> angestelltenListe = new ArrayList<>();
		
		AngestelltenListe.addAngestellter(3, angestelltenListe);
		
		Collections.sort(angestelltenListe, new sortiereAngestelltenNamen());
		
		AngestelltenListe.getAngestellter(angestelltenListe);
		
		Set<Angestellter> set1 = new TreeSet<>(new soritereAngestelltenID());
		Map<Angestellter, String> map1 = new TreeMap<>(new sortiereAngestelltenGeburtsjahr());
		

	}

	public static void addAngestellter(int anzahl, Collection<Angestellter> col) {
		for(int i = 0; i < anzahl; i ++) {
			Scanner scanAngestellterScanner = new Scanner(System.in);
			System.out.println("Bitte Namen eingeben: ");
			String name = scanAngestellterScanner.next();
			System.out.println("Bitte ID eingeben: ");
			int id = scanAngestellterScanner.nextInt();
			System.out.println("Bitte Geburtsjahr eingeben: ");
			int geburtsJahr = scanAngestellterScanner.nextInt();
			
			Angestellter angestellter = new Angestellter(id, name, geburtsJahr);
			col.add(angestellter);
		}
	}
	
	public static void getAngestellter(Collection<Angestellter> col) {
		for(Angestellter angestellter : col) {
			System.out.println("Angestellter: ");
			System.out.println(angestellter);
		}
	}
}
