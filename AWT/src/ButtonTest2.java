
import java.awt.*;

class ButtonTest2 {
	public static void main(String args[]) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null); // .

		Button b = new Button("확인"); // 확 인
		b.setSize(100, 50); // Button . 의 크기를 설정한다
		b.setLocation(100, 75); // Frame Button . 내에서의 의 위치를 설정한다
		f.add(b);
		f.setVisible(true);
	}
}