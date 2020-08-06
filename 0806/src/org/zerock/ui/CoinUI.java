package org.zerock.ui;

import java.util.Scanner;

import org.zerock.service.CoinService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CoinUI {

	private Scanner sc;
	private CoinService coinService;

	
	public int insertCoins() {
		
		
		System.out.println("동전을 넣으세요");
		int amount = Integer.parseInt(sc.nextLine());
		
		int total = coinService.trade(amount);
		
		return total;

		// CoinService를 이용해서 금액을 처리하고 현재 얼마인지 파악

	}
	public void cal(int price) {
		coinService.pay(price);
	}
	
	public int balance() {
		
		int money = coinService.getTotal();
		return money;
		
	}
	
	

}
