
public interface ITelefon {
	// Attribute -> nur Konstanten
	public String NETZANBIETER = "Telekom";
	//	public static final String NETZANBIETER = "Telekom";

	
	// Methodensignaturen / Methodenkoepfe
	public abstract void powerOn();
	public abstract boolean esKlingelt();
	public abstract boolean anrufen();
}