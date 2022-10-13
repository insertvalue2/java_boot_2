package data_stureture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainTest5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList.size());
		for (int i = 1; i <= 45; i++) {
			arrayList.add(i);
		}
		Collections.shuffle(arrayList);
		System.out.println(arrayList);	


	}
}
