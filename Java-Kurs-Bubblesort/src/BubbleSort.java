
public class BubbleSort {

	public static void main(String[] args) {
		
		int [] zahlen = {12,234,1,2,5,100,600,200};
		printArray(zahlen);
		
		int [] sortiert = bubbleSort(zahlen);
		printArray(sortiert);

	}
	
	public static int [] bubbleSort(int[] numbers) {
		int temp;
		
		for(int i = 0; i < numbers.length -1; i++) {
			for(int j = 0; j < numbers.length -1; j++) {
				System.out.println("Durchgang aussen Schleife: " +i +" Innere Schleife: " +j);
				
				if(numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		
		return numbers;
	}
	
	public static void printArray(int numbers []) {
		int n = numbers.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
