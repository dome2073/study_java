import java.awt.Frame;
import java.text.SimpleDateFormat;

public class Exercise13_4 {
	public static void main(String[] args) {
		SimpleDateFormat ss = new SimpleDateFormat("HH:mm:ssa");
		
		System.out.println();
	
		Frame f = new Frame();
		f.setSize(400, 0);
		f.setVisible(true);
		
		//1초마다 타이틀을 바꾼다.
		
		new Thread(()->{
			while(true) {
				
				f.setTitle(ss.format(System.currentTimeMillis()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		
	}
}

