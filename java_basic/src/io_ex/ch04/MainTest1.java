package io_ex.ch04;

import java.io.FileReader;

/**
 * 
 * @author ITPS
 *	 Reader -  
 *  문자 단위 입력 스트림 
 */
public class MainTest1 {

	public static void main(String[] args) {
		
		// 1byte 씩 inputStream 
		// 2바이트씩 - 영어.. 한글, 중국어, 일본어  
		try(FileReader fr = new FileReader("reader_1.txt")) {
			//System.out.println((char)fr.read());
			int i;
			while( (i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			
		}
		
	}

}
