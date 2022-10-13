package lambda_ex;

public class MainTest2 {

	public static void main(String[] args) {
		// 매개변수에 데이터 타입을 생략해도 됩니다. 
		// 람닥식으로 만들어 주세요 !!! 
		// 수행문에 한줄일 때 중괄호가 생략 가능하다. 
		IPrint iPrint = (a, token) -> System.out.println(a + token); // 람다식을 선언
		// 사용해보기
		iPrint.print1("홍길동", "ㅡ");
		iPrint.print1("이순신", " : ");
		iPrint.print1("야스오", ",");
		
		// 람다식 만들기 
		IPrint2 print2 = () -> {return "반가워";};
		System.out.println(print2.print2());
		System.out.println(print2.print2());
		System.out.println(print2.print2());
	}

}

@FunctionalInterface
interface IPrint {
	void print1(String a, String token);
	//void print2(String a, String token);
}

@FunctionalInterface
interface IPrint2 {
	String print2();
}





