package ch07;

public class MainTest2 {
	
	// 코드의 시작점(메인 쓰래드) 
	public static void main(String[] args) {
		
		Human human = new Human(170,78);
		human.showInfo();
		
		Human human2 = new Human(170,78, "홍길동");
		human2.showInfo();
		
		Human human3 = new Human();
		
		
	} // end of main function 

}
