package ch20;

public class StringTest2 {

	public static void main(String[] args) {
		
		// 상수 풀에 한번 생성된 String 불변(immutable) 
		 
		String str1 = "abc"; // heap 메모리에 new 
		String str2 = "abc"; // 상수 풀 -   
		
		System.out.println(System.identityHashCode(str1));
		// "abcd"
		str1 =  str1 + "d";
		System.out.println(System.identityHashCode(str1));
		//System.out.println(str1 == str2);
		
		
		
	
		

	}

}
