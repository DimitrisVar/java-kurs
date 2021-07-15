import java.awt.desktop.FilesEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadManager implements Runnable {

	private String link;
	private File outputFile;
	
	private String fileSparator = System.getProperty("file.separator");
	private String downloadFolderPath = fileSparator + "Users" +fileSparator + "Dimitris" +fileSparator +"Desktop" +fileSparator +"Downloads";
	
	private File defaultDownloadFolder = new File(downloadFolderPath);
	
	public DownloadManager(String link) {
		this.link = link;
		
		if(!defaultDownloadFolder.exists()) {
			defaultDownloadFolder.mkdir();
		}
	}

	@Override
	public void run() {
		
		try {
			URL url = new URL(link);
			HttpURLConnection hConnection = (HttpURLConnection) url.openConnection();
			
			// Inputstream arbeitet immer mit Byte
			BufferedInputStream bufferedInputStream = new BufferedInputStream(hConnection.getInputStream());
			
			// Datei schreiben / erstellen
			outputFile = new File(defaultDownloadFolder, "datei.mp3");
			OutputStream outputStream = new FileOutputStream(outputFile); // In welcher Datei soll es gespeichert werden
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 1024); // 1024 Byte = 1KByte = Groesse des Pufferspeichers
			
			byte[] buffer = new byte[1024];
			int downloaded = 0; // Wie viel byte ist gesamt geladen worden?
			int readByte = 0; // Wie viele byte sind aktuell geladen?
			
			while((readByte = bufferedInputStream.read(buffer, 0, 1024)) >= 0) {
				bufferedOutputStream.write(buffer, 0, readByte);
				downloaded += readByte;
				
				System.out.println("Bereits " +downloaded + " Byte " + " geladen");
			}
			bufferedOutputStream.close();
			bufferedOutputStream.close();
			System.out.println("Download erfolgreich");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
