
public class Node {
	// Information des Nodes
	int value;
	
	// rechter Nachbar
	Node right;
	
	// linker Nachbar
	Node left;
	
	public Node(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
