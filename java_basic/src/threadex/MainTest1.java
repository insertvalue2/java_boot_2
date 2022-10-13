package threadex;

public class MainTest1 {

	// 코드의 시작점(메인쓰래드)
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("-");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // end of main 

} // end of class 
