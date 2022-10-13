package io_ex.ch01;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class MainTest1 {
	
	public static PrintStream out; 
	public static InputStream in; 
	public static PrintStream err; 
	
	public static void main(String[] args) {
		// 표준 입출력 스트림  
		
		// 모니터에 출력하는 스트림 
		// 출력 스트림 (모니터) 
		System.out.print("출력 스트림(모니터)");
		
		// 입력 스트림 (키보드)
		// System.in;
		// 키보에 값을 입력 받는 입력 스트림 
		try {
			int k = System.in.read();
			System.out.println("k : " + k);
			System.out.println("k : " + (char)k);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}



