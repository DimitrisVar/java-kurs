import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

public class InputOutput {

	public static void main(String[] args) throws IOException {
		
		// InputStream = Lesen einer Datei
		// OutputStream = Schreiben in eine Datei
		
		InputStream inputStream = null;
		
		File file = new File("C:\\Users\\Dimitris\\Desktop\\test.txt");

		int i;
		char c;
		
		try {
			inputStream = new FileInputStream(file);
			
			while((i = inputStream.read()) != -1) {
				c = (char) i; // Byte in Zeichen umwandeln
				System.out.print(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Stream immer schliessen!!
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		OutputStream outputStream = null;
		
		String name = "Dimitris Var";
		
		
		try {
			outputStream = new FileOutputStream(file);
			outputStream.write(name.getBytes()); // getBytes wandelt den den Ihnalt der Variable name in Bytes um
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			outputStream.close();
		}
		
		// Mehrere Dateien lesen
		File file2 = new File("C:\\Users\\Dimitris\\Desktop\\test2.txt");
		File file3 = new File("C:\\Users\\Dimitris\\Desktop\\test3.txt");
		
		InputStream iStream2 = null;
		InputStream iStream3 = null;
		SequenceInputStream sInputStream = null;
		
		OutputStream fOutputStream = new FileOutputStream("C:\\Users\\Dimitris\\Desktop\\test4.txt");
		
		int i;
		char c;
		
		try {
			iStream2 = new FileInputStream(file2);
			iStream3 = new FileInputStream(file3);
			
			sInputStream = new SequenceInputStream(iStream2, iStream3);
			
			while((i = sInputStream.read()) != -1) {
				c = (char) i;
				System.out.print(c);
				
				fOutputStream.write(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			iStream2.close();
			iStream3.close();
			sInputStream.close();
			fOutputStream.close();
		}
	}

}
