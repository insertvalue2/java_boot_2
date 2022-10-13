package io_ex.ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentMainTest2 {

	public static void main(String[] args) {
		
		// 기반 스트림 준비 + 보조 스트림  
		FileInputStream fis = null; 
		ObjectInputStream ois = null; 
		
		try {
			fis = new FileInputStream("fos.txt");
			ois = new ObjectInputStream(fis);
			 
			Student s1 = (Student)ois.readObject(); 
			System.out.println(s1.toString());
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}

}
