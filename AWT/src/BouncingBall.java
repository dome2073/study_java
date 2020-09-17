import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BouncingBall extends Frame {
	final int BALL_SIZE = 20;
	final int FRAME_WIDTH = 400;
	final int FRAME_HEIGHT = 300;
	final int TOP;
	final int BOTTOM;
	final int LEFT;
	final int RIGHT;
	final int SPEED = 10;
	int x = 100;
	int y = 100;
	int xStep = SPEED;
	int yStep = SPEED;

	BouncingBall(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setBounds(300, 200, FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setVisible(true);
		Insets insets = getInsets(); // Frame . 의 테두리의 두께를 얻어온다
		TOP = insets.top;
		LEFT = insets.left;
		BOTTOM = FRAME_HEIGHT - insets.bottom;
		RIGHT = FRAME_WIDTH - insets.right;
	}
	
	@Override
	public String toString() {
		return "BouncingBall [BALL_SIZE=" + BALL_SIZE + ", FRAME_WIDTH=" + FRAME_WIDTH + ", FRAME_HEIGHT="
				+ FRAME_HEIGHT + ", TOP=" + TOP + ", BOTTOM=" + BOTTOM + ", LEFT=" + LEFT + ", RIGHT=" + RIGHT
				+ ", SPEED=" + SPEED + ", x=" + x + ", y=" + y + ", xStep=" + xStep + ", yStep=" + yStep + "]";
	}

	//Frame의 내부를 튀어다니는 공을 그리는 프로그램
	//공이 Frame벽에 부딪히면 방향을 바꾸어 이동한다.
	void start() {
		while (true) {
			x += xStep;
			y += yStep;
			
			System.out.println(toString());
			
			if(x <= LEFT) {
				System.out.println("1");
				x = LEFT;
				xStep = +3;
				
			}else if (x >= RIGHT - BALL_SIZE) {
				System.out.println("2");
				x = RIGHT-BALL_SIZE;
				xStep  = -3;
			}else if(y <= TOP) {
				System.out.println("3");
				y = TOP;
				yStep = +3;
			}else if(y >= BOTTOM - BALL_SIZE) {
				System.out.println("4--------");
				
				y = BOTTOM-BALL_SIZE;
				yStep = -3;
			}
	
			repaint();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
		
		
	} // start()

	private void change() {
		// TODO Auto-generated method stub
		 x = LEFT;
		 
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
	}
} //BouncingBall end

