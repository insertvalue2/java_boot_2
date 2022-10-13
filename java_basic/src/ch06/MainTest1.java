package ch06;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 객체 : 메모리에 올라 갔을 때 객체라고 한다 (인스턴트 화) 
		Student studentKim = new Student(); 
		studentKim.studentName = "홍길동";
		studentKim.studentId = 1; 
		studentKim.address = "부산시 진구";
		
		// 기능 
		studentKim.showStudentInfo();
		studentKim.study();
		
		
		System.out.println("===================");
		Student studentLee = new Student(); 
		studentLee.studentName = "이순신";
		studentLee.studentId = 2;
		studentLee.address = "부산시 해운대구";
		studentLee.showStudentInfo();
		
		
		studentKim.study();
		studentLee.study();
		
		studentKim.breakTime();
		studentKim.cleanUp();

	}

}
