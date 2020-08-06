package org.zerock.ui;

import java.util.Scanner;

import org.zerock.domain.Item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainUI {
	
	private CoinUI coinUI;
	private ItemUI itemUI;
	private Scanner sc;

	public void sellItem() {
		
			int total;

			System.out.println("1.음료구매 2.돈 넣기 3.종료");
			
			int cho = Integer.parseInt(sc.nextLine());
			//음료구매
			if(cho == 1) {
				
				//동전을 넣으세요
				total = coinUI.insertCoins();
				//제품출력
				itemUI.printItem(total);
				
				if(total >= 600 ) {
					//음료구매
					System.out.println("구매하실 제품 번호를 입력하세요");
					
					int byitem = Integer.parseInt(sc.nextLine());
					
					//선택한 음료 출력
					Item item = itemUI.printOne(byitem);
					System.out.println("선택한 음료는 " + item.getName() +"입니다." +item.getPrice()+"만큼 차감합니다." );
					
					//차감하는 메서드
					coinUI.cal(item.getPrice());
				}else {
					System.out.println("돈이 부족합니다.");
					coinUI.insertCoins();
				}				
			}else if(cho ==2) {
				
				total = coinUI.insertCoins();
				
			}else {
				System.out.println("반환금액 : "+coinUI.balance());
				return;
			}
			
			sellItem();
		}

}
