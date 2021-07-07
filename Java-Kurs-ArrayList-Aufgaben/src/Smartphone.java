import java.util.ArrayList;

public class Smartphone {
	private List<Kontakt> meineKontakte;

	// Konstruktoren
	public Smartphone() {
		
	}
	
	public Smartphone(ArrayList meineKontakte) {
		meineKontakte = new ArrayList<Kontakt>();
		
	}
	
	
	public boolean addKontakt(Kontakt neuerKontakt) {
		for(Kontakt kontaktInListe : meineKontakte) {
			if(neuerKontakt.getName().equals(kontaktInListe.getName())) {
				
			}
		}
	}
	
	public boolean findKontakt() {
		
	}
	
	public void ausgabe() {
		
	}
	
	
}
