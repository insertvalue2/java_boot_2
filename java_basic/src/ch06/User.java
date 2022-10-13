package ch06;

public class User {
	//  변수, 함수, 메서드, 생성자
	// 클래스 영역에서는 식을 사용할 수 없다. 
	String id; 
	String password;
	// String checkPassword;
	String name; 
	String gender; 
	boolean isPasswordChecked = false; 
	int age; 
	
	public void join() {
		if( isPasswordChecked ) {
			System.out.println("회원 가입 성공");
			System.out.println( name + " 님이 회원가입 완료 되었습니다.");
		} else {
			System.out.println("회원 가입 실패");
			System.out.println("비밀번호를 먼저 체크 해주세요");
		}
		
	}
	
//	public void checkedPassword() {
//		// 문자열을 비교할 때는 무조건 equals 
//		if(password.equals(checkPassword)) {
//			System.out.println(" 비밀 번호가 일치 합니다.");
//		} else {
//			System.out.println(" 비밀 번호가 일치하지 않습니다.");
//		}
//	}
	
	public void checkedPassword(String inputPw) {
		// 문자열을 비교할 때는 무조건 equals 
		if(password.equals(inputPw)) {
			isPasswordChecked = true;  
		} else {
			isPasswordChecked = false; 
		}
	}
	
	public void showInfo() {
		System.out.println(".....");
	}
	
}
