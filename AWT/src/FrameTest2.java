import java.awt.*;

class FrameTest2 {
	public static void main(String args[]) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		Toolkit tk = Toolkit.getDefaultToolkit(); // Toolkit . ������ ��ü�� ��´�
		Dimension screenSize = tk.getScreenSize(); // . ȭ���� ũ�⸦ ���Ѵ�
		// Frame ȭ��ũ���� ���ݰ����� ũ���� ���ݰ��� �� ��ġ�� �ϸ�
		// Frame . �� ȭ�� ��� ��ġ�ϰ� �ȴ�
		f.setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 100);
		f.setVisible(true); // Frame . ������ �� ȭ�鿡 ���̵��� �Ѵ�
	}
}
