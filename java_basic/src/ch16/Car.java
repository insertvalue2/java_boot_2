package ch16;

public abstract class Car {
	
	void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public abstract void wiper(); 

	public abstract void drive();

	public abstract void stop();
	
	// 후크 메서드 
	public void washCar() {}
	
	void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	// final - 상수 (변수 앞에) 
	// final - 메서드  (메서드 앞에)
	// 사용하는 이유 : 하위 클래스 재정의 할 수 없게 만든다
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}



