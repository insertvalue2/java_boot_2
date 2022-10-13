package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventListenerEx2 extends JFrame {

	JLabel label;
	final int LABEL_WIDTH = 100;
	final int LABEL_HEIGHT = 100;
	int xPosition = 100; 
	int yPosition = 100; 
	
	
	public MouseEventListenerEx2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Hello JAVA");
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		// 사이즈, 좌표값 위치 
		label.setSize(100, 100);
		label.setLocation(100, 100);
		add(label);
	}
	
	private void addEventListener() {
		// 익명 구현 클래스로 코딩 
		this.addMouseListener(new MouseListener() {
			
			// 마우스 버튼이 눌러 졌다가 떨어졌을 때 실행 되는 메서드 
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("11111111111");
			}
			
			// 마우스가 눌러졌을때 실행 되는 메서드 
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("22222");
			}
			
			// 마우스가 감지 하고있는 객체에서 나갔을 때 실행되는 메서드 
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("33333");
				
			}
			
			// 마우스가 감지 하고있는 객체에서 들어 왔을 때 
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("444444");
				
			}
			// 마우스가 클릭 되었을 때  
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setLocation(e.getX(), e.getY() - (label.getBounds().height));
			}
		});
	}
	
} // end of class 
