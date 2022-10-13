package ch13;

public class Cal {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		System.out.println("cal 메소드 호출1");
		System.out.println("cal 메소드 호출2");
		System.out.println("cal 메소드 호출3");
		System.out.println("cal 메소드 호출4");
		return n1 * n2;
	}

}

class Cal2 extends Cal {

	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	// 오버 라이드 != 오버로딩
	// 재정의한다 : 부모에 메서드를(이름, 매개변수) 재정의 한다
	
	// 주석 + 힌트 
	@Override   // 어노테이션 
	public int multiply(int n1, int n2) {
		if (n1 == 0 || n2 == 0) {
			System.out.println("0을 대입할 수 없습니다.");
		}
		  return super.multiply(n1, n2);
	}
	
	public int multiply(int n1, int n2, int n3) {
		return n1 * n2 * n3; 
	}
	
	

//	public int multiply(int n1, int n2) {
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0을 대입할 수 없습니다.");
//		}
//		return n1 * n2; 
//	}

}
