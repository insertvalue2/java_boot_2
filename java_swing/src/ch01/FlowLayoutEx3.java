package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {
	
	// 배열로 만들어서 코드를 수정
	// 생성시 for문 활용 
	// 정 가운데에 배체를 해주세요 (수직) (500) 
	
	// 배열, ArrayList (멤버 변수 선언과 동시에 초기화)
	// 1. 배열 사용 방법
	private JButton[] buttons = new JButton[5]; 
	
	private FlowLayout flowLayout;
	
	public FlowLayoutEx3() {
		initData();
		setInitLayot();
	}
	
	// 초기화 과정 (값을 넣거나 클래스르 메모리에 올리는 과정) 
	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2. 배열 인덱스 연산 0 , 1, 2, .... 
		// 2 - 1 반복 : for 
		for(int i = 0; i < buttons.length; i++ ) {
			buttons[i] = new JButton("button " + (i  + 1));
		}
		
		flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 230);
		 
	}
	
	// GUI 프로그래밍에서 레이웃을 설정하는 코드 
	private void setInitLayot() {
		setVisible(true);
		setLayout(flowLayout);
		//3.  배열 0, 1, 2, ,.. 
		// 3 - 1.  for 
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
	
}
