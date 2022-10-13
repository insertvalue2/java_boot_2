package startcraft2;

public class D {
	
	int numberId = 100; 
	
	public D() {
		System.out.println("D 클래스를 메모리에 올려서 객체화 했습니다.");
	}
	
	public void showInfo() {
		System.out.println("여기는 d 클래스에 메서드 showInfo 입니다.");
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println("===============");
		// System.out.println(a.b);
		// System.out.println(a.b.c);
		// System.out.println(a.b.c.d);
		a.b.c.d.showInfo();
		System.out.println("===============");
		// 메인 함수안에 지역변수를 선언(변수명은 temp)해서 
		// D 클래스(객체) 안에 있는 멤버 변수 numberId 저장하고 
		// 화면에 temp 를 출력해서 확인하세요
		
		
	}

}
