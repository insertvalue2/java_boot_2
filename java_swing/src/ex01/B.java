package ex01;

import java.lang.reflect.Array;

 

public class B   {
	 
	int a = 10; 
	
	public B() {
		initData();
	}

	private void initData() {
		System.out.println("a 결과값  : " +  a);
		
	}
	
	public static void main(String[] args) {
		new B();
	}
	
}
