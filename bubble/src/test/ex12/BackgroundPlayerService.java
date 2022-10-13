package test.ex12;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인스레드 바쁨 - (이벤트 리스너 처리 중)
// 백그라운드에 계속  Player 에 움직임을 관찰 
public class BackgroundPlayerService implements Runnable { 
	
	private BufferedImage image;
	// 의존성 포함관계 , 의존성 컴포지션 
	private Player player; 
	
	public BackgroundPlayerService(Player player) {
		this.player = player; 
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일명 및 파일 경로를 확인 바랍니다.");
		}
	}
	
	

	@Override
	public void run() {
		while(true) {
			Color leftColor = new Color( image.getRGB(player.getX(), player.getY() + 25));
			Color rightColor = new Color( image.getRGB(player.getX() + 50 + 10, player.getY() + 25));
			
			//Color bottomColor = new Color( image.getRGB(player.getX(), player.getY() + 50 + 5));
			int bottomColorLeft =  image.getRGB(player.getX() + 20, player.getY() + 50 + 5);
			int bottomColorRight =  image.getRGB(player.getX() + 50 - 10, player.getY() + 50 + 5);
			
			
			// 바닥인 경우  255 0 0 , 0 0 255 (바닥) 
			// 255 255 255
			// 하얀색이 아니면 바닥이다. --> -1 
			if( (bottomColorLeft +bottomColorRight)  != -2) {
				//여기가 바닥입니다.
				player.setDown(false);
			} else {
				// 쪼~끔 점프하는 순간 bottomColor 값이 -1 되기 때문에 
				// 65번 돌아야 하는데 for 문이 첫번째에 	player.down() 실행된다. 
				if(!player.isUp() && !player.isDown()) {
					// for 65 번 성공 
					// 플레이어가 올가는 도중이 아닐 때 down() 메서드를 실행 시켜야 한다.
					// 다운 메서드는 단 한번만 실행된다. 
					player.down();
				}
			}
			
			if(leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				player.setLeftWallCrash(true);
				player.setLeft(false);
			} else if(rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				player.setRightWallCrash(true);
				player.setRigth(false);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}
 
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 		}	
	}
}
