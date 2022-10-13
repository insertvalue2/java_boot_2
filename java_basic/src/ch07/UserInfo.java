package ch07;

public class UserInfo {
	
	String userId; 
	String userPassword; 
	String userName; 
	int age; 
	
	// 생성자 오버로딩 연습 
	
	// 기본 생성자 
	// public UserInfo() {}
	// 사용자 정의 생성자가 있으면 컴파일러는 기본 생성자를 
	// 만들어 주지 않는다. 
	public UserInfo(String userId) {
		// this 자기 자신을 의미 한다. 
		this.userId = userId; 
	}
	
	public UserInfo(String userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}
		
	public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId; 
		this.userPassword = userPassword; 
		this.userName = userName;
	}
	
	public UserInfo(String userId, String userPassword, String userName, int age) {
		this.userId = userId; 
		this.userPassword = userPassword; 
		this.userName = userName;
		this.age = age; 
	}
	
	
	
	
}




