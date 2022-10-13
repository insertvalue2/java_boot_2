package test.ex10;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Getter;

@Getter
public class BubbleFrame extends JFrame {
		
	private BubbleFrame mContext = this; 
	// 포함관계 (컴포지션)
	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;
	
	
	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();

		// todo remove 
		enemy = new Enemy(mContext);
		
		add(enemy);
		enemy.left();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);

		player = new Player(mContext);
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null); // absoulte 레이아웃
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치하기

		add(player);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 1. 플레이어가 왼쪽으로 가고 있지 않을때 player.left 실행해야 한다. 
					// 2. 왼쪽벽에 맞다아 있으면 left() 메서드를 실행 시키면 안된다. 
					if(!player.isLeft() && !player.isLeftWallCrash()) {
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:
					if(!player.isRigth() && !player.isRightWallCrash()) {
						player.right();
					}
					break;
				case KeyEvent.VK_UP:
					if(!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;
				case KeyEvent.VK_SPACE:
					player.attack(); 
					break;
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					//왼쪽으로 가는거  멈춰야해
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					// 오른쪽으로 가는거 멈춰야 해
					player.setRigth(false);
					break;
				default:
					break;
				}
			}
		});
	}
	// 메인함수가 있는 코드는 모든 객체들에서 주소값을 알수 있다. 
	public static void main(String[] args) {
		new BubbleFrame();
	}

}
