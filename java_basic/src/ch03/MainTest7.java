package ch03;

// 수입하다 
import java.util.Scanner;

public class MainTest7 {
	
	// 코드의 시작점 (메인 쓰래드) 
	public static void main(String[] args) {
		
		// 삼항 연산자 
		// 조건식 ? 결과1 : 결과2
		
		int num1 = (5 > 1) ? 10 : 20; 
		//System.out.println(num1);
		
		// JDK 
		int max = 0; 
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요");
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("입력 1 : ");
		int x = sc.nextInt(); 
		System.out.println("입력 2 : ");
		int y = sc.nextInt();
		
		double a = sc.nextDouble(); 
		System.out.println(" a  값 출력 : " + a);
		
		max = (x > y) ?  x : y; 
		
		// 화면에 큰 수를 출력하고 싶다 !!! (사용자가 입력 값을) !!! 
		System.out.println("사용자가 입력한 값 x와 y에 갑중에 큰 수는 " + max + " 입니다");
		
		
		

	} // end of main 

} // end of class 
