import java.awt.*;
import java.awt.event.*;

class Exercise13_7 extends Frame implements MouseListener {
	final int LINE_NUM = 9; // 오목판 줄 수
	final int LINE_WIDTH = 30; // 오목판 줄 간격
	final int BOARD_SIZE = LINE_WIDTH * (LINE_NUM - 1); // 오목판의 크기
	final int STONE_SIZE = (int) (LINE_WIDTH * 0.8); // 돌의 크기
	final int X0; // x 오목판 시작위치 좌표
	final int Y0; // y 오목판 시작위치 좌표
	final int FRAME_WIDTH; // Frame의 폭
	final int FRAME_HEIGHT; // Frame의 높이
	Image img = null;
	Graphics gImg = null;

	public Exercise13_7(String title) {
		super(title);
		// Event Handler . 를 등록한다
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		setVisible(true); // Frame . 을 화면에 보이게 한다
		Insets insets = getInsets(); // Insets . 화면에 보이기 전에는 의 값을 얻을 수 없다
		// (LEFT, TOP) X0, Y0 . 오목판 그려질 위치 의 좌표 를 지정한다
		X0 = insets.left + LINE_WIDTH;
		Y0 = insets.top + LINE_WIDTH;
		// Frame . 의 크기를 계산한다
		FRAME_WIDTH = BOARD_SIZE + LINE_WIDTH * 2 + insets.left + insets.right;
		FRAME_HEIGHT = BOARD_SIZE + LINE_WIDTH * 2 + insets.top + insets.bottom;
		// Frame (100,100) . 을 화면의 의 위치에 계산된 크기로 보이게 한다
		setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
		img = createImage(FRAME_WIDTH, FRAME_HEIGHT);
		gImg = img.getGraphics();
		setResizable(false); // Frame . 의 크기를 변경하지 못하게 한다
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
		g.drawImage(img, 0, 0, this); // Frame 가상화면에 그려진 그림을 에 복사
		
	}

	public void mousePressed(MouseEvent e) { // MouseListener
		int x = e.getX(); // x 마우스 포인터의 좌표
		int y = e.getY(); // y 마우스 포인터의 좌표
		
		//1. x,y 의 값이 오목판 밖을 넘어난 곳이면 돌을 그리지 않는다 (40, 70)
		
		if((x>X0 && y>Y0 && x<= 310 && y<= 310)) {
			
			//2. x와y의 값을 클릭한 곳에서 가장 가까운 교차점으로 변경한다. (반올림)
			
			System.out.println(x);
			System.out.println(y);
			x = (int)Math.round(x/10.0) *10;
			y = (int)Math.round(y/10.0) *10;
			
			System.out.println(x);
			System.out.println(y);
			
			//3. x와 y의 값에서 돌의 크기(STONE_SIZE)의 절반을 빼야 클릭한곳에 돌이 그려진다
			x = x - (STONE_SIZE/2);
			y = y - (STONE_SIZE/2);
				
			//4. 눌러진 버튼이 마우스 왼쪽 버튼이면 위치에 검은돌을 그리고
			//왼쪽이 16 오른쪽이 4(me.getModifiers() == me.BUTTON3_MASK
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
		
		

		//오른쪽 버튼이면 흰돌을 그린다
		
		//그릴땐 테두리도 같이 그린다.
		/*
		(1) . 아래의 로직에 맞게 코드를 작성하시오
		1. x y . 와 의 값이 오목판의 밖을 벗어난 곳이면 돌을 그리지 않는다
		2. x y .( ) 와 의 값을 클릭한 곳에서 가장 가까운 교차점으로 변경한다 반올림
		3. x y (STONE_SIZE) . 와 의 값에서 돌의 크기 의 절반을 빼야 클릭한 곳에 돌이 그려진다
		4. , (x,y) 눌러진 버튼이 마우스 왼쪽 버튼이면 의 위치에 검은 돌을 그리고
		눌러진 버튼이 마우스 오른쪽 버튼이면 의 위치에 흰 돌을 그린다 , (x,y) .
		( .) 흰 돌을 그릴 때 검은 색 테두리도 같이 그린다
		5. repaint() . 를 호출한다
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

