package ch05;

// 설계도를 만들었다. 
public class Student {
	
	 
	String name; // 멤버 변수 (참조 타입)   
	int height;  // 멤버 변수 (기본 데이터 타입)
	double weight; // 멤버 변수 (기본 데이터 타입) 
	
	 Order order; // 멤버 변수 (참조 타입) 
	 
	 // 메인 함수(코드의 시작점)  
	 public static void main(String[] args) {
				 
		 // 1. 화면에 바로 출력하는 방법 
		 // 2. 지역변수 생성해서 데이터를 잠시 보관 
		 System.out.println(intAdd(20, 30, 30));
		 int intAddResult = intAdd(10, 10, 30);
		 System.out.println(intAddResult + 100);
		
		 System.out.println(doubleAdd(10.0, 10.0, 10.0));
		 System.out.println(doubleAdd(10, 10, 10));
		 
		 double doubleResult = doubleAdd(20.0, 20.0, 20.0);
		 System.out.println(doubleResult);
		 System.out.println();
		 
		 // printArticle 리턴 타입 없다. 
		 // String s =  printArticle("안녕");
		 //System.out.println( printArticle("여기서 사용 해봄 !!! ") );
		 printArticle("반가워 ! ");
		 
		 // 함수에 활용 : 3 자리수 정수값 매번 덧셈해서 결과를 받아한 한다면 100 번 
		 
	 } 
	 
	 public static void addNum(int n1) {
		 int resuilt; // 지역 변수 (기본) 
		 UserInfo info; // 지역 변수 (참조) 
		 n1 = 10; // 지역 (매계 변수) 
	 }
	 
	 // 함수를 만들어 봅시다. 
	 // 1. 리턴값이 int, 매개변수 n1, n2, n3 이름은 intAdd
	 public static int intAdd(int n1, int n2, int n3) {
		 return n1 + n2 + n3; 
	 }
	 // 2. 리턴값 double, 매개변수 d1, d2, d3 이름은 doubleAdd
	 public static double doubleAdd(double d1, double d2, double d3) {
		 return d1 + d2 + d3; 
	 }
	 // 3. 리턴값 void, 매개변수 String article 이름은 printArticle 
	 public static void printArticle(String article) {
		 System.out.println("이 메소드를 호출하면 article값이 출력 " + article);
	 }
	 
	 
	 
	 
	 // 4. 1 ~ 3 까지 만든 함수를 직접 호출해 보세요 (Stack 메모리 구조)
	 
	
} // end of class 
