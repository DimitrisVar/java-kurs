
public class Kontakt {
	
	// Attribute
	private String name;
	private String telefonNummer;
	
	// Konstruktoren
	public Kontakt() {
		
	}
	
	public Kontakt(String name, String telefonNummer) {
		setName(name);
		setTelefonNummer(telefonNummer);
	}
	
	// Methoden
	
	public static Kontakt erstelleKontakt(String name, String telefonNummer) {
		return new Kontakt(name, telefonNummer);
	}
	
	// Getter Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTelefonNummer(String telefonNummer) {
		this.telefonNummer = telefonNummer;
	}
	
	public String name() {
		return name;
	}
	
	public String telefonNummer() {
		return telefonNummer;
	}
 }
