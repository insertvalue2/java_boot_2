package ch04;

public class ForMainTest2 {

	// 코드의 시작점 (메인함수, 메인쓰래드)
	public static void main(String[] args) {
		
		// 첫 시작과 끝에는 ============= 표시 하지 마시오
		 for(int num = 2; num <= 9;  num++) {
				for (int i = 1; i < 10; i++) {
					System.out.println(num + "  *  " + i + " = " + (num * i));
				}
				// 5 단과 6단 사에 =========== 값을 출력 마시오
				
				// break, continue 
				
				// 단 예약어 
				if(num != 9) {
					System.out.println("===========");
				}
				
		 }

	}
}
// end of class
