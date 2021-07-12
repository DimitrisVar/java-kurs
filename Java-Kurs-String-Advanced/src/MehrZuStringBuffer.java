
public class MehrZuStringBuffer {

	// Neben String gibt es den Datentypen (Klasse) Stringbuffer
	// Beim String wird immer ein neuer String erstellt, beim Stringbuffer
	// werden die Aenderungen an demselben Objekt duchgefuehrt
	
	public static void main(String[] args) {
		
		// Merke: String erzeugt oder veraendert - > Es wird immer ein neuer String erstellt, weil String immutable sind
		// Merke: StringBuffer erzeugt oder veraendert -> Es ist immer das selbe Objekt
		

		StringBuffer teStringBuffer = new StringBuffer("Hallo");
		System.out.println(teStringBuffer);
		
		teStringBuffer.append(", Wilkommen in ... ");
		System.out.println(teStringBuffer);
		
		teStringBuffer.setCharAt(10, 'l');
		System.out.println(teStringBuffer);
		
		StringBuilder stringBuilder = new StringBuilder("hallo"); // Wie StringBuffer nur erst ab der Version 5
		StringBuilder stringBuilder2 = new StringBuilder(10);
		System.out.println(stringBuilder2);
		
		stringBuilder2.append("Hallo...");
		System.out.println(stringBuilder2);
		
		stringBuilder2.insert(5, '!');
		System.out.println(stringBuilder2);
		
		// Beispoiel vom Nachteil String:
		// Es dauert so lange weil in jedem Schleifendurchgang ein neues String Objekt erstellt wird
		
		long timeStart = System.currentTimeMillis();
		
		String str = "";
		for(int i = 0; i < 5000; i++) {
			str += i;
			System.out.println(str);
		}
		
		long timeEnd = System.currentTimeMillis();
		
		System.out.println("Zeit der Schleife mit String: "+(timeEnd-timeStart));
		
		// Zeit der Schleife mit String: 1330
		
		// Hier das Beispiel mit einem Stringbuffer
		
		long timeStart2 = System.currentTimeMillis();
		StringBuffer str1 = new StringBuffer();
		for(int i = 0; i < 5000; i++) {
			str1.append(i);
			System.out.println(str1);
		}
		
		long timeEnd2 = System.currentTimeMillis();
		System.out.println("Zeit der Schleife mit StringBuffer: "+(timeEnd2-timeStart2));

	}

}
