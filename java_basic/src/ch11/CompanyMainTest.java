package ch11;

import java.util.Calendar;

public class CompanyMainTest {
	
	// 코드의 시작점(메인 함수) 
	public static void main(String[] args) {
		
		 Company company1 = Company.getInstace();
		 Company company2 = Company.getInstace(); 
		 Company company3 = Company.getInstace(); 
		 
		 System.out.println(company1);
		 System.out.println(company2);
		 System.out.println(company3);
		 
		 company1.cId = 1; 
		 
		 System.out.println(company2.cId);
		 
		 
		 Calendar calendar = Calendar.getInstance();
		 System.out.println(calendar.getTimeInMillis());

	}

}
