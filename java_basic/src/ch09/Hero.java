package ch09;

public class Hero {
	
	private String name; 
	private int hp; 
	private int power; 
	private double defense; 
	private int level;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() <= 2 ) {
			System.out.println("3글자이상 입력하시오");
		} else {
			this.name = name;
		}
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public double getDefense() {
		return defense;
	}
	public void setDefense(double defense) {
		this.defense = defense;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	} 
	
	// getter, setter 메서드를 만들어 주세요 
	// 단 setter 메서드에 방어적 코드를 넣어주세요 
	// setLevel 방어적 코드 0 보다 작은 수 입력을 막아 주세요  
	
	
	
}
