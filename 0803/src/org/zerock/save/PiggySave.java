package org.zerock.save;

//로직설계
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