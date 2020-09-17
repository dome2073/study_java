import java.awt.*;
import java.awt.event.*;

class Exercise13_7 extends Frame implements MouseListener {
	final int LINE_NUM = 9; // ������ �� ��
	final int LINE_WIDTH = 30; // ������ �� ����
	final int BOARD_SIZE = LINE_WIDTH * (LINE_NUM - 1); // �������� ũ��
	final int STONE_SIZE = (int) (LINE_WIDTH * 0.8); // ���� ũ��
	final int X0; // x ������ ������ġ ��ǥ
	final int Y0; // y ������ ������ġ ��ǥ
	final int FRAME_WIDTH; // Frame�� ��
	final int FRAME_HEIGHT; // Frame�� ����
	Image img = null;
	Graphics gImg = null;

	public Exercise13_7(String title) {
		super(title);
		// Event Handler . �� ����Ѵ�
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		setVisible(true); // Frame . �� ȭ�鿡 ���̰� �Ѵ�
		Insets insets = getInsets(); // Insets . ȭ�鿡 ���̱� ������ �� ���� ���� �� ����
		// (LEFT, TOP) X0, Y0 . ������ �׷��� ��ġ �� ��ǥ �� �����Ѵ�
		X0 = insets.left + LINE_WIDTH;
		Y0 = insets.top + LINE_WIDTH;
		// Frame . �� ũ�⸦ ����Ѵ�
		FRAME_WIDTH = BOARD_SIZE + LINE_WIDTH * 2 + insets.left + insets.right;
		FRAME_HEIGHT = BOARD_SIZE + LINE_WIDTH * 2 + insets.top + insets.bottom;
		// Frame (100,100) . �� ȭ���� �� ��ġ�� ���� ũ��� ���̰� �Ѵ�
		setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
		img = createImage(FRAME_WIDTH, FRAME_HEIGHT);
		gImg = img.getGraphics();
		setResizable(false); // Frame . �� ũ�⸦ �������� ���ϰ� �Ѵ�
		drawBoard(gImg);
	} // Exercise13_7(String title)

	public void drawBoard(Graphics g) {
		for (int i = 0; i < LINE_NUM; i++) {
			g.drawLine(X0, Y0 + i * LINE_WIDTH, X0 + BOARD_SIZE, Y0 + i * LINE_WIDTH);
			g.drawLine(X0 + i * LINE_WIDTH, Y0, X0 + i * LINE_WIDTH, Y0 + BOARD_SIZE);
		}
	}

	public void paint(Graphics g) {
		if (img == null)
			return;
		g.drawImage(img, 0, 0, this); // Frame ����ȭ�鿡 �׷��� �׸��� �� ����
		
	}

	public void mousePressed(MouseEvent e) { // MouseListener
		int x = e.getX(); // x ���콺 �������� ��ǥ
		int y = e.getY(); // y ���콺 �������� ��ǥ
		
		//1. x,y �� ���� ������ ���� �Ѿ ���̸� ���� �׸��� �ʴ´� (40, 70)
		
		if((x>X0 && y>Y0 && x<= 310 && y<= 310)) {
			
			//2. x��y�� ���� Ŭ���� ������ ���� ����� ���������� �����Ѵ�. (�ݿø�)
			
			System.out.println(x);
			System.out.println(y);
			x = (int)Math.round(x/10.0) *10;
			y = (int)Math.round(y/10.0) *10;
			
			System.out.println(x);
			System.out.println(y);
			
			//3. x�� y�� ������ ���� ũ��(STONE_SIZE)�� ������ ���� Ŭ���Ѱ��� ���� �׷�����
			x = x - (STONE_SIZE/2);
			y = y - (STONE_SIZE/2);
				
			//4. ������ ��ư�� ���콺 ���� ��ư�̸� ��ġ�� �������� �׸���
			//������ 16 �������� 4(me.getModifiers() == me.BUTTON3_MASK
			if(e.getModifiers() == e.BUTTON1_MASK) {
				gImg.fillOval(x, y, 25, 25);
				gImg.setColor(Color.BLACK);
			}else if(e.getModifiers() == e.BUTTON3_MASK) {
				
				gImg.drawOval(x, y, 25, 25);
				gImg.fillOval(x,y,25,25);
				gImg.setColor(Color.WHITE);
			}
			
			repaint();
		}
		
		

		//������ ��ư�̸� ���� �׸���
		
		//�׸��� �׵θ��� ���� �׸���.
		/*
		(1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�
		1. x y . �� �� ���� �������� ���� ��� ���̸� ���� �׸��� �ʴ´�
		2. x y .( ) �� �� ���� Ŭ���� ������ ���� ����� ���������� �����Ѵ� �ݿø�
		3. x y (STONE_SIZE) . �� �� ������ ���� ũ�� �� ������ ���� Ŭ���� ���� ���� �׷�����
		4. , (x,y) ������ ��ư�� ���콺 ���� ��ư�̸� �� ��ġ�� ���� ���� �׸���
		������ ��ư�� ���콺 ������ ��ư�̸� �� ��ġ�� �� ���� �׸��� , (x,y) .
		( .) �� ���� �׸� �� ���� �� �׵θ��� ���� �׸���
		5. repaint() . �� ȣ���Ѵ�
		*/
		
	}

	public void mouseClicked(MouseEvent e) {
	} // MouseListener

	public void mouseEntered(MouseEvent e) {
	} // MouseListener

	public void mouseExited(MouseEvent e) {
	} // MouseListener

	public void mouseReleased(MouseEvent e) {
	} // MouseListener

	public static void main(String[] args) {
		new Exercise13_7("OmokTest");
	}
}

