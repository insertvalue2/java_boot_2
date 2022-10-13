package test.ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player extends JLabel implements Moveable {
	
	// player 위치 상태 
	private int x;
	private int y;
	
	// 움직임 상태 
	private boolean left; 
	private boolean rigth; 
	private boolean up;
	private boolean down; 
	
	// 플레이어에 속도 상태 
	private final int SPEED = 4;
	private final int JUMPSPEED = 2; 
	
	
	private ImageIcon playerR, playerL;

	public Player() {
		initData();
		initSetLayout();
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		x = 400; 
		y = 540;
		left = false; 
		rigth = false; 
		up = false; 
		down = false; 
	}

	private void initSetLayout() {
	
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}

	@Override
	public void left() {
		left = true; 
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(left) {
					setIcon(playerL);
					x = x - SPEED; 
					setLocation(x, y);
					try {
						Thread.sleep(10);// 0.01초
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		}).start();
		
	}

	@Override
	public void right() {
		rigth = true; 
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(rigth) {
					setIcon(playerR);
					x = x + SPEED; 
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();; 
	}

	@Override
	public void up() {
		System.out.println("점프");
		up = true; 
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 반복 = 65 
				for(int i = 0; i < 130 / JUMPSPEED; i ++) {
					// 535 = 535 - 2
					y = y - JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				up = false; 
				down(); 
			}
		}).start();
	}

	@Override
	public void down() {
			down = true;
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i = 0; i < 130 / JUMPSPEED; i++) {
						y = y + JUMPSPEED; 
						setLocation(x, y);
						try {
							Thread.sleep(3);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					down = false; 
					// 상태값을 다룰때는 상황이 변환면 확실하게 초기화 처리를 하자 !!! 
				}
			}).start();
			
	}
}
