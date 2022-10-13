package interfaces2;

// 자바는 다중 상속을 지원하지 않습니다. 
//  네발달린짐승 클래스, 사자, 강자지 (상속 3)    
// 사람이 extend 네발달린짐승 클래스, 사자, 강자지 (상속 3)
// 사람 클래스에서 울다 
public class Televison extends HomeAppliances implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
}
