package io_ex.ch05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainTest3 {

	public static void main(String[] args) {
		
		Student s1 = new Student("티모", 50, "1234");
		Student s2 = new Student("야스오", 150, "22");
		Student s3 = new Student("애쉬", 10, "1333");
		
		FileOutputStream fos =  null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			fos = new FileOutputStream("temp3.txt");
			objectOutputStream = new ObjectOutputStream(fos);
			//objectOutputStream.defaultWriteObject();
			objectOutputStream.writeObject(s1.name);
			objectOutputStream.writeObject(s1.age);
			objectOutputStream.writeObject(s1.tel);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				objectOutputStream.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
