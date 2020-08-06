package org.zerock.service;

public interface CoinService {
	
	//µ· ±³È¯
	int trade(int amount);
	
	int pay(int price);

	int getTotal();
}
