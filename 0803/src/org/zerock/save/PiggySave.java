package org.zerock.save;

//��������
public class PiggySave {
	
	private int total;
	
	public void deposit(int money) {
		this.total += money;
	}
	
	public int withdraw() {
		int result = total;
		
		total = 0;
		return result;
	}
}