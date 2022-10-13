package startcraft2;

public class GateWayMainTest {

	public static void main(String[] args) {
		
		GateWay gateWay1 = new GateWay();
		GateWay gateWay2 = new GateWay();
		
		Zealot zelot1 =  gateWay1.createZealot();
		Zealot zelot2 =  gateWay1.createZealot();
		Zealot zelot3 =  gateWay2.createZealot();
		Zealot zelot4 =  gateWay2.createZealot();
		Zealot zelot5 =  gateWay1.createZealot();
		
		System.out.println(GateWay.zealotTotalCount);
		
		// 질럿이 총 몇마리 생성 되었는가를 데이터로 저장해서 관리하고 싶다면 
		zelot1.attack(zelot2);
		

	}

}
