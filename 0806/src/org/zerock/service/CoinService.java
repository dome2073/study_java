package org.zerock.service;

public interface CoinService {
	
	//�� ��ȯ
	int trade(int amount);
	
	int pay(int price);

	int getTotal();
}
