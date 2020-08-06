package org.zerock.ui;

import java.util.List;
import java.util.Scanner;

import org.zerock.domain.Item;
import org.zerock.service.ItemService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ItemUI {
	
	private ItemService itemService;
	
	
	//물건 출력
	//동전부에서 들어올 money
	public void printItem(int money) {
		
		List<Item> itemList = itemService.findByPrice(money);
		
		for(Item item : itemList) {
			System.out.println(item.getNo()+ ":" +item.getName()+" : " + item.getPrice());
		}
	}


	public Item printOne(int no) {
		// TODO Auto-generated method stub
		return itemService.getItem(no);
	}
	

}
