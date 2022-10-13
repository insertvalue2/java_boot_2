package ch06;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyImageFrame extends JFrame implements KeyListener {

	// 재료를 선정 
	//1. JLABEL 사용해서 이미지 그리기 
	//2. 이벤트 리스너 등록 및 구현 
	JLabel playerLabel; 
	JLabel backgroundLabel; 
	BufferedImage bufferedImage;
	
	MyImagePanel myImagePanel;
	
	// 내부 클래스 
	class MyImagePanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(bufferedImage, 0, 0, 500, 500, null);
			
		}
	}
	
	public MyImageFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playerLabel = new JLabel(new ImageIcon("player2.png"));
		backgroundLabel = new JLabel(new ImageIcon("background.png"));
		
		try {
			bufferedImage = ImageIO.read(new File("background.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myImagePanel = new MyImagePanel(); 
		
	}
	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(null);
		
		myImagePanel.setSize(500, 500);
		myImagePanel.setLocation(0, 0);
		this.add(myImagePanel);
		
		// 좌표 기반 배치관리자 
		// 사이즈, 위치
		playerLabel.setSize(200, 200);
		playerLabel.setLocation(100, 100);
		
		//this.add(playerLabel);
		myImagePanel.add(playerLabel);
//		backgroundLabel.setSize(500, 500);
//		backgroundLabel.setLocation(0, 0);
//		this.add(backgroundLabel);
		
	}
	private void addEventListener() {
		this.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


