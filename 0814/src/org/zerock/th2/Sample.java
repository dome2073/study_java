package org.zerock.th2;

//객체는 1개인데 쓰레드가 여러개인경우
public class Sample implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		doA();

	}

	public void doA() {
		for (int i = 0; i < 100; i++) {

			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 쓰레드 --- 객체라고 보지말것
		// start -> run()// run은
		// 데몬스레드
	}
}
