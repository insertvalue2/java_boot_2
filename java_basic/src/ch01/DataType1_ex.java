package ch01;

public class DataType1_ex {
		
	// 코드의 시작점 
	public static void main(String[] args) {
		
		// 데이터 타입에 종류 크게 2가지 
		// 1. 기본 데이터 타입 (primitive Type) 
		// 2. 참조 타입 (Reference Type)
		
		// 기본 데이터 타입에 종류 
		byte b; // 1바이트 크기(8bit) 
		short s; // 2바이트 크기 (16bit) 
		int i; // 4바이트크기(32bit) 
		long l; // 8바이트크기(64bit) 
		
		// b = 128;
		b = 127; 
		b = -128; 
		
		
		// i = 21000000000;
		// 접사를 사용해야 한다. (대소문자 사용가능 권장은 대문자)  
		l = 21000000000L;
		l = 21000000000l; 
		
		
		// 
		double dou = 10.0;
		float fot = 11.0F;
		
		// 기본 연산자 : 정수 (int) , 실수 (double) 
		
		
	} // end of main 

} // end of class 

// 블록에 유효 범위는 절대적이다. 
