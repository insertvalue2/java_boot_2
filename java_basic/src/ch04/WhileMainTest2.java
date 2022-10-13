package ch04;

public class WhileMainTest2 {
	
	// 코드의 시작점 (메인 쓰래드) 
	public static void main(String[] args) {
		
		/*
		while(조건식) {
			수행문; 
		}
		
		do {
			수행문; 
		} while(조건식); 
		
		*/
		
		int num = 1; 
		int sum = 0; 
		// 1 + 2 + 3 .... 10 
		
		// 10 + 9 + 8 ... 1
		do {
			System.out.println(" 현재 값 : " + num);
			sum += num; 
			num++;
		} while(num <= 10);

		System.out.println("sum에 대한 결과값은 : " + sum);
		
		// 문제 1 
		int input = 10; 
		int inputSum = 0; 
		// do while 문을 활용해서 
		// 10 + 9 + 8 .... 1 에 대한 연산을하고 화면에 출력해주세요 
		// do while 반드시 한번은 수행이 되어야 할 때 사용하는 구문 입니다. 
		
		do {
			// 10 + 9 + 8 + 7 ... = 55
			// 0           =  0              + 10  = 10
			// 10         =     10          +  9   = 19
			// 19         =   19            +  8   = 27 
			inputSum = inputSum + input;
			input--; // 9 , 8  
		} while(input != 0); 
		
		// .. 식 작성 
		System.out.println("inputSum의 결과값 : " +  inputSum);
		
	} // end of main 

}
