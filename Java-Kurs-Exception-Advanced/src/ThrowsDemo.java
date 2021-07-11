import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		// { throw } -> steht innerhalb der Klammer / scheisst den Fehler
		// Fehler geben kann
		
		// checked -> Check mich an Ort und Stelle
		// unchecked -> wirft erst zur Laufzeit
		
		try {
			loadMessages();
		} catch (SQLException e) {
			System.out.println("Bitte WLAN einschalten...");
		}

	}
	
	// Throws "beschreibt", dass es ein Fehler auftretten koennte
	// Throw im Gegenteil "scheisst" den Fehler
	public static void getConnection() throws SQLException { 
		
		// Verbindung zu einer Datenbank aufbauen
		boolean isConnected = false;
		
		if(isConnected) {
			
		} else {
			throw new SQLException("Keine Internet Verbindung vorhanden, bitte pruefen Sie ...");
		}
		
	}
	
	public static void loadMessages() throws SQLException {
		getConnection(); 
		}
	}
