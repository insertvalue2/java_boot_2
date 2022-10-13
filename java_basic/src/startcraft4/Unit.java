package startcraft4;

public abstract class Unit {
	
	protected String name;
	protected int power;
	protected int hp;

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

//	// 마린을 공격 합니다.
//	public void attack(Marine marine) {
//		System.out.println(this.name + " 이 " + marine.getName() + " 을 공격합니다.");
//		// 질럿에 공격력 this.power
//		marine.beAttacked(this.power);
//	}
//
//	// 저글링 공격 합니다.
//	public void attack(Zergling zergling) {
//		System.out.println(this.name + " 이 " + zergling.getName() + " 을 공격합니다.");
//		// 질럿에 공격력 this.power
//		zergling.beAttacked(this.power);
//	}
//
//	// 질럿을 공격 합니다.
//	public void attack(Zealot zealot) {
//		System.out.println(this.name + " 이 " + zealot.getName() + " 을 공격합니다.");
//		// 질럿에 공격력 this.power
//		zealot.beAttacked(this.power);
//	}

	// 공격을 당합니다.
	public void beAttacked(int power) {
		this.hp -= power;
		if (hp <= 0) {
			System.out.println(this.name + "은 사망하였습니다");
			hp = 0;
		}
	}

	public void showInfo() {
		System.out.println("========= 정보창 ==========");
		System.out.println(" 이름 : " + name);
		System.out.println(" 공격력 : " + power);
		System.out.println(" 생명력 : " + hp);
	}

}
