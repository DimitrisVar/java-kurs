import java.util.ArrayList;

public class Adressbuch {

	public static void main(String[] args) {
		
		Adresse peterAdresse = new Adresse("Peter", "Fritzlangen 4", "Berlin");
		Adresse hansAdresse = new Adresse("Hans", "Berlinerstrasse 6", "Leipzig");
		Adresse michaelAdresse = new Adresse("Michael", "Leipzigstrasse 40", "Hamburg");

		ArrayList<Adresse> adressenListe = new ArrayList<Adresse>();
		adressenListe.add(michaelAdresse);
		adressenListe.add(hansAdresse);
		adressenListe.add(michaelAdresse);
		
		for (Adresse adresse : adressenListe) {
			System.out.println("------------------------------");
			System.out.println("Name: " +adresse.getName() +"\n" +" Strasse: " +adresse.getStrasse() +"\n" +" Stadt: " +adresse.getStadt());
		}
	}

}
