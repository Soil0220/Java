package day03_02;

import javax.swing.JButton;
import javax.swing.JFrame;

//전통적 의미의 상속은 "물려받아 확장한다."

class MyApp extends JFrame{
	public MyApp() {
		setSize(400,300);
		//종료버튼을 활성화
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("클릭"));
		setVisible(true);
		//JFRAME을 상속받아 바로 창을 만들 수 있다.
	}
}
public class TestCopy1 {
	public static void main(String[] args) {
		new MyApp();
	}
}
