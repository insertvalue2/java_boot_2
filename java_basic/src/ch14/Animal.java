package ch14;

// 다형성 개념 : 클래스를 다양한 형태로 바라볼 수 있는 개념 - 배 

// 추상 클래스... 
public class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		
	}
	
} // end of Animal class 

class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
} // end of Human class 


class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 날아 갑니다.");
	}
	
}






