package ch03;

public class MainTest6 {

		
	public static void main(String[] args) {
		
	 // 논리 연산자 ( &&, || ) 엠퍼센트, 버티컬 바 
	 // 관계 연산자와 혼합하여 많이 사용한다. 
	 // 연산에 결과 값은(반환값은) true, false

	int num1 = 10; 
	int num2 = 20; 
	
	// 논리곱 && 
	boolean flag1 = (num1 > 0) && (num2 > 0);	
	System.out.println(flag1);
	
	flag1 = (num1 > 0 ) && (num2 < 0);
	System.out.println(flag1);
	
	
	// 논리합 || 
	boolean flag2 = (num1 > 0 ) || (num2 > 0);
	System.out.println(flag2);
	
	flag2 = (num1 < 0 ) || (num2 < 0);
	System.out.println(flag2);
	
	
	// 논리곱 : 하나라도 거짓이 있으면 연산에 결과는 false 이다. 
	// 논리합 : 하나라도 참이 있으면 연산에 결과는 true 이다. 
	
	System.out.println("==================");
	System.out.println(!flag2);  // 부정 
	System.out.println(flag2);
	System.out.println("==================");
	boolean flag3 = !(5 > 3);
	System.out.println(flag3);
	
	//////////////////////////////////////////
	// short circuit 
	
	int n = 5; 
	int i = 0; 
	
//	boolean mValue = ( ( n = n + 10 ) > 10 )  &&  (  ( i = i + 2 ) < 10 );
//	System.out.println(n);
//	System.out.println(i);
//	System.out.println(mValue);
	
//	boolean mValue = ( ( n = n + 10 ) < 10 )  &&  (  ( i = i + 2 ) < 10 );
//	System.out.println(n);
//	System.out.println(i);
//	System.out.println(mValue);
	
	boolean mValue = ( ( n = n + 10 ) < 10 )  ||  (  ( i = i + 2 ) < 10 );
	System.out.println(n);
	System.out.println(i);
	System.out.println(mValue);
	
	// short circuit 문제를 직접 만들어서 카페에 올려 주세요 
	// 논리곱 문제 생성 
	// 논리합 문제 생성 
	

	} // end of main 

} // end of class 
