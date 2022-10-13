package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	public static void main(String[] args) {
		
		System.out.println("성적을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt(); 
		char reslut = 'Z';
		// 비교 , 논리 연산를 활용해서 실행에 흐름을 만들어 주세요 
		// 1. 100 ~ 91  까지 A 학점입니다. 단 ( 논리곱 연산을 활용해 주세요)  
		// 2. 90 ~ 81  까지 B 학점입니다.
		// 3. 80 ~ 71  까지 C 학점입니다.
		// 4. F학점 입니다.
		// 100점보다 작거나 같다면 !! 
		if(  (point <= 100) && (point > 90) ) {
			reslut = 'A';
		} else if (  (point <= 90 ) && (point > 80) ) {
			reslut = 'B';
		} else if (  (point <= 80 )  && (point > 70) ) {
			reslut = 'C';
		} else if (point < 70 &&  point >= 0) {
			reslut = 'F';
		}
		
		// 방어적 코드 
		if(reslut != 'Z') {
			System.out.println(reslut + " 학점 입니다.");
		} else {
			System.out.println("잘못된 값을 입력 하였습니다.");
		}		
	}

}
