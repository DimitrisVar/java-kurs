import java.util.Comparator;

public class MyComparator implements Comparator<Integer>{ // funktionales Interface

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	} 

	
	

}
