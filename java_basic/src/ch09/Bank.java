package ch09;

public class Bank {
	
	// 정보 은닉 
	private int balance; 
	private String name; 
	// getter
	// 
	public int getBalance() {
		return this.balance; 
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBalance(int money) {
		if(money <= 0) {
			System.out.println("잘못된 입력 입니다");
		} else {
			this.balance = money;	
		}
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	
	// 입금 
	public void deposit(int money) {
		this.balance += money;
	}
	
	// 출금
	public void withdraw(int money) {
		// 방어적 코드 !! 
		this.balance -= money;
		showInfo();
	}
	
	private void showInfo() {
		System.out.println("현재 계좌에 잔액은 : " + balance + " 입니다.");
	}
	
}
