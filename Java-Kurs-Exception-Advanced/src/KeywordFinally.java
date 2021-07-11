import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class KeywordFinally {

	public static void main(String[] args) {
		
		try {
			int num = 121 / 0;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("Man kann durch 0 nicht teilen");
		} finally {
			System.out.println("Finale");
		}
	}
	
	public void readFile(String path) {
		File file = new File(path);
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
			
			while(fileInputStream.read() != -1) {
				System.out.println(fileInputStream.read());
			}
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
