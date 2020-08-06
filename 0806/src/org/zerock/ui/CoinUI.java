package org.zerock.ui;

import java.util.Scanner;

import org.zerock.service.CoinService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CoinUI {

	private Scanner sc;
	private CoinService coinService;

	
	public int insertCoins() {
		
		
		System.out.println("������ ��������");
		int amount = Integer.parseInt(sc.nextLine());
		
		int total = coinService.trade(amount);
		
		return total;

		// CoinService�� �̿��ؼ� �ݾ��� ó���ϰ� ���� ������ �ľ�

	}
	public void cal(int price) {
		coinService.pay(price);
	}
	
	public int balance() {
		
		int money = coinService.getTotal();
		return money;
		
	}
	
	

}
