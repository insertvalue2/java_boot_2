package game.component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.BubbleFrame;
import game.interfaces.Moveable;
import game.service.BackgroundEnemyService;
import game.state.EnemyWay;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends JLabel implements Moveable {

	private BubbleFrame mContext;

	// 살아 있는 상태 (0) , 물방울에 같힌 상태 (1)
	private int state;

	// 위치 상태
	private int x;
	private int y;

	// 적군의 방향
	private EnemyWay enemyWay;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 적군 속도 상태
	private final int SPEED = 3;
	private final int JUMPSPEED = 1;

	private ImageIcon enemyR, enemyL;

	public Enemy(BubbleFrame mContext, EnemyWay enemyWay) {
		this.mContext = mContext;
		initData();
		setInitLayout();
		initBackgroundEnemyService();
		initEnemyDirection(enemyWay);
	}
	
	private void initEnemyDirection(EnemyWay enemyWay) {
		if(EnemyWay.RIGHT == enemyWay) {
			enemyWay = EnemyWay.RIGHT;
			setIcon(enemyR);
			right();
		}else {
			enemyWay = EnemyWay.LEFT;
			setIcon(enemyL);
			left();
		}
	}

	private void initBackgroundEnemyService() {
		new Thread(new BackgroundEnemyService(this)).start();
	}

	private void initData() {
		enemyR = new ImageIcon("images/enemyR.png");
		enemyL = new ImageIcon("images/enemyL.png");
		x = 720;
		y = 175;

		left = false;
		right = false;
		up = false;
		down = false;

		enemyWay = EnemyWay.LEFT;
		state = 0;
	}

	private void setInitLayout() {
		setIcon(enemyL);
		setSize(50, 50);
		setLocation(x, y);
	}

	@Override
	public void left() {
		enemyWay = enemyWay.LEFT;
		left = true;
		new Thread(() -> {
			while (left) {
				x = x - SPEED;
				setIcon(enemyL);
				setLocation(x, y);
				checkingPlayerPosition();
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	private void checkingPlayerPosition() {
		boolean isDieX = Math.abs(x - mContext.getPlayer().getX()) < 50;
		boolean isDieY = Math.abs(y - mContext.getPlayer().getY()) < 50;
		if (isDieX && isDieY && state == 0) {
			mContext.getPlayer().die();
		}
	}

	@Override
	public void right() {
		enemyWay = enemyWay.RIGHT;
		right = true;
		new Thread(() -> {
			while (right) {
				x = x + SPEED;
				setIcon(enemyR);
				setLocation(x, y);
				checkingPlayerPosition();
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	@Override
	public void up() {
		up = true;
		new Thread(() -> {
			for (int i = 0; i < 130 / JUMPSPEED; i++) {
				y = y - JUMPSPEED;
				setLocation(x, y);
				try {
					Thread.sleep(10);
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
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				y = y + JUMPSPEED;
				setLocation(x, y);
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}).start();
		down = false;
	}
}
