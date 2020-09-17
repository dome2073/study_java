
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

class BouncingBall2 extends Frame {
	final int BALL_SIZE = 20;
	final int FRAME_WIDTH = 400;
	final int FRAME_HEIGHT = 300;
	final int TOP;
	final int BOTTOM;
	final int LEFT;
	final int RIGHT;
	ArrayList balls = new ArrayList();

	BouncingBall2(String title) {
		super(title);
		setBounds(300, 200, FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setVisible(true);
		Insets insets = getInsets();
		TOP = insets.top;
		LEFT = insets.left;
		BOTTOM = FRAME_HEIGHT - insets.bottom;
		RIGHT = FRAME_WIDTH - insets.right;
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	void start() {
		new BallGenerator().start(); //-> run
		
		while (true) {
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
			}
			repaint();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	} // start()

	public void paint(Graphics g) {
		g.drawString("Number of balls :" + balls.size(), 20, 50);
		g.setColor(Color.RED);
		int size = balls.size();
		for (int i = 0; i < size; i++) {
			Ball b = (Ball) balls.get(i);
			g.fillOval(b.x, b.y, Ball.SIZE, Ball.SIZE);
		}
	}

	class BallGenerator extends Thread {
		public void run() {
			/*
			 * (2) . 아래의 로직에 맞게 코드를 작성하시오 
			 * 1. 3 Frame balls . 초마다 의 임의의 위치에 공을 생성해서 에 추가한다 */
			
			 while(true) {
				 Ball ball = new Ball(50,50);
				 balls.add(ball);
				 try {
					 
					 sleep(3000);
					 
				 } catch (InterruptedException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
				 }
			 }
			 
		} // run()
	}

	class Ball {
		int x = 100;
		int y = 100;
		static final int SIZE = 30;
		final int SPEED = 5;
		int xStep = SPEED;
		int yStep = SPEED;

		Ball(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
} // class BouncingBall

class Exercise13_9 {
	public static void main(String[] args) {
		new BouncingBall2("Bouncing Ball").start();
	}
}