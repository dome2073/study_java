package org.zerock.th2;

public class SampleMain {
	public static void main(String[] args) {
		
		//Ÿ������ ���� ����
		Runnable  sample = new Sample();
		
		//
		for(int i =0; i< 5; i++) {
			
			new Thread(sample).start();
		}
	}
}
