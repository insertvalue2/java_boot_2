package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx01 extends JFrame {

	String[] str = {"동", "서"};
	String[] directions = {BorderLayout.EAST, BorderLayout.WEST};
	JButton button1 = new JButton("동");
	JButton button2 = new JButton("서");
	JButton button3 = new JButton("남");
	JButton button4 = new JButton("북");
	JButton button5 = new JButton("센터");
	
	

	private BorderLayout borderLayout;

	public BorderLayoutEx01() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("border Layout 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JButton 초기화 완료 됨.. (멤버 변수로 처리 ) 
		borderLayout = new BorderLayout();
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(borderLayout);
		
		// 프레임에 add 하는 동작만 시켜 주면 됩니다. 
		// 직접 코딩해 보세요 !!! (문서 확인 요망) 
		
		// for 
		add(button1, BorderLayout.EAST);
		add(button2, borderLayout.WEST);
	}

	public static void main(String[] args) {

	} // end of main

}
