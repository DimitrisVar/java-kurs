import java.util.Iterator;

public class Counter implements Runnable {

	// Eigenschaften
	private long Counter = 0;
	private boolean isColorOnOff = true;
	
	@Override
	public void run() {
		
		Thread thread = Thread.currentThread();
		for(long count = 0; count <= 100; count++) {
			System.out.println(thread + "Count: " +count);
		}
		
	}
	

}
