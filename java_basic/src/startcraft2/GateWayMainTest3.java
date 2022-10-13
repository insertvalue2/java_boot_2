package startcraft2;

public class GateWayMainTest3 {

	public static void main(String[] args) {
		
		// 배열은 : 연관된 데이터 타입을 하나에 변수에 통으로 관리 하기위한 데이터 타입 입니다.
		// 배열은 보통 반복문과 함께 많이 사용 됩니다. 
//		int[] intArr = new int[3];
//		
//		
//		
//		Zealot[] zealots = new Zealot[30];
//		System.out.println(zealots.length);
//		for(int i = 0; i < zealots.length; i++ ) {
//			zealots[i] = new Zealot("질럿" + (i + 1));
//		}
//		
////		zealots[0] = new Zealot("질럿1");
////		zealots[1] = new Zealot("질럿2");
////		zealots[2] = new Zealot("질럿3");
//		
//		for(int i = 0; i < zealots.length; i++) {
//			// 0 
//			System.out.println(zealots[i].getName());
//			System.out.println(zealots[i].getHp());
//			System.out.println(zealots[i].getPower());
//			System.out.println("---------------------");
//		}
		
		
		 GateWay gateWay1 = new GateWay(); 
		 // 5번 질럿 생산하기
		 
		 Zealot[] zealotArr = new Zealot[5];
		 for(int i = 0; i < zealotArr.length; i++) {
			 zealotArr[i] = gateWay1.createZealot(); 
		 }
	}

}
