package ch08;

public class MainTest3 {
	
	// 메인 함수 
	public static void main(String[] args) {
			
		Bus bus100 = new Bus(100);
		bus100.take(900);
		bus100.showInfo();
		
		bus100.take(1300);
		bus100.showInfo();
		
		bus100.take(1300);
		bus100.showInfo();
		
		
		bus100.takeOff(3);
		bus100.showInfo();

	} // end of class 

}
