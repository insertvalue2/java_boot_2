package ch03;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 배경 이미지를 사용하는 두면째 방법 
// BufferedImage 
public class MyBufferedImage extends JFrame {
	
	private BufferedImage backgroundImage; 
	private BufferedImage player; 
	
	private MyImageDrawPanel drawPanel;
	private final int PLAYER_WIDTH = 100; 
	private final int PLAYER_HEIGHT = 100; 
//	 private JLabel label;
	
	public MyBufferedImage() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("이미지 배경 그리기 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			player =  ImageIO.read(new File("player2.png"));
			backgroundImage = ImageIO.read(new File("background.png"));
		
		} catch (IOException e) {
			System.out.println("파일이 없거나 경로를 잘못 지정했습니다.");
			e.printStackTrace();
		}
		
		drawPanel = new MyImageDrawPanel(); 
	//	label = new JLabel(new ImageIcon("player.jpg"));
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		drawPanel.setLocation(0, 0);
		drawPanel.setSize(500,500);
		add(drawPanel);
		
		
//		label.setSize(100, 100);
//		label.setLocation(50, 50);
//		drawPanel.add(label);
	}
	
	// inner class JPanel 클래스를 상속받아 설계 
	private class MyImageDrawPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(player, 200, 200, PLAYER_WIDTH, PLAYER_HEIGHT, null);
		}
	} // end of inner class 

} // end of class 
