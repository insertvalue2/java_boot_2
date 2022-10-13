package ch11;

public class NumberPrinter {
	
	private int id;
	private static int waitNumber;
	
	public NumberPrinter(int id) {
		this.id = id; 
		this.waitNumber = 1; 
	}
	
	// 번호표를 출력 합니다. 
	public void printWaitNumber() {
		System.out.println(id +  " 기기의 대기 순번 " + waitNumber);
		waitNumber++;
	}
	
	public static void main(String[] args) {
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		// 왼쪽 기계 
		numberPrinter1.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter1.printWaitNumber();
		
		
		
		
		
			
		// 오른쪽 기계 
//		numberPrinter2.printWaitNumber();
//		numberPrinter2.printWaitNumber();
//		numberPrinter2.printWaitNumber();
		
		
	}
	
}
