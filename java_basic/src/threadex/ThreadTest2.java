package threadex;

// 1. 쓰래드를 생성하는 첫번째 방법 (상속을 이용하기) 
class MyThread1 extends Thread {
	
	String name; 
	
	public MyThread1(String name) {
		this.name = name;
	}
	
	// 새로운 작업자한테 일을 시킬려면 특정한 메소드 안에서 코드를 해주어야 한다. 
	// 약속 
	@Override
	public void run() {
		int i; 
		for (i = 0; i < 50; i++) {
			System.out.println(this.name + " :  " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
} // end of MyThread1





public class ThreadTest2 {
	
	// 메인 쓰래드
	public static void main(String[] args) {
		System.out.println("현재 쓰래드 정보 얻기 : " +  Thread.currentThread());
		System.out.println("메인쓰래드가 화면에 글자를 출력합니다.");
		MyThread1 thread1 = new MyThread1("서브작업자1");
		// 메인작업자가 서브 작업자한테 일을 시작해 =  (run() 메서드를 호출하면 된다)
		//thread1.run();
		thread1.start();
		MyThread1 thread2 = new MyThread1("서브 작업자2");
		//thread2.run();
		thread2.start();
		
		MyThread1 thread3 = new MyThread1("서브작업자3");
		thread3.start();		
		System.out.println("메인쓰래드(메인작업자) 일 종료");
		// 동시에 일을 시켤려면 start메서드를 사용하면 된다. 
	}
}

// 서브 작업자를 만들어내는 방법
// run() 이라는 메소드 안에 일을 구현해놓으면 된다. 

// 일을 동시에 시키는 방법
// start 라는 메서드를 호출하면 된다. 




