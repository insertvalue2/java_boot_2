package ch04;

import java.util.Random;
import java.util.Scanner;

public class WhileMainTest4 {
	
	// 코드의 시작점 (메인 쓰래드) 
	public static void main(String[] args) {
		
		// 스캐너를 활용해서 간단한 콘솔 게임 만들기 !!! 
		// 
		Random random = new Random();
		//                                ( 0 ~ 2 ) + 1 
		int randomResult = random.nextInt(5) + 1; // 0 1 2 --> 0 , : 1 2 3 
		System.out.println(randomResult);
		
		// 야구 게임 ( 사용자 한테 입력을 받아서 3번 안에 randomResult 값을 맞추는 게임 ) 
		
	} // end of main 

}
