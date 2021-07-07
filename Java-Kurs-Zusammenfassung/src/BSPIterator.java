import java.util.*;

public class BSPIterator {

	public static void main(String[] args) {
		
		// 3 wichtige Methoden
		// hasNext() = gibt uns ein true wieder wenn ein naechstes Element da ist
		// next() = gibt uns das Element / Objakt wieder wo sich der Pointer befindet
		// remove() = loescht das Element / Objekt wo sich der Pointer befindet

		
		List<String> list = new LinkedList<>();
		
		list.add("Michael");
		list.add("Chris");
		list.add("Perter");
		list.add("Petra");
		list.add("Andi");
		list.add("Hans");
		
		Iterator<String> it = list.iterator();
		
		
		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			
			if(value.equals("Andi")) {
				it.remove();
			}
		}
		
		System.out.println();
		
		for(String string : list) {
			System.out.println(string);
		}
		
	}

}
