package ch11;

public class NumberPrinter2 {
	
	public int id;
	public static int waitNumber;
	
	public NumberPrinter2(int id) {
		this.id = id; 
		this.waitNumber = 1; 
	}
	// static 메서드 안에서는 멤버 변수를 활용 할 수 없다. 
	// 객체가 메모리에 올라 갔다는라는 보장을 하지 못하기 때문이다. 
	public static int getWaitNumber() {
		// id = 100; 
		return waitNumber; 
	}
	
	// 번호표를 출력 합니다. 
	public void printWaitNumber() {
		System.out.println(id +  " 기기의 대기 순번 " + waitNumber);
		waitNumber++;
	}
	
}
