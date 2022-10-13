package data_stureture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class MainTest4 {

	public static void main(String[] args) {
		// System.out.println(getRandomNumber());

		HashSet<Integer> hashSet = new HashSet<>();

		// 2.set계열에 데이터를 저장해보기

		boolean flag = true;
		while (flag) {
			if (hashSet.size() < 6) {
				hashSet.add(getRandomNumber());
			} else {
				flag = false;
			}
		}
		
        //Arrays.sort(hashSet.toArray());
		List<Integer> list = new ArrayList<>();
		list.addAll(hashSet);
		list.sort(null);
	    System.out.println(list);
	}

	// 1. 랜덤한수 뽑기 1 ~ 45까지
	public static int getRandomNumber() {
		Random random = new Random();
		int resuslt = random.nextInt(45) + 1;
		return resuslt;
	}

}
