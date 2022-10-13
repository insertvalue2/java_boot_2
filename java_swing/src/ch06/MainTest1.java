package ch06;

import javax.swing.ImageIcon;

public class MainTest1 {
	
	String[] imgNams = {"a.png", "b.png"};
	Player[] players = new Player[3];

	public MainTest1() {
		players[0] = new Player(new ImageIcon("blackbird.png"), "블랙버드", imgNams);
		players[1] = new Player(new ImageIcon("blackbird.png"), "블랙버드");
		players[2] = new Player(new ImageIcon("blackbird.png"), "블랙버드");
	}

	Player 블랙버드 = new Player(new ImageIcon("blackbird.png"), "블랙버드");
	Player 노란버드 = new Player(new ImageIcon("yellowbird.png"), "블랙버드");
	Player 초록버드 = new Player(new ImageIcon("greenbird.png"), "블랙버드");

	public static void main(String[] args) {

	}

}
