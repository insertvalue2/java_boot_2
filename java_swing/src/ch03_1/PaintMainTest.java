package ch03_1;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



// 외부 클래스 
class MyFrame2 extends JFrame {
	
	private MyDrawPanel drawPanel; 
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("paint 연습");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(drawPanel);
	}
	// 인스턴스 내부 클래스 
	// 내부 클래스 
	// 접근 제어 지시자를 설정할 수 있다. 
	
	// static 추가 하게 되면 정적 내부 클래스 한다.
	
	public static class MyDrawPanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(200, 200, 150, 150);
		}
	} // end of MyDrawPanel class
} // end of MyFrame2 class 



// public class 
public class PaintMainTest {

	public static void main(String[] args) {
		
		MyFrame2 frame2 = new MyFrame2();
		
		// --- 인스 턴스 내부클래스를 사용하는 방법 
		// 1 .  데이터 타입을 선언 방법  
		// 외부 클래스 이름으로 접근하고 . 연산자 후에 내부 클래스 데이터 타입을 선언하고 변수명을 지정
		
		// 2.  초기화 하는 방법
		// 외부 클래스가 생성되어 있고 참조 변수로 접근해서 new 내부클래(); 로 메모리에 올리 수 있다. 
		//MyFrame2.MyDrawPanel myPanel = frame2.new MyDrawPanel();
		
		
		// -- 정적 내부클래스를 사용하는 방법 
		MyFrame2.MyDrawPanel staticMyPanel = new MyFrame2.MyDrawPanel();

	}

}
