import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CheckedExceptions {

	public static void main(String[] args) {
		
		// Excpetion (Fehler)
		// Es gibt in Java 2 Arten von Exceptions (Fehlern)
		
		// Checked -> "Hey checked mich an Ort und Stelle!"
		
		// SQL Exception
		
		try {
			Connection connection = DriverManager.getConnection("C:\\Users\\Dimitris\\Desktop\\android");
		} catch (SQLException e) {
			System.out.println("Hey bitte Internet Kabel pruefen..");
		}

		System.out.println("Programm laeuft heir weiter");
		
		// FileNotFoundException
		File pdfFile = new File("C:\\Users\\Dimitris\\Desktop\\android'pdfdatei.pdf");
		
		try {
			FileInputStream stream = new FileInputStream(pdfFile);
			stream.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Datei nicht gefunden");
		} catch (IOException e) {
			System.out.println("Datei kann nicht gelesen werden, weile keine Rechte bestehen..");
		}
		
		// IOException -> Checked Exception
	}

}
