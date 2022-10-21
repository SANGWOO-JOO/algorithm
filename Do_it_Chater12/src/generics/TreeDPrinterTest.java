package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		
		Powder powder =printer.getMaterial();
	
		System.out.println(printer);
		
		
		TreeDPrinter<Plastic> pla = new TreeDPrinter<Plastic>();
		pla.setMaterial(new Plastic());
		
		Plastic plastic =pla.getMaterial();
	
		System.out.println(pla);
	}

}
