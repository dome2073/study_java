package org.zerock.th1;

public class ThreadEx1 {
	public static void main(String[] args) {
		
		new Thread(() ->{
			for (int i = 100; i < 200; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(100); //cpu�� �������ΰ��� ���ʵ��� ��� ���´�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
		).start(); //�õ� ... start()-> run()
		
		
		new Thread(() ->{
			for (int i = 500; i < 600; i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
		).start(); //�õ� ... start()-> run()
		
		
		
		//�߰��� ������ ������ �ٸ�
		System.out.print(Thread.currentThread().getName());
	}
}
