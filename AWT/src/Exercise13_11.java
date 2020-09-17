
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class BouncingBall4 extends Frame {
	final int BALL_SIZE = 20;
	final int FRAME_WIDTH = 400;
	final int FRAME_HEIGHT = 300;
	final int TOP;
	final int BOTTOM;
	final int LEFT;
	final int RIGHT;
	final int SPEED = 7;
	int x;
	int y;
	boolean isPlaying = true;
	ArrayList balls = new ArrayList();

	BouncingBall4(String title) {
		super(title);
		x = FRAME_WIDTH / 2 - BALL_SIZE / 2;
		y = FRAME_HEIGHT / 2 - BALL_SIZE / 2;
		setBounds(300, 200, FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setVisible(true);
		Insets insets = getInsets();
		TOP = insets.top;
		LEFT = insets.left;
		BOTTOM = FRAME_HEIGHT - insets.bottom;
		RIGHT = FRAME_WIDTH - insets.right;
		registerEventHandler();
	}

	void registerEventHandler() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if (!isPlaying)
					return;

				int key = ke.getKeyCode();
				
				if (key == KeyEvent.VK_UP) {
					 y -= 3; 
				} else if (key == KeyEvent.VK_DOWN) {
					//아래
					y += 3;
				} else if (key == KeyEvent.VK_LEFT) {
					//왼쪽
					x -= 3;
				} else if (key == KeyEvent.VK_RIGHT) {
					//오른쪽
					x += 3;
				}
			} // public void keyPressed(KeyEvent ke)
		});
	}

	void start() {
		new BallGenerator().start();
		while (isPlaying) {
			int size = balls.size();
			for (int i = 0; i < size; i++) {
				Ball b = (Ball) balls.get(i);
				b.x += b.xStep;
				b.y += b.yStep;
				
				if(b.x <= LEFT) {
					
					b.x = LEFT;
					b.xStep = +3;
					
				}else if (b.x >= RIGHT - BALL_SIZE) {
					
					b.x = RIGHT- BALL_SIZE;
					b.xStep  = -3;
				}else if(b.y <= TOP) {
					
					b.y = TOP;
					b.yStep = +3;
				}else if(b.y >= BOTTOM - BALL_SIZE) {
					
					
					b.y = BOTTOM-BALL_SIZE;
					b.yStep = -3;
				}
				
				
				if(collisionCheck(b)) {
					System.exit(0);
				}
					
			} // for
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	} // start()

	boolean collisionCheck(Ball b) {
		
		//충돌체크함수
		int userCenter_x = (x+BALL_SIZE/2);
		int userCenter_y = (y+BALL_SIZE/2);
		int enemyCenter_x = (b.x+b.size);
		int enemyCenter_y = (b.y+b.size);
		
		double distance = Math.sqrt(Math.pow((userCenter_x - enemyCenter_x),2) +Math.pow((userCenter_y - enemyCenter_y),2));
		
		boolean result = distance <= BALL_SIZE ?  true :  false; 
		//1.회색 공의 중심과 빨간 공의 중심간의 거리 = 
		//회색공의  반지름(Ball_SIZE/2)과 빨간공의  빨간공의 반지름(b.size/2)보다 같거나 작으면 true반환 / 아니면 false
		
		
		return result;
	}

	public void paint(Graphics g) {
		g.drawString("Number of balls :" + balls.size(), 20, 50);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
		g.setColor(Color.RED);
		int size = balls.size();
		for (int i = 0; i < size; i++) {
			Ball b = (Ball) balls.get(i);
			g.fillOval(b.x, b.y, b.size, b.size);
		}
	}

	class BallGenerator extends Thread {
		public void run() {
			while (isPlaying) {
				if(Thread.interrupted()) {
					break;
				}
				int x = (int) (Math.random() * (RIGHT - LEFT - Ball.MAX_SIZE)) + LEFT;
				int y = (int) (Math.random() * (BOTTOM - TOP - Ball.MAX_SIZE)) + TOP;
				balls.add(new Ball(x, y));
				try {
					Thread.sleep(3 * 1000);
				} catch (Exception e) {
				}
			}

		} // run()
	}

	class Ball {
		int x = 100;
		int y = 100;
		int size = 30;
		static final int MAX_SIZE = 30;
		static final int MIN_SIZE = 10;
		final int SPEED = 5;
		int xStep = SPEED;
		int yStep = SPEED;

		Ball(int x, int y) {
			this(x, y, (int) (Math.random() * (MAX_SIZE - MIN_SIZE)) + MIN_SIZE);
		}

		Ball(int x, int y, int size) {
			this.x = x;
			this.y = y;
			this.size = size;
		}
	}
} // class BouncingBall

class Exercise13_11 {
	public static void main(String[] args) {
		new BouncingBall4("Bouncing Ball").start();
	}
}
