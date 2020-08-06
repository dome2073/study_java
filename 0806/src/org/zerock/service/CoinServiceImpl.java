package org.zerock.service;

public class CoinServiceImpl implements CoinService {
	
	private int total;
	
	@Override
	public int trade(int amount) {
		
		//현재 금액이 얼마인지 필요
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
