package ex01;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	String[] imagesFileName = {"iceBlock.png", "treeBlock.png"};
	Block[] blocks = new Block[100];
	IceBlock iceBlock; 
	TreeBlock treeBlock; 
	
	public MainFrame() {
		iceBlock = new IceBlock(new ImageIcon(imagesFileName[0]));
		treeBlock = new TreeBlock(new ImageIcon(imagesFileName[1]));
		
		
	}
	
	public void bobm() {
		iceBlock.setIcon(new ImageIcon("bobm.png"));
		
	}
	
}



