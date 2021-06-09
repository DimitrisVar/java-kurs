
public class Main {

	public static void main(String[] args) {
//		Mainboard m1 = new Mainboard();
//		
//		Computer cp1 = new Computer("Intel i10", m1, 600);
//		
//		System.out.println(cp1.mainboard);
		
		// Assoziation = Ein Objekt kennt ein anderes Objekt
		Mainboard mainboardAsus = new Mainboard(4, 2, 4);
		Computer computerPeter = new Computer("Intel", mainboardAsus, 400);
		
		System.out.println(computerPeter.mainboard.kartenSlots);
		
		Computer computerOlga = new Computer(2, 1, 2, "AMD");
		
		System.out.println(computerOlga.mainboard.ramSlots);
	}

}
