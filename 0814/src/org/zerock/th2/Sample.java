package org.zerock.th2;

//��ü�� 1���ε� �����尡 �������ΰ��
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

		// ������ --- ��ü��� ��������
		// start -> run()// run��
		// ���󽺷���
	}
}
