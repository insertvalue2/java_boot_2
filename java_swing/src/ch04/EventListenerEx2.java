package ch04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame2 extends JFrame implements ActionListener {
	
	JButton button1; 
	JButton button2;
	JPanel jPanel;
	
	public MyFrame2() {
		initData();
		setInitLayout(); 
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		jPanel = new JPanel();
	}
	private void setInitLayout() {
		setVisible(true);
		//setLayout();
		add(jPanel);
		jPanel.add(button1);
		jPanel.add(button2);
		
	}
	private void addEventListener() {
		// 등록을 해주어야 한다. 
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// 만약 e 라는 녀셕에 주체가 넘어 온다면 현재 객체와 같은지 확인을 한다.
		JButton targetButton =  (JButton)e.getSource();
		 
		if(targetButton.getText().equals(button1.getText())) {
			System.out.println("button1 이 눌러 졌습니다.");
			jPanel.setBackground(Color.CYAN);
		} else {
			System.out.println("button2 이 눌러 졌습니다.");
		}
	}
}

public class EventListenerEx2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
