package ex01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class Block extends JLabel {
	private ImageIcon icon;

	public Block(ImageIcon icon) {
		this.icon = icon; 
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
}
