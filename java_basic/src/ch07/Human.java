package ch07;

public class Human {
	
	int height; 
	int weight; 
	String name;  // null 
	
	public Human() {
		// 기능 호출 
		this.showInfo();
		if (this.name == null) {
			System.out.println("값 입렵해주세요");
		}
	}
	
	public Human(int height, int weight) {
		this.height = height; 
		this.weight = weight; 
		name = "Tomas";
	}
	
	public Human(int height, int weight, String name) {
		this.height = height; 
		this.weight = weight; 
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("=== 상태창 ====");
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("이름 : " + name);
	}
	
}
