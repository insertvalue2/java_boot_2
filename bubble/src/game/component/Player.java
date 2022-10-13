package game.component;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.BubbleFrame;
import game.interfaces.Moveable;
import game.service.BackgroundPlayerService;
import game.state.PlayerWay;
import lombok.Getter;
import lombok.Setter;

// new 가능한 녀셕들 : 게임에 존재할 수 있다 (추상메서드를 가질 수 없다.)
@Getter
@Setter
public class Player extends JLabel implements Moveable {

	private BubbleFrame mContext;
	private List<Bubble> bubbleList;
	
	
	// 위치 상태
	private int x;
	private int y;
	
	// 플레이어의 방향
	private PlayerWay playerWay;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	
	// 플레이어 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2; // up, down
	
	private int state = 0; // 0 : live , 1 : die

	private ImageIcon playerR, playerL, playerRdie, playerLdie;

	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initObject();
		initSetting();
		initBackgroundPlayerService();
	}

	private void initObject() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		playerRdie = new ImageIcon("images/playerRdie.png");
		playerLdie = new ImageIcon("images/playerLdie.png");
		bubbleList = new ArrayList<>();
	}

	private void initSetting() {
		x = 80;
		y = 535;

		left = false;
		right = false;
		up = false;
		down = false;
		
		leftWallCrash = false;
		rightWallCrash = false;

		playerWay = PlayerWay.RIGHT;
		
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}
	
	private void initBackgroundPlayerService() {
		new Thread(new BackgroundPlayerService(this)).start();
	}
	
	public void attack() {
		new Thread(()->{
			Bubble bubble = new Bubble(mContext);
			mContext.add(bubble);
			bubbleList.add(bubble);
			if(playerWay == PlayerWay.LEFT) {
				bubble.left();
			}else {
				bubble.right();
			}
		}).start();
	}

	// 이벤트 핸들러
	@Override
	public void left() {
		//System.out.println("left");
		playerWay = PlayerWay.LEFT;
		left = true;
		new Thread(()-> {
			while(left && getState() == 0) {
				setIcon(playerL);
				x = x - SPEED;
				setLocation(x, y);
				try {
					Thread.sleep(10); // 0.01초
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}).start();

	}

	@Override
	public void right() {
		//System.out.println("right");
		playerWay = PlayerWay.RIGHT;
		right = true;
		new Thread(()-> {
			while(right && getState() == 0) {
				setIcon(playerR);
				x = x + SPEED;
				setLocation(x, y);
				try {
					Thread.sleep(10); // 0.01초
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}).start();
		

	}

	// left + up, right + up
	@Override
	public void up() {
		//System.out.println("up");
		up = true;
		new Thread(()->{
			for(int i=0; i<130/JUMPSPEED; i++) {
				y = y - JUMPSPEED;
				setLocation(x, y);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			up = false;
			down();
			
		}).start();
	}

	@Override
	public void down() {
		//System.out.println("down");
		down = true;
		new Thread(()->{
			while(down) {
				y = y + JUMPSPEED;
				setLocation(x, y);
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			down = false;
		}).start();
	}
	
	public void die() {
		new Thread(() -> {
			setState(1);
			setIcon(PlayerWay.RIGHT == playerWay ? playerRdie : playerLdie);
		

			try {				
				if(!isUp() && !isDown()) up();
			
				
				Thread.sleep(2000);
				mContext.remove(this);
				mContext.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("플레이어 사망.");
		}).start();
	}
}
