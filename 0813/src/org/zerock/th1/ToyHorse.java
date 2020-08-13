package org.zerock.th1;

//말 4마리가 동시에 달리고싶어 ---extends Thread
//임계구역의 객체 --- extends Thread
public class ToyHorse extends Thread{
	private String name;
	private int pos;
	
	public ToyHorse(String name) {
		
		this.name = name;
		this.pos = 0;
	
	}
	
	//run = 쓰레드가 지나가는 길
	// 실이 가면서 gallop이라는 작업을 하고싶다.
	// 임계구역의 동작 --run
	@Override
	public void run() {
		gallop();
		
	}

	public void gallop() {
		//끼어들수없게 gallop에서 100번
		for (int i = 0; i < 100; i++) {
			
			this.pos += (int) (Math.random() * 10);
			//System.out.println(this);
			int count =  this.pos/10;
			
			//멀티스레드는 늘 공유자원이므로 
			synchronized (System.out) {
				for(int j =0; j< count; j++) {

					System.out.print(".");
				}
				System.out.println(this);
			}
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public String toString() {
		return "ToyHorse [name=" + name + ", pos=" + pos + "]";
	}
	
	
	
}
