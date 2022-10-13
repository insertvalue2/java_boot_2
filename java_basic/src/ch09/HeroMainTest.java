package ch09;

public class HeroMainTest {

	public static void main(String[] args) {
		
		Hero hero = new Hero();
		Hero hero2 = new Hero();
		// 2글자 (아디 생성시 3글자) 
		hero.setName("홍");
		System.out.println(hero.getName());
		
		// String 클래스는 참조 타입? 0 (클래스)
		String temp = new String("반가워");
		// 문자열 
		// 특별하게 변하게 사용하라고 "반가워"
		System.out.println(temp);
		String temp2 = "반가워";
		System.out.println(temp2);
		System.out.println("-----------");
		System.out.println(hero);
		System.out.println(hero2);
		if (temp == temp2) {
			System.out.println("주소값이 같습니다.");
		}  else {
			System.out.println("주소값이 다릅니다.");
		}
		
	}

}
