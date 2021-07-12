
public class Main {

	/*
	 *  			| Class | Package | Subclass   | Subclass   | World
	 *  			|		|		  | (same pkg) | (diff pkg) |
	 *  ------------+-------+---------+------------+------------+---------
	 *  public		|	+	|	 +	  |		 +	   |	  +		|	 +
	 *  ------------+-------+---------+------------+------------+---------
	 *  protected	|	+	|	 +	  |		 +	   |	  +		|
	 *  ------------+-------+---------+------------+------------+---------
	 *  no modifier	|	+	|	 +	  |		 +	   |	  		|
	 *  ------------+-------+---------+------------+------------+---------
	 *  private		|	+	|	 	  |			   |	  		|
	 *  
	 *  
	 *  public (+) - Zugriff innerhalb und ausserhalb der Klasse
	 *  private (-) Zugriff nur innerhalb der Klasse
	 *   
	 *  protected (#) - Zugriff nur innerhalb der Klasse und Subklassen etc.
	 *  package (~) - Zugriff nur innerhalb des Pakets
	 *  
	 */
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setAlter(30);
		
		System.out.println(person.getAlter());

	}

}
