
public class Main {

	public static void main(String[] args) {
		
		Kuchen kuchen = new Kuchen();
		
		Teig teig = new Teig();
		Glasur glasur = new Glasur();
		
		Kuchen kuchen2 = new Kuchen(teig, glasur);
	}

}
