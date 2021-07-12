import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		// Single Array
		// Index = Anzahl der Elemente in einem Array -1
		
		int [] array = new int[10];
		
		// Werte hinzufuegen
		array[0] = 0;
		array[1] = 10;
		array[2] = 20;
		array[3] = 30;
		array[4] = 40;
		array[5] = 50;
		array[6] = 60;
		array[7] = 70;
		array[8] = 80;
		array[9] = 90;
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Index: " +i + " Inhalt: " +array[i]);
		}
		
		System.out.println("-------------------");
		
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70};

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Index: " +i + " Inhalt: " +numbers[i]);
		}
	}

}
