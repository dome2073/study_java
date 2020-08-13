package org.zerock.th1;

public class ThreadEx1 {
	public static void main(String[] args) {
		
		new Thread(() ->{
			for (int i = 100; i < 200; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(100); //cpu에 점유중인것을 몇초동안 잠시 놓는다
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
		).start(); //시동 ... start()-> run()
		
		
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
		).start(); //시동 ... start()-> run()
		
		
		
		//중간이 끼어드는 시점이 다름
		System.out.print(Thread.currentThread().getName());
	}
}
