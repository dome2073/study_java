package org.zerock.service;

public class CoinServiceImpl implements CoinService {
	
	private int total;
	
	@Override
	public int trade(int amount) {
		
		//���� �ݾ��� ������ �ʿ�
		total += amount;
		
		return total;
	}
	
	public int pay(int price) {
		total -= price;
		return price;
		
	}

	public int getTotal() {
		
		int total = this.total;
		this.total = 0;
		return total;
	}
	

}
