
import java.awt.*;

class ButtonTest2 {
	public static void main(String args[]) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null); // .

		Button b = new Button("Ȯ��"); // Ȯ ��
		b.setSize(100, 50); // Button . �� ũ�⸦ �����Ѵ�
		b.setLocation(100, 75); // Frame Button . �������� �� ��ġ�� �����Ѵ�
		f.add(b);
		f.setVisible(true);
	}
}