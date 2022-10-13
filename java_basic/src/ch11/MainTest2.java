package ch11;

public class MainTest2 {

	public static void main(String[] args) {
		// NumberPrinter2.id = 10; 
		NumberPrinter2.waitNumber = 10;
		System.out.println(NumberPrinter2.waitNumber);
		
		NumberPrinter2.getWaitNumber();
		
		NumberPrinter2 printer2 = new NumberPrinter2(1);
		printer2.printWaitNumber(); 
		printer2.id = 1; 
		System.out.println(printer2.id);
		
		printer2.getWaitNumber();
	}

}
