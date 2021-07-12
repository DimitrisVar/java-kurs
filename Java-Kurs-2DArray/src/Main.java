import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		// 2d Array -> entspricht einer Tabelle mit Zeilen und Spalten
		// [Zeile] [Spalte]
		// Index = Anzahl -1
		
		int[][] array2D = new int[3][3]; // 3 Zeilen * 3 Spalten = 9 Felder
		
		array2D[0][0] = 30;
		array2D[0][1] = 40;
		array2D[2][1] = 543;
		array2D[1][1] = 2;
		
		System.out.println("Laenge: " +array2D.length);
		
		for (int zeile = 0; zeile < array2D.length; zeile++) {
			for (int spalte = 0; spalte < array2D.length; spalte++) {
				System.out.print(array2D[zeile][spalte] + "\t" );
				
			}		
			System.out.println();
		}
	}
}
