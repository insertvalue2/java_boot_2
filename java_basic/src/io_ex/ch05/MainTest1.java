package io_ex.ch05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author ITPS
 *	Reader 
 * 문자 단위 입력 스트림 
 * 파일에서 라인 단위로 문자 읽기 
 */
public class MainTest1 {

	public static void main(String[] args) {
		
		
		int count = 0; 
		try {
			File file = new File("mytext_1");
			FileReader reader = new FileReader(file); // 기반 스트림 + 보조 스트림(한줄씩 읽게) 
			BufferedReader  bufferedReader = new BufferedReader(reader);
			// 보조 스트림 생성시 매계변수로 기반스트림을 넣고 있다. 
			String line; 
//			while( (line = bufferedReader.readLine()) != null ) {
//				System.out.println(line);
//				count++;
//			}
			int i = 0; 
			while( (i = reader.read()) != -1 ) {
				System.out.println((char)i);
				count++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("반복 횟수 : " + count);
	}

}
