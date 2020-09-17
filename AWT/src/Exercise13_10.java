
import java.awt.*;
import java.awt.event.*;

class BouncingBall3 extends Frame {
	final int BALL_SIZE = 20;
	final int FRAME_WIDTH = 400;
	final int FRAME_HEIGHT = 300;
	final int TOP;
	final int BOTTOM;
	final int LEFT;
	final int RIGHT;
	int x;
	int y;
	final int SPEED = 3;
	int xStep = SPEED;
	int yStep = SPEED;

	BouncingBall3(String title) {
		super(title);
		x = FRAME_WIDTH / 2 - BALL_SIZE / 2;
		y = FRAME_HEIGHT / 2 - BALL_SIZE / 2;
		setVisible(true);
		setBounds(300, 200, FRAME_WIDTH, FRAME_HEIGHT);
		Insets insets = getInsets();
		TOP = insets.top;
		LEFT = insets.left;
		BOTTOM = FRAME_HEIGHT - insets.bottom;
		RIGHT = FRAME_WIDTH - insets.right;
		registerEventHandler();
		setResizable(false);
	}

	void registerEventHandler() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				
				
				int key = ke.getKeyCode();
				//위
				if (key == KeyEvent.VK_UP) {
					 y -= yStep; 
				} else if (key == KeyEvent.VK_DOWN) {
					//아래
					y += yStep;
				} else if (key == KeyEvent.VK_LEFT) {
					//왼쪽
					x -= xStep;
				} else if (key == KeyEvent.VK_RIGHT) {
					//오른쪽
					x += xStep;
				}
				
				repaint();
			} // public void keyPressed(KeyEvent ke)
		});
	}

	void start() {
		while (true) {
			repaint();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	} // start()

	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
	}
}

class Exercise13_10 {
	public static void main(String[] args) {
		new BouncingBall3("Bouncing Ball").start();
	}
}
