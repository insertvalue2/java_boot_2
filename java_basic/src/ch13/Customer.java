package ch13;

public class Customer {
	
	private int customerID;
	private String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public void setCustomerName(String name) {
		this.customerName = name; 
	}
	
	public void setCustomerID(int id) {
		this.customerID = id;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다";

	}

}
