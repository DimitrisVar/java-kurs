
public class Node {

	// Information des Knotens
	String string;
	
	// Die Referenz (Adresse) vom Nachbarn
	Node nextElement;
	
	// Konstruktor
	public Node(String string) {
		this.string = string;
		nextElement = null;
	}
	
	// Setzte einen Nachbarn
    public void setNextElem(Node nextElem) {
        this.nextElement = nextElem;
    }

    // Erhalte den Nachbar
    public Node getNextElem() {
        return nextElement;
    }
    
    // Erhalte die Information des Knotens
    public String getString() {
        return string;
    } 
}
