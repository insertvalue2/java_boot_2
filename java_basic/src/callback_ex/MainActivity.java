package callback_ex;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 콜백 받는 객체 : OnCallbackButtonAction 구현해서 메서드를 정의한다. 
public class MainActivity extends JFrame implements OnCallbackButtonAction {
	 
	int count; 
	JLabel label;
	SubActivity subActivity;

	public MainActivity() {
		count = 0; 
		label = new JLabel(count + "");
		setLayout(new FlowLayout());
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		subActivity = new SubActivity(this);
	}
	
	public void addCount() {
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickPlusButton() {
		System.out.println("누군지는 모르겠는데 콜백 되어져서 여기 메서드가 실행 되었다.");
		count++;
		label.setText(count +"");
	}
	
}
