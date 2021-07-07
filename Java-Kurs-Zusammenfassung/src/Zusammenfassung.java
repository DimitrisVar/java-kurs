import java.util.*;

class Person implements Comparable<Person> {
	private String vorName;
	
	public Person(String vorName) {
		this.vorName = vorName;
	}

	@Override
	public String toString() {
		return "Person [vorName=" + vorName + "]";
	}

	@Override
	public int compareTo(Person o) {
//		return vorName.compareTo(o.vorName); // sortiert alphabetisch
		
		// 0 = Beide gleich
		// 1 = Objekt ist groesser
		// -1 = Objekt ist kleiner
		
		// sortiert nach length
		
		int laenge1 = vorName.length();
		int laenge2 = o.vorName.length();
		
		if (laenge1 > laenge2) {
			return 1;
		} else if (laenge1 < laenge2) {
			return -1;
		} else {
			return vorName.compareTo(o.vorName);
		}
	}
}


public class Zusammenfassung {

	public static void main(String[] args) {
		
		// Strukturen
		
		// List / Liste -> Einkaufsliste
		
//		List<String> list = new ArrayList<>();
		
//		list.add("Katze");
//		list.add("Hund");
//		list.add("Kaninchen");
//		list.add("Aal");
//		
//		Collections.sort(list);
//		
//		for(String string : list) {
//			System.out.println(string);
//		}
//		
		List<Person> list = new ArrayList<>();
		Zusammenfassung.addElement(3, list);
		
		Collections.sort(list);
		
		Zusammenfassung.getElement(list);
		
		System.out.println("------------");
		
		Set<Person> set = new TreeSet<>();
		Zusammenfassung.addElement(5, set);
		Zusammenfassung.getElement(set);
		
		
		// Set / Menge -> Schublade voll mir Elementen -> Kein doppeltes Element
//		Set<String> set = new TreeSet<>(); // HashSet durch TreeSet sortieren lassen
//		
//		set.add("Katze");
//		set.add("Hund");
//		set.add("Kaninchen");
//		set.add("Aal");
//		
//		for (String string : set) {
//			System.out.println(string);
//		}
		
//		System.out.println("------------");
//		
//		// Map / Verbindung zwischen 2 Elementen -> Artikel hat eine einzigartige Artikelnummer
//		Map<Integer, String> map = new TreeMap<>(); // TreeMap sortiert nicht nach den Ihnahlten sondern nach den Schluesseln
//		
//		map.put(4, "Katze");
//		map.put(2, "Hund");
//		map.put(1, "Kaninchen");
//		map.put(3, "Aal");
//		
//		for(Integer key : map.keySet()) {
//			System.out.println("Key: " +key + " Inhalt: " +map.get(key));
//		}

	}
	
	public static void addElement(int anzahlPersonen, Collection<Person> col) {
		for(int i = 1; i <= anzahlPersonen; i++) {
			Scanner scanName = new Scanner(System.in);
			System.out.println("Name eingeben: ");
			String eingabeName = scanName.next();
			System.out.println("------------");
			Person person = new Person(eingabeName);
			col.add(person);
		}
	}
	
	public static void getElement(Collection<Person> col) {
		for (Person person : col) {
			System.out.print("Name der Person: " +"\n" +person);
			System.out.println("------------");
		}
		
	}

}
