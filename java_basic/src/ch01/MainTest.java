package ch01;

public class MainTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		// 형 변환 (데이터 타입을 변환 한다) 
		System.out.println((int)ch1);
		
		char ch2 = 'F';
		System.out.println((int)ch2);
		System.out.println("==============");
		char ch3 = 66;
		System.out.println(ch3);
		
		// 문제 
		// 안녕하세요를 정수형으로 변환하고 출력해보세요 
		
		System.out.print('안'); 
		System.out.print('녕');
	}

}
