
public class Person {
	String vorname;
	int alter;
	
	public void getPersonData() {
		System.out.println("Vorname: " +vorname +" Alter: " +alter);
	}
	
	public static void main(String[] args) {
		
		// In java um irgendwelche methoden nutzen zu koennen, 
		// muessen wir in der Regel Objekte erstellen, um eine Methode aufzurufen
		
		Person person = new Person();
		person.vorname = "Laura";
		person.alter = 20;
		
		person.getPersonData();
	} 
	
}
