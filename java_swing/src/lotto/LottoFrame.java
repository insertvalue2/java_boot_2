package lotto;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LottoFrame extends JFrame {

	JLabel jLabel1 = new JLabel(); 
	LottoNumber lottoNumber = new LottoNumber(); 

	public void setupLottoNumber() {
		int[] numbers = lottoNumber.createLottoNumbers();
		jLabel1.setText(numbers[0] + ""); 
	}
	
}
