package ch13;

public class MainTest5 {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(); 
		// customer1.  : 보너트포인트 보임, 보너스비율 보임 , customerGrade 보임 
		
		Customer customer2 = new VIPCustomer();  // 업 캐스팅 상태 
		 ((VIPCustomer)customer2).salesRatio = 10;  // 다운 캐스팅해서 접근해야 한다. 
		
		double b = 10.0;
		int a = (int)b;
		 
		// customer2.  : 보너트포인트 보임, 보너스비율 보임, customerGrade 보임
		
		VIPCustomer vipCustomer1 = new VIPCustomer();
		// vipCustomer1.  : 보너트포인트 보임, 보너스비율 보임,  customerGrade 보임, salesRatio
		
	}

}
