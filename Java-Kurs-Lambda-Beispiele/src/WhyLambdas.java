import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class WhyLambdas {

	public static void main(String[] args) {
		Integer [] numbers = {5,11,17,3,1,100,300,120};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		
		// Comparator<Integer> myComparator = new MyComparator();
		// Arrays.sort(numbers); // sortiert: klein -> gross
		// Arrays.sort(numbers, myComparator);
		
//		// Anonyme Klasse
//		Arrays.sort(numbers, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2 - o1;
//			}
//			
//		});
//		
//		// Ein Lambda wird immer dann verwendet, 
//		// wenn ein funktionales Interface* implementiert wird.
//		// * funktionales Interface = Interface mit nur einer Methode
//		
//		// Lambda
//		// Syntax: (Parameter) -> {       }
//		Arrays.sort(numbers, (a,b) -> b-a);
//		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		// foreach Schleife
		List<String> itemStrings = new ArrayList<>();
		itemStrings.add("Einkaufen");
		itemStrings.add("Sport");
		itemStrings.add("Uni lernen");
		itemStrings.add("Freunde treffen");
		itemStrings.add("Freund anrufen");
		
		itemStrings.forEach(new Consumer<String>() { // Comsumer ist ein funktionales Interface

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// Algemeine Syntax: (Parameter) -> {     }
		itemStrings.forEach((String t) -> {
			System.out.println(t);
		});
		
		// Lambda vereinfacht
		itemStrings.forEach((t) -> {
			System.out.println(t);
		});
		
		// Lambda vereinfacht
		itemStrings.forEach(t -> {
			System.out.println(t);
		});
		
		// Lambda vereinfacht
		itemStrings.forEach(t -> System.out.println("Test: " +t ));
	}
}
