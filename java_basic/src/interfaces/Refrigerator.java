package interfaces;

public class Refrigerator extends HomeAppliances  {

	@Override
	public void turnOn() {
		System.out.println("냉자고를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 켭니다");
	}
	
}