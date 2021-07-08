import java.util.Iterator;

public class JavaThread {

	public static void main(String[] args) {
//		Thread thread = new Thread(new SecondThread());
//		thread.start();
//		
//		Thread thread2 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		
//		Thread thread3 = new Thread(() -> {
//			// Aufgabe der Abteilung 3
//		});
//		
//		thread3.start();
		
		Thread thread = new Thread(new Counter(), "First");
		thread.start();
		
		Thread thread2 = new Thread(new Counter(), "Second");
		thread2.start();
		

//		for(int i = 0; i <= 100; i++) {
//			System.out.println("i " +i);
//		}
//
//		for(int j = 0; j <= 100; j++) {
//			System.out.println("j " +j);
//		}

	}

}
