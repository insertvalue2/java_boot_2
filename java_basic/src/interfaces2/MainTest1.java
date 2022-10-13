package interfaces2;

import java.util.Random;

public class MainTest1 {

	public static void main(String[] args) {
		
		Random random;
		
		Televison televison = new Televison(); 
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot(); 
		ToyRobot robot2 = new ToyRobot(); 
		
//		televison.turnOn();
//		televison.turnOff();
//		System.out.println("=============");
//		refrigerator.turnOn();
//		refrigerator.turnOff();
//		System.out.println("=============");
//		robot.turnOn();
//		robot.turnOff();
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = televison;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = robot;
		remoteControllers[3] = robot2;
		
		// index 를 활용한  for 
		// 
		for (RemoteController a : remoteControllers) {
			a.turnOn();
			a.turnOff();
			System.out.println("---------------");
		}
		
		// 문제1  for - index 를 사용해서 전원을 전부 꺼주세요 
		
		// 문제2 
		// 배열을 활용해서 toy 에 name 값을 화면에 출력하시오 (반드시 for문을 사용해주세요) 
		// 1,  for 문에 대한 선택 (인덱스 연산이 필요 하나면 일반 for문을 사용)
		int result = 0;
		for (int i = 0; i < remoteControllers.length; i++) {
			  // 만약 주소값 타입 ToyRobot 이란 
//			 if(i % 3 == 0) {
//				 
//			 }
				if(remoteControllers[i] instanceof ToyRobot ) {
					System.out.println(((ToyRobot)remoteControllers[i]).name);
					result++;
				}
		}
		System.out.println("장난값 로봇은 " + result + " 개 있습니다.");
		
		
	    for (RemoteController remoteController : remoteControllers) {
			if(remoteController instanceof ToyRobot) {
				System.out.println(((ToyRobot) remoteController).name);
				((ToyRobot) remoteController).soundOn();
			}
		}
	    
	    // 인터페이스 
	    // 소리가 나는 기능을 추가 해주세요 
	    // 단 냉장고 띵띵띵 소리나게 
	    // 장난감 로봇은 뚜뚜뚜뚜 ~~~ 소리나게 
	    
	    
	    
	}
}
