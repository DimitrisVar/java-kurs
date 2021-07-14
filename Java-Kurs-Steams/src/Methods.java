import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Methods {

	public static void main(String[] args) {
		
		// Pfad erstellen
		Path path = Paths.get("C:\\Users\\Dimitris\\Desktop\\text.txt");
		
		// Methoden
		System.out.println("toString: " +path.toString());
		System.out.println("getFileName: " +path.getFileName());
		System.out.println("getName: " +path.getName(0)); // 0 = index des Pfades
		System.out.println("getCountName: " +path.getNameCount());
		System.out.println("subPath: " +path.subpath(0, 2)); // Anfang des Pfades und Ende (Root Element nicht dabei!)

		System.out.println("getParent: " +path.getParent());
		System.out.println("getRoot: " +path.getRoot());
	
		System.out.println("absolutePath: " +path.toAbsolutePath());
		
		System.out.println("normalize: " +Paths.get("C:\\\\Users\\\\Dimitris\\\\Desktop\\\\test.txt").normalize());
		
		
		// Filesystem
		FileSystem fileSystem = FileSystems.getDefault();
		System.out.println(fileSystem);
		
		File file = new File("C:\\Users\\Dimitris\\Desktop\\text.txt");
		
		boolean fileExists = file.exists();
		
		if(fileExists) {
			System.out.println("Datei vorhanden");
		} else {
			System.out.println("Datei nicht vorhanden");
		}
		
		// File Laenge / Groesse
		long length = file.length();
		System.out.println("Dateigroesse in Byte: " +length);
		
		// Ist das File Objekt eine Datei oder ein Ordner (Verzeichnis)
		boolean isDic = file.isDirectory();
		
		if(isDic) {
			System.out.println("Es ist ein Ordner");
		} else {
			System.out.println("Es ist nur eine Datei");
		}
		
		// Namen aendern
		boolean changeName = file.renameTo(new File("C:\\Users\\Dimitris\\Desktop\\neuer name.txt"));
		
		if(changeName) {
			System.out.println("Name geaendert");
		} else {
			System.out.println("Name konnte nicht geaendert werden");
		}
		
		// Datei erstellen
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Verzeichnis erstellen
		File newDir = new File("C:\\Users\\Dimitris\\Desktop\\Neue Dateien");
		
		boolean completedDir = newDir.mkdirs();
		
		if(completedDir) {
			System.out.println("verzeichnis erstellt");
		} else {
			System.out.println("Verzeichnis nicht erstellt");
		}
		
		// Ordner erstellen
		File newOrd = new File("C:\\Users\\Dimitris\\Desktop\\Neue Dateien");
		newOrd.mkdir();
		
		// Liste von Dateien innerhalb eines Ordners anzeigen -> Entweder als String- oder File - Array
		String [] filenames = newDir.list();
		File [] files = newDir.listFiles();
		
		for(String file2 : filenames) {
			System.out.println("Name: " +file2);
		}
		
		for(File file2 : files) {
			System.out.println("Name: " +file2.getAbsolutePath());
			file2.delete();
		}
		
		// Aus einem File den Path erhalten
		File file2 = new File("C:\\Users\\Dimitris\\Desktop\\text.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Path path2 = file2.toPath();
		System.out.println(path2);
		
		// Aus einem Path ein File erstellen
		Path path3 =  Paths.get("C:\\Users\\Dimitris\\Desktop\\text2.txt");
		File file3 = path3.toFile();
		
		try {
			file3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// File Seperator
		String fileSeperator = System.getProperty("file.separator");
		System.out.println(fileSeperator);
	
		String absoluteFilePath = fileSeperator + "Users" + fileSeperator + "Dimitris" + fileSeperator + "Desktop" +fileSeperator +"test.txt";
		System.out.println(absoluteFilePath);
		
		File file4 = new File(absoluteFilePath);
		
		try {
			file4.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
