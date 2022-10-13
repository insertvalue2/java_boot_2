package ch06;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class AFrame  extends JFrame implements ActionListener{
	
	JLabel jLabel = new JLabel();
	Button button = new Button("ass");
	public AFrame() {
		setSize(500, 500);
		setLayout(new FlowLayout());
		setVisible(true);
		add(jLabel);
		
		//add(jLabel);
		jLabel.setText("안녕");
		jLabel.setText("안녕1");
		jLabel.setText("안녕2");
		add(button);
		button.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new AFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		jLabel.setText("HI");
		//jLabel.repaint();
		
	}
	
}
