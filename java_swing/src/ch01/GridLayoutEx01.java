package ch01;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx01 extends JFrame {
	
	// ArrayList 사용방법 숙지 !!! 
	private String[] strArr = {"가", "나", "다", "라"};
	private ArrayList<JButton> buttons = new ArrayList<>();
	
	public GridLayoutEx01() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("그리드 레이아웃 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < strArr.length; i++) {
			buttons.add(new JButton( strArr[i] ));
		}
	}
	private void setInitLayout() {
		setVisible(true);
		// setLayout : JFrame 의 배치 관리자를 지정한다.
		setLayout(new GridLayout(2, 3));
		
		for (int i = 0; i < strArr.length; i++) {
			add(buttons.get(i));
		}
	}
	
	public static void main(String[] args) {
		new GridLayoutEx01();
	}

}
