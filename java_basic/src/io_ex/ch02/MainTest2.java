package io_ex.ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 
 * @author 김근호
 *	입력 스트림 - file 
 * 문자 단위로 사용
 *  1.7 버전이상 오토클로즈 !!!  
 */
public class MainTest2 {

	public static void main(String[] args) {
//		try {
//			
//		}
		try(FileInputStream fis = new FileInputStream("boot_a.txt")) {
			int i; 
			while( (i = fis.read()) != -1 ) {
				System.out.println((char)i);
				System.out.print(i);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

