package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame extends JFrame implements ActionListener {

	JPanel centerPanel;
	JPanel bottomPanel;
	JButton button1;
	JButton button2;

	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centerPanel = new JPanel();
		bottomPanel = new JPanel();
		button1 = new JButton("button");
		button2 = new JButton("button");
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		this.add(centerPanel, BorderLayout.CENTER);
		this.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		bottomPanel.add(button1);
		bottomPanel.add(button2);
		centerPanel.setBackground(Color.CYAN);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 주소값을 통해서 구분
		if (e.getSource() == button1) {
			centerPanel.setBackground(Color.red);
			return;
		}
		centerPanel.setBackground(Color.blue);
	}

	// main
	public static void main(String[] args) {
		new ColorChangeFrame();
	} // end of main

} // end of class
