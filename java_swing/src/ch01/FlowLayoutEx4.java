package ch01;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx4 extends JFrame {

	// 1. ArrayList  리스트 변경해보기 !!
	// private JButton[] buttons = new JButton[5];
	// 사용방법 
	ArrayList<JButton> arrayList = new ArrayList<>();
	private final int BUTTON_SIZE = 4; 
	private FlowLayout flowLayout;

	public FlowLayoutEx4() {
		initData();
		setInitLayot();
	}
	
	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println(" arrayList.size() : " +  arrayList.size());
		for(int i = 0; i < BUTTON_SIZE; i++ ) {
			arrayList.add(new JButton("button " + (i + 1)));
		}
		flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 230);
	}
	
	// GUI 프로그래밍에서 레이웃을 설정하는 코드 
	private void setInitLayot() {
		setVisible(true);
		setLayout(flowLayout);
		for (int i = 0; i < BUTTON_SIZE ; i++) {
			add( arrayList.get(i));
		}
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx4();
	}
	
}
