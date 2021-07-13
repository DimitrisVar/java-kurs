
public class Liste {

	// Startknoten der Liste
	Node startElem = new Node("Anfang der Liste");

	// Konstruktor der Liste
	public Liste() {

	}

	// Füge einen Knoten in die Liste
	public void addNewElement(String string) {
		Node newElem = new Node(string);
		Node lastElem = getLastElem();
		lastElem.setNextElem(newElem);
	}

	// Erhalten das letzte Element einer Liste
	public Node getLastElem() {
		Node le = startElem;
		while (le.getNextElem() != null) {
			le = le.getNextElem();
		}
		return le;
	}

	// Daten der Liste ausgeben
	public void wirteList() {
		Node le = startElem;
		while (le != null) {
			System.out.println(le.getString());
			le = le.getNextElem();
		}
	}

	// Suche einen Knoten
	public void find(String string) {
		Node le = startElem;
		while (le != null) {
			if (le.getString().equals(string)) {
				System.out.println("Objekt gefunden: " + le.getString());
				break;
			} else {
				le = le.nextElement;
				System.out.println("Objekt: " + string + " nicht gefunden");
			}
		}
	}
	
	// Löschen eines Knotens
	public void delete(String string) {
		Node le = startElem;
		while (le.getNextElem() != null && !le.getString().equals(string)) {
			if (le.getNextElem().getString().equals(string)) {
				if (le.getNextElem().getNextElem() != null) {
					le.setNextElem(le.getNextElem().getNextElem());
				} else {
					le.setNextElem(null);
					break;
				}
			}
			
			le = le.getNextElem();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
