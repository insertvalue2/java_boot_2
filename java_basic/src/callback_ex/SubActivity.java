package callback_ex;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
// (콜리) callLee 호출자 : 콜백 받는 객체의 주소값을 알고 있어야 한다. 여기서 호출하기 때문 
public class SubActivity extends JFrame implements ActionListener {
	JButton button; 
	OnCallbackButtonAction onCallbackButtonAction;

	// **  호출자는 누가 한테 메세지를 전달해야 하는지 알고 있어야 된다. 
	// 1. 생성자 만드는 방법 
	// 2. 메서드를 통해서 만드는 방법 
	// 1 - 1 인터페이스 타입을 멤버 변수로 선언한다. 
	public SubActivity(OnCallbackButtonAction onCallbackButtonAction) {
		this.onCallbackButtonAction = onCallbackButtonAction;
		
		
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		button = new JButton("더하기버튼");
		button.addActionListener(this);
		add(button);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌러 졌습니다.");
		// 메서드 호출
		onCallbackButtonAction.clickPlusButton();
	}
}
