package ch03;

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
	
	// 내부 클래스 
	class MyDrawPanel extends JPanel {
		
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
		new MyFrame2();

	}

}
