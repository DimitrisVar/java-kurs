
public class Main {

	public static void main(String[] args) {
		Liste liste = new Liste();
		
		liste.addNewElement("Ich bin der zweite in der Liste");
		liste.addNewElement("Ich bin der dritte in der Liste");
		liste.addNewElement("Ich bin der vierte in der Liste");
		liste.addNewElement("Ich bin der fünfte in der Liste");
		
		liste.wirteList();
		
		System.out.println("-------");
		
		liste.addNewElement("Peterr");
		liste.find("Peter");
		
		System.out.println("-------");
		
		liste.wirteList();
		
		liste.delete("Peterr");
		liste.wirteList();
		
		System.out.println("-------");
		liste.delete("Ich bin der dritte in der Liste");
		liste.wirteList();
	}
	
}
