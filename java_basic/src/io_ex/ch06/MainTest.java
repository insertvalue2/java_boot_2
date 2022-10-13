package io_ex.ch06;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MainTest {
	public static final String FILEPATH = "member.dat";
	
	public static void main(String[] args) {
		try (OutputStream out = new FileOutputStream(FILEPATH);
				ObjectOutputStream oout = new ObjectOutputStream(out);
				InputStream in = new FileInputStream(FILEPATH);
				ObjectInputStream oin = new ObjectInputStream(in);) {

			Member m1 = new Member("root", "root1234");
			oout.writeObject(m1);
			Member m2 = new Member("guest", "guest");
			oout.writeObject(m2);
			Member m3 = new Member("admin", "admin12456");
			oout.writeObject(m3);

			Member dataRead;
			
			/* 방법 1 : 매번 readObject() 호출
			dataRead = (Member) oin.readObject();
			dataRead.displayInfo();
			dataRead = (Member) oin.readObject();
			dataRead.displayInfo();
			dataRead = (Member) oin.readObject();
			dataRead.displayInfo();
			*/
			
			/* 방법 2 : 무한 루프로 readObject() 호출하고, EOFException으로 종료
			EOFException으로 끝까지 read한 것을 체크한다. */
			while (true) {
				dataRead = (Member) oin.readObject();
				dataRead.displayInfo();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 끝");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
