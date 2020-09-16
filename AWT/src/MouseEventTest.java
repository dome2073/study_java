
import java.awt.*;
import java.awt.event.*;

class MouseEventTest extends Frame {
	Label location;

	MouseEventTest(String title) {
		super(title); // Frame(String title) . �� ȣ���Ѵ�
		location = new Label("Mouse Pointer Location : ");
		location.setSize(195, 15);
		location.setLocation(5, 30);
		location.setBackground(Color.yellow); // Label . �� ������ ��������� �Ѵ�
		add(location);
// EventHandler Frame Listener . �� �ν��Ͻ��� �� �� ����Ѵ�
		addMouseMotionListener(new EventHandler());
		setSize(300, 200);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String args[]) {
		MouseEventTest mainWin = new MouseEventTest("MouseEventTest");
	} // main�޼����� ��

	class EventHandler implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
		}

		public void mouseMoved(MouseEvent e) {
			location.setText("Mouse Pointer Location : (" + e.getX() + ", " + e.getY() + ")");
		}
	} // EventHandlerŬ������ ��
}