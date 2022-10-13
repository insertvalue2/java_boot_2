package ch06;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniGame extends JFrame implements KeyListener {

	final int FRAME_WIDTH = 500;
	final int FRAME_HEIGHT = 500;
	int playerX = 200;
	int playerY = 200;
	// 변수선언
	boolean flag = true;
 
	BufferedImage backgroundImage;
	BufferedImage playerImageLeft;
	BufferedImage playerImageRight;
	MyDrawPanel myDrawPanel;

	public MiniGame() {

		initData();
		setInitLayout();
		addEventListener();
	}

	private void addEventListener() {
		this.addKeyListener(this);
	}

	private void setInitLayout() {
		setVisible(true);
		this.add(myDrawPanel);
	}

	private void initData() {
		setTitle("미니게임");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("images/background.png"));
			playerImageLeft = ImageIO.read(new File("images/player2.png"));
		} catch (IOException e) {
			System.out.println("파일명 및 경로 확장자 확인하기 !!! ");
			System.exit(0); // 프로그램 자동 종료
		}

		myDrawPanel = new MyDrawPanel();

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_LEFT) {
			playerX = (playerX < 0) ? -5 : playerX - 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			playerX += 10;
		} else if (keyCode == KeyEvent.VK_UP) {
			playerY -= 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			playerY += 10;
		} else if (keyCode == KeyEvent.VK_SPACE) {
			flag = !flag;
			System.out.println("flag : " + flag);
			backgroundImage = playerImageLeft;
		}
		// 그림을 다시 그려주다 paintComponent() 실행
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	// inner class
	private class MyDrawPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			System.out.println("paintComponent 호출 !!!");
			g.drawImage(backgroundImage, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
			g.drawImage(playerImageLeft, playerX, playerY, 100, 100, null);
		}
	} // end of inner class

}
