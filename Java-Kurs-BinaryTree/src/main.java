
public class main {

	public static void main(String[] args) {
		
		Tree baum = new Tree();
		baum.addNode(8);
		baum.addNode(6);
		baum.addNode(10);
		baum.addNode(12);
		baum.addNode(4);

		int count = baum.countNodes(baum.root);
		System.out.println("Anzahl der Nodes: " +count);
		
		System.out.println("---------------");
		
		baum.inOrderTravers(baum.root);
		System.out.println("---------------");
		baum.postOrderTravers(baum.root);
		System.out.println("---------------");
		baum.preOrderTravers(baum.root);
		System.out.println("---------------");
		Node seachNode = baum.find(12);
		System.out.println("Gefunden Node mit dem Wert: " +seachNode.value);
	}

}
