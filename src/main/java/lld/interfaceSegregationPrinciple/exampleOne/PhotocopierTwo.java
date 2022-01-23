package lld.interfaceSegregationPrinciple.exampleOne;

public class PhotocopierTwo implements MultiFunctionDevice {
	
	//you can build a decorator pattern here and reuse printer and scanner as you already have them
	
	private Printer printer;
	
	private Scanner scanner;
	
	public PhotocopierTwo(Printer printer, Scanner scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void print(Document d) {
		printer.print(d);
	}

	@Override
	public void scan(Document d) {
		scanner.scan(d);
	}

}
