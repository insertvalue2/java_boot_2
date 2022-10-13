package ch01;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx01  extends JFrame {
	
	private JButton button1; 
	private JButton button2; 
	private JButton button3;
	public NoLayoutEx01() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("좌표값으로 버튼 배치하기");
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
	}
	
	private void setInitLayout() {
		setVisible(true);
		// 배치 관리자 ( 좌표값으로 배치 하기위해서는 반드시 null 일 입력해야 한다.)  
		setLayout(null);
		// get, set 
		// 버튼 들에 사지즈를 지정
		button1.setSize(100, 100);
		button2.setSize(100, 100);
		button3.setSize(100, 100);
//		button1.setSize(100, 100); 
//		button2.setSize(100, 100); 
//		button3.setSize(100, 100); 
		
		
		// 좌표값을 지정 
		button1.setLocation(0, 0);
		button2.setLocation(100, 100);
		button3.setLocation(200, 200);
		
		
		add(button1);
		add(button2);
		add(button3);
	}
	
	// 버튼에 크기를 지정하는 기능 
	private void setMyButtonSize(JButton button,  int width, int height) {
		button.setSize(width, height); 
	}
	
	private void setMyButtonPostion() {
		// 겹치지 않게 코드 완성해 보세요 
	}
	
	public static void main(String[] args) {
		new NoLayoutEx01();

	} // end of main 

}
